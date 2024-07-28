package com.bugever.trash;

import com.intellij.openapi.actionSystem.ActionUpdateThread;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.CommonDataKeys;
import com.intellij.openapi.actionSystem.DataContext;
import com.intellij.openapi.project.DumbAwareAction;
import com.intellij.openapi.ui.Messages;
import com.intellij.openapi.vfs.VirtualFile;
import org.jetbrains.annotations.NotNull;

import java.awt.*;

public class TrashAction extends DumbAwareAction {

    @Override
    public @NotNull ActionUpdateThread getActionUpdateThread() {
        return ActionUpdateThread.BGT;
    }

    @Override
    public void actionPerformed(@NotNull AnActionEvent event) {
        DataContext dataContext = event.getDataContext();

        final VirtualFile[] files = CommonDataKeys.VIRTUAL_FILE_ARRAY.getData(dataContext);

        if (files == null || files.length == 0) return;

        for (VirtualFile file : files) {
            try {
                Desktop.getDesktop().moveToTrash(file.toNioPath().toFile());
            } catch (Exception e) {
                Messages.showMessageDialog(
                        event.getProject(),
                        "Failed to send the file " + file.getPath() + " to the Trash. Exception: " + e.getClass().getName() + " " + e.getMessage(),
                        "Failed to Remove the File",
                        Messages.getInformationIcon());
            }
        }

        try {
            Thread.sleep(500L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        for (VirtualFile file : files) {
            file.refresh(true, true);
        }
    }
}

Trash
===

IntelliJ IDEA plugin to move the selected file(s) or folder(s) into the Trash.

# Background

I have used IntelliJ IDEA for a long time.
It is a great IDE for developers providing
brilliant features on refactoring and context awareness.

However, what always confuses me is that
It has never provided a way to move files or folders
into the Trash of the operating system,
which is a common feature of other IDEs.

I guess that it is because IntelliJ IDEA is not designed
to be dependent on a specific operating system
like Mac OS X or Windows.

So I wrote this plugin to provide this feature.
At least it is useful for me.

# Prerequisites

JDK 17+

# Usage

1. Search for `Trash` in the plugin marketplace.
2. Install the plugin.
3. Now you can right-click on file(s) or folder(s)
   and click the menu item `Trash...` to move them to the Trash.
   **Note that it will skip usage searching so make sure
   that what you are removing is unused anywhere,
   or you'll have to recover it from the Trash manually.**

# Development

1. Modify the code.
2. Click 'Run Plugin' to test it.
3. Execute gradle task `buildPlugin` to build the plugin.
4. Contact me to publish the plugin.

# Support

[unrealwalker@126.com](mailto:unrealwalker@126.com)

# Roadmap

* 2024-08-13 1.0.1 Adding the license and modifying some descriptions
* 2024-08-01 1.0.0 Release the first version
* 2024-07-21 1.0-SNAPSHOT

# Contributing

Contact me to contribute.

# Authors and acknowledgment

Mergen [unrealwalker@126.com](mailto:unrealwalker@126.com)

# License

MIT licensed

# Project status

1.0.1 Released

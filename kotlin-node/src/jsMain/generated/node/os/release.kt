// Automatically generated - do not modify!

@file:JsModule("node:os")

package node.os

/**
 * Returns the operating system as a string.
 *
 * On POSIX systems, the operating system release is determined by calling [`uname(3)`](https://linux.die.net/man/3/uname). On Windows, `GetVersionExW()` is used. See
 * [https://en.wikipedia.org/wiki/Uname#Examples](https://en.wikipedia.org/wiki/Uname#Examples) for more information.
 * @since v0.3.3
 */
external fun release(): String

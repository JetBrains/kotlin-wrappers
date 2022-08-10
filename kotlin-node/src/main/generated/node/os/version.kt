// Automatically generated - do not modify!

@file:JsModule("node:os")
@file:JsNonModule

package node.os

/**
 * Returns a string identifying the kernel version.
 *
 * On POSIX systems, the operating system release is determined by calling [`uname(3)`](https://linux.die.net/man/3/uname). On Windows, `RtlGetVersion()` is used, and if it is not
 * available, `GetVersionExW()` will be used. See [https://en.wikipedia.org/wiki/Uname#Examples](https://en.wikipedia.org/wiki/Uname#Examples) for more information.
 * @since v13.11.0, v12.17.0
 */
external fun version(): String

// Automatically generated - do not modify!

@file:JsModule("node:os")

package node.os

/**
 * Returns the machine type as a string, such as arm, aarch64, mips, mips64, ppc64, ppc64le, s390, s390x, i386, i686, x86_64.
 *
 * On POSIX systems, the machine type is determined by calling [`uname(3)`](https://linux.die.net/man/3/uname).
 * On Windows, `RtlGetVersion()` is used, and if it is not available, `GetVersionExW()` will be used.
 * See [https://en.wikipedia.org/wiki/Uname#Examples](https://en.wikipedia.org/wiki/Uname#Examples) for more information.
 * @since v18.9.0
 */
external fun machine(): String

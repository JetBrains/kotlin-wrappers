// Automatically generated - do not modify!

@file:JsModule("node:os")
@file:JsNonModule

package node.os

/**
 * Returns a string identifying the operating system platform for which
 * the Node.js binary was compiled. The value is set at compile time.
 * Possible values are `'aix'`, `'darwin'`, `'freebsd'`,`'linux'`,`'openbsd'`, `'sunos'`, and `'win32'`.
 *
 * The return value is equivalent to `process.platform`.
 *
 * The value `'android'` may also be returned if Node.js is built on the Android
 * operating system. [Android support is experimental](https://github.com/nodejs/node/blob/HEAD/BUILDING.md#androidandroid-based-devices-eg-firefox-os).
 * @since v0.5.0
 */
external fun platform(): node.process.Platform

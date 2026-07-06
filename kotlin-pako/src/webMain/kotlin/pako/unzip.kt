@file:JsModule("pako")

package pako

import js.buffer.ArrayBuffer
import js.typedarrays.Uint8Array

/**
 * Just shortcut to inflate, because it autodetects format by header.content. Done for convenience.
 */
external fun ungzip(
    data: Uint8Array<*>,
    options: InflateOptions = definedExternally,
): Uint8Array<ArrayBuffer>

/**
 * Just shortcut to inflate, because it autodetects format by header.content. Done for convenience.
 */
external fun ungzip(
    data: ArrayBuffer,
    options: InflateOptions = definedExternally,
): Uint8Array<ArrayBuffer>

/**
 * Just shortcut to inflate, because it autodetects format by header.content. Done for convenience.
 */
external fun ungzip(
    data: Uint8Array<*>,
    options: InflateToStringOptions,
): String

/**
 * Just shortcut to inflate, because it autodetects format by header.content. Done for convenience.
 */
external fun ungzip(
    data: ArrayBuffer,
    options: InflateToStringOptions,
): String

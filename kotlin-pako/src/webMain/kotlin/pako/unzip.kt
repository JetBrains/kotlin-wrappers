@file:JsModule("pako")

package pako

import js.buffer.ArrayBuffer
import js.typedarrays.Uint8Array
import kotlin.js.JsModule
import kotlin.js.definedExternally

/**
 * Just shortcut to inflate, because it autodetects format by header.content. Done for convenience.
 */
external fun unzip(
    data: Uint8Array<*>,
    options: InflateOptions = definedExternally,
): Uint8Array<ArrayBuffer>

/**
 * Just shortcut to inflate, because it autodetects format by header.content. Done for convenience.
 */
external fun unzip(
    data: ArrayBuffer,
    options: InflateOptions = definedExternally,
): Uint8Array<ArrayBuffer>

/**
 * Just shortcut to inflate, because it autodetects format by header.content. Done for convenience.
 */
external fun unzip(
    data: Uint8Array<*>,
    options: InflateToStringOptions,
): String

/**
 * Just shortcut to inflate, because it autodetects format by header.content. Done for convenience.
 */
external fun unzip(
    data: ArrayBuffer,
    options: InflateToStringOptions,
): String

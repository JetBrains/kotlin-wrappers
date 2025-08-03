@file:JsModule("pako")

package pako

import js.buffer.ArrayBuffer
import js.typedarrays.Uint8Array
import kotlin.js.JsModule
import kotlin.js.definedExternally

/**
 * Decompress data with inflate/ungzip and options. Autodetect format via wrapper header
 * by default. That's why we don't provide separate ungzip method.
 */
external fun inflate(
    data: Uint8Array<*>,
    options: InflateOptions = definedExternally,
): Uint8Array<ArrayBuffer>

/**
 * Decompress data with inflate/ungzip and options. Autodetect format via wrapper header
 * by default. That's why we don't provide separate ungzip method.
 */
external fun inflate(
    data: ArrayBuffer,
    options: InflateOptions = definedExternally,
): Uint8Array<ArrayBuffer>

/**
 * Decompress data with inflate/ungzip and options. Autodetect format via wrapper header
 * by default. That's why we don't provide separate ungzip method.
 */
external fun inflate(
    data: Uint8Array<*>,
    options: InflateToStringOptions,
): String

/**
 * Decompress data with inflate/ungzip and options. Autodetect format via wrapper header
 * by default. That's why we don't provide separate ungzip method.
 */
external fun inflate(
    data: ArrayBuffer,
    options: InflateToStringOptions,
): String

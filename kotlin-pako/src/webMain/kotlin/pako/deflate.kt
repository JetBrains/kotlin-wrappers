@file:JsModule("pako")

package pako

import js.buffer.ArrayBuffer
import js.typedarrays.Uint8Array

/**
 * Compress data with deflate algorithm and options.
 */
external fun deflate(
    data: Uint8Array<*>,
    options: DeflateOptions = definedExternally,
): Uint8Array<ArrayBuffer>

/**
 * Compress data with deflate algorithm and options.
 */
external fun deflate(
    data: ArrayBuffer,
    options: DeflateOptions = definedExternally,
): Uint8Array<ArrayBuffer>

/**
 * Compress data with deflate algorithm and options.
 */
external fun deflate(
    data: String,
    options: DeflateOptions = definedExternally,
): Uint8Array<ArrayBuffer>

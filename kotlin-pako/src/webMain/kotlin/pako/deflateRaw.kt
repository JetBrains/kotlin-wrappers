@file:JsModule("pako")

package pako

import js.buffer.ArrayBuffer
import js.typedarrays.Uint8Array
import kotlin.js.JsModule
import kotlin.js.definedExternally

/**
 * The same as deflate, but creates raw data, without wrapper (header and adler32 crc).
 */
external fun deflateRaw(
    data: Uint8Array<*>,
    options: DeflateOptions = definedExternally,
): Uint8Array<ArrayBuffer>

/**
 * The same as deflate, but creates raw data, without wrapper (header and adler32 crc).
 */
external fun deflateRaw(
    data: ArrayBuffer,
    options: DeflateOptions = definedExternally,
): Uint8Array<ArrayBuffer>

/**
 * The same as deflate, but creates raw data, without wrapper (header and adler32 crc).
 */
external fun deflateRaw(
    data: String,
    options: DeflateOptions = definedExternally,
): Uint8Array<ArrayBuffer>

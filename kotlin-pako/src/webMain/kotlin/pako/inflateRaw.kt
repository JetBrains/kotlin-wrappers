@file:JsModule("pako")

package pako

import js.buffer.ArrayBuffer
import js.typedarrays.Uint8Array
import kotlin.js.JsModule
import kotlin.js.definedExternally

/**
 * The same as inflate, but creates raw data, without wrapper (header and adler32 crc).
 */
external fun inflateRaw(
    data: Uint8Array<*>,
    options: InflateOptions = definedExternally,
): Uint8Array<ArrayBuffer>

/**
 * The same as inflate, but creates raw data, without wrapper (header and adler32 crc).
 */
external fun inflateRaw(
    data: ArrayBuffer,
    options: InflateOptions = definedExternally,
): Uint8Array<ArrayBuffer>

/**
 * The same as inflate, but creates raw data, without wrapper (header and adler32 crc).
 */
external fun inflateRaw(
    data: Uint8Array<*>,
    options: InflateToStringOptions,
): String

/**
 * The same as inflate, but creates raw data, without wrapper (header and adler32 crc).
 */
external fun inflateRaw(
    data: ArrayBuffer,
    options: InflateToStringOptions,
): String

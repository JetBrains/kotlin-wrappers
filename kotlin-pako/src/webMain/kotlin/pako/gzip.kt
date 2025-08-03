@file:JsModule("pako")

package pako

import js.buffer.ArrayBuffer
import js.typedarrays.Uint8Array
import kotlin.js.JsModule
import kotlin.js.definedExternally

/**
 * The same as deflate, but create gzip wrapper instead of deflate one.
 */
external fun gzip(
    data: Uint8Array<*>,
    options: DeflateOptions = definedExternally,
): Uint8Array<ArrayBuffer>

/**
 * The same as deflate, but create gzip wrapper instead of deflate one.
 */
external fun gzip(
    data: ArrayBuffer,
    options: DeflateOptions = definedExternally,
): Uint8Array<ArrayBuffer>

/**
 * The same as deflate, but create gzip wrapper instead of deflate one.
 */
external fun gzip(
    data: String,
    options: DeflateOptions = definedExternally,
): Uint8Array<ArrayBuffer>

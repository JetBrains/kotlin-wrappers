// Automatically generated - do not modify!

@file:JsModule("@cesium/core")

package cesium.core

import js.typedarrays.Uint8Array

/**
 * Reads a string from a Uint8Array.
 * @param [uint8Array] The Uint8Array to read from.
 * @param [byteOffset] The byte offset to start reading from.
 *   Default value - `0`
 * @param [byteLength] The byte length to read. If byteLength is omitted the remainder of the buffer is read.
 * @return The string.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/global.html#getStringFromTypedArray">Online Documentation</a>
 */
external fun getStringFromTypedArray(
    uint8Array: Uint8Array<*>,
    byteOffset: Int? = definedExternally,
    byteLength: Int? = definedExternally,
): String

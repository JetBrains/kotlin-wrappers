// Automatically generated - do not modify!

@file:JsModule("@cesium/core")

package cesium.core

import js.typedarrays.Uint8Array

/**
 * Parses JSON from a Uint8Array.
 * @param [uint8Array] The Uint8Array to read from.
 * @param [byteOffset] The byte offset to start reading from.
 *   Default value - `0`
 * @param [byteLength] The byte length to read. If byteLength is omitted the remainder of the buffer is read.
 * @return An object containing the parsed JSON.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/global.html#getJsonFromTypedArray">Online Documentation</a>
 */
external fun getJsonFromTypedArray(
    uint8Array: Uint8Array<*>,
    byteOffset: Int? = definedExternally,
    byteLength: Int? = definedExternally,
): JsAny

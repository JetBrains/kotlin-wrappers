// Automatically generated - do not modify!

package cesium.engine

import js.buffer.DataView
import js.core.JsAny

/**
 * Reads and returns a value with the given type
 * at the given byte offset from the data view, in little-endian
 * order
 * @param [dataView] Typed data view into a binary buffer
 * @param [byteOffset] The offset, in bytes, from the start of the view to read the data from
 */
typealias ComponentReaderCallback = (
    dataView: DataView<*>,
    byteOffset: Int,
) -> JsAny /* number | bigint */

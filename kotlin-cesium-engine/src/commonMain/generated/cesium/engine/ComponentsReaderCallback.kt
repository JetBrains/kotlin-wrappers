// Automatically generated - do not modify!

package cesium.engine

import js.array.ReadonlyArray
import js.buffer.DataView

/**
 * Reads and returns a value with the given type
 * at the given byte offset from the data view, in little-endian
 * order
 * @param [dataView] Typed data view into a binary buffer
 * @param [byteOffset] The offset, in bytes, from the start of the view to read the data from
 * @param [numberOfComponents] The number of components to read
 * @param [result] The array in which to read the result
 */
typealias ComponentsReaderCallback = (dataView: DataView<*>, byteOffset: Int, numberOfComponents: Int, result: ReadonlyArray<Double>) -> Unit

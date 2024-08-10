// Generated by Karakum - do not modify it manually!

@file:JsModule("node:v8")

package node.v8

import js.buffer.ArrayBuffer

/**
 * @since v8.0.0
 */
open external class Deserializer {
    constructor (data: js.typedarrays.TypedArray<*, *>)

    /**
     * Reads and validates a header (including the format version).
     * May, for example, reject an invalid or unsupported wire format. In that case,
     * an `Error` is thrown.
     */
    fun readHeader(): Boolean

    /**
     * Deserializes a JavaScript value from the buffer and returns it.
     */
    fun readValue(): Any?

    /**
     * Marks an `ArrayBuffer` as having its contents transferred out of band.
     * Pass the corresponding `ArrayBuffer` in the serializing context to `serializer.transferArrayBuffer()` (or return the `id` from `serializer._getSharedArrayBufferId()` in the case of
     * `SharedArrayBuffer`s).
     * @param id A 32-bit unsigned integer.
     * @param arrayBuffer An `ArrayBuffer` instance.
     */
    fun transferArrayBuffer(id: Number, arrayBuffer: ArrayBuffer): Unit

    /**
     * Reads the underlying wire format version. Likely mostly to be useful to
     * legacy code reading old wire format versions. May not be called before `.readHeader()`.
     */
    fun getWireFormatVersion(): Double

    /**
     * Read a raw 32-bit unsigned integer and return it.
     * For use inside of a custom `deserializer._readHostObject()`.
     */
    fun readUint32(): Double

    /**
     * Read a raw 64-bit unsigned integer and return it as an array `[hi, lo]` with two 32-bit unsigned integer entries.
     * For use inside of a custom `deserializer._readHostObject()`.
     */
    fun readUint64(): js.array.JsTuple2<Double, Double>

    /**
     * Read a JS `number` value.
     * For use inside of a custom `deserializer._readHostObject()`.
     */
    fun readDouble(): Double

    /**
     * Read raw bytes from the deserializer's internal buffer. The `length` parameter
     * must correspond to the length of the buffer that was passed to `serializer.writeRawBytes()`.
     * For use inside of a custom `deserializer._readHostObject()`.
     */
    fun readRawBytes(length: Number): node.buffer.Buffer
}

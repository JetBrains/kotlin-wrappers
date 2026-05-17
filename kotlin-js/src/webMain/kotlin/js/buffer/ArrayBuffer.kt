package js.buffer

import js.serialization.Serializable
import js.serialization.Transferable

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/ArrayBuffer)
 */
open external class ArrayBuffer(
    /**
     * Read-only. The length of the ArrayBuffer (in bytes).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/ArrayBuffer/byteLength)
     */
    override val byteLength: Int,
    options: ArrayBufferOptions? = definedExternally,
) : ArrayBufferLike,
    BufferSource,
    Serializable,
    Transferable {
    /**
     * Returns a section of an ArrayBuffer.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/ArrayBuffer/slice)
     */
    override fun slice(
        begin: Int,
        end: Int,
    ): ArrayBuffer

    /**
     * If this ArrayBuffer is resizable, returns the maximum byte length given during construction; returns the byte length if not.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/ArrayBuffer/maxByteLength)
     */
    override val maxByteLength: Int

    /**
     * Returns true if this ArrayBuffer can be resized.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/ArrayBuffer/resizable)
     */
    val resizable: Boolean

    /**
     * Resizes the ArrayBuffer to the specified size (in bytes).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/ArrayBuffer/resize)
     */
    fun resize(
        newByteLength: Int,
    )

    /**
     * Returns a boolean indicating whether or not this buffer has been detached (transferred).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/ArrayBuffer/detached)
     */
    val detached: Boolean

    /**
     * Creates a new ArrayBuffer with the same byte content as this buffer, then detaches this buffer.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/ArrayBuffer/transfer)
     */
    fun transfer(
        newByteLength: Int,
    ): ArrayBuffer

    /**
     * Creates a new non-resizable ArrayBuffer with the same byte content as this buffer, then detaches this buffer.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/ArrayBuffer/transferToFixedLength)
     */
    fun transferToFixedLength(
        newByteLength: Int,
    ): ArrayBuffer

    companion object {
        /**
         * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/ArrayBuffer/isView)
         */
        fun isView(value: JsAny?): Boolean
    }
}

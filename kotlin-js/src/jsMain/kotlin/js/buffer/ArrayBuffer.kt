@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package js.buffer

import js.transferable.Transferable

external class ArrayBuffer(
    /**
     * Read-only. The length of the ArrayBuffer (in bytes).
     */
    override val byteLength: Int,
    options: ArrayBufferOptions? = definedExternally,
) : ArrayBufferLike,
    BufferSource,
    Transferable {
    /**
     * Returns a section of an ArrayBuffer.
     */
    override fun slice(
        begin: Int,
        end: Int,
    ): ArrayBuffer

    /**
     * If this ArrayBuffer is resizable, returns the maximum byte length given during construction; returns the byte length if not.
     *
     * [MDN](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/ArrayBuffer/maxByteLength)
     */
    override val maxByteLength: Int

    /**
     * Returns true if this ArrayBuffer can be resized.
     *
     * [MDN](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/ArrayBuffer/resizable)
     */
    val resizable: Boolean

    /**
     * Resizes the ArrayBuffer to the specified size (in bytes).
     *
     * [MDN](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/ArrayBuffer/resize)
     */
    fun resize(
        newByteLength: Int,
    )

    /**
     * Returns a boolean indicating whether or not this buffer has been detached (transferred).
     *
     * [MDN](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/ArrayBuffer/detached)
     */
    val detached: Boolean

    /**
     * Creates a new ArrayBuffer with the same byte content as this buffer, then detaches this buffer.
     *
     * [MDN](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/ArrayBuffer/transfer)
     */
    fun transfer(
        newByteLength: Int,
    ): ArrayBuffer

    /**
     * Creates a new non-resizable ArrayBuffer with the same byte content as this buffer, then detaches this buffer.
     *
     * [MDN](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/ArrayBuffer/transferToFixedLength)
     */
    fun transferToFixedLength(
        newByteLength: Int,
    ): ArrayBuffer

    companion object {
        fun isView(value: Any?): Boolean
    }
}

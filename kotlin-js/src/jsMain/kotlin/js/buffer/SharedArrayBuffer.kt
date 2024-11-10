@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package js.buffer

external class SharedArrayBuffer(
    /**
     * Read-only. The length of the SharedArrayBuffer (in bytes).
     */
    override val byteLength: Int,
    options: SharedArrayBufferOptions? = definedExternally,
) : ArrayBufferLike,
    AllowSharedBufferSource {
    /**
     * Returns a section of an SharedArrayBuffer.
     */
    override fun slice(
        begin: Int,
        end: Int,
    ): SharedArrayBuffer

    /**
     * Returns true if this SharedArrayBuffer can be grown.
     *
     * [MDN](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/SharedArrayBuffer/growable)
     */
    val growable: Boolean

    /**
     * If this SharedArrayBuffer is growable, returns the maximum byte length given during construction; returns the byte length if not.
     *
     * [MDN](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/SharedArrayBuffer/maxByteLength)
     */
    override val maxByteLength: Int

    /**
     * Grows the SharedArrayBuffer to the specified size (in bytes).
     *
     * [MDN](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/SharedArrayBuffer/grow)
     */
    fun grow(
        newByteLength: Int,
    )
}

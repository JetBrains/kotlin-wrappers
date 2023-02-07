@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package js.buffer

external class SharedArrayBuffer(
    override val byteLength: Int,
) : ArrayBufferLike,
    BufferSource {
    override fun slice(
        begin: Int,
        end: Int,
    ): SharedArrayBuffer
}

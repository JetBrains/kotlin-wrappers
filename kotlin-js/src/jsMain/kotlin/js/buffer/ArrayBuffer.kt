@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package js.buffer

external class ArrayBuffer(
    override val byteLength: Int,
) : ArrayBufferLike,
    BufferSource {
    override fun slice(
        begin: Int,
        end: Int,
    ): ArrayBuffer

    companion object {
        fun isView(value: Any?): Boolean
    }
}

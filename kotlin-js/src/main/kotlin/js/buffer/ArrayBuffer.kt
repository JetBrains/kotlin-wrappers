@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package js.buffer

external class ArrayBuffer(
    val byteLength: Int,
) : BufferSource {
    fun slice(
        begin: Int,
        end: Int = definedExternally,
    ): ArrayBuffer

    companion object {
        fun isView(value: Any?): Boolean
    }
}

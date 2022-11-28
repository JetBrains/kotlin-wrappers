package js.buffer

external class ArrayBuffer(
    byteLength: Int,
) : BufferSource {
    val byteLength: Int
    fun slice(
        begin: Int,
        end: Int = definedExternally,
    ): ArrayBuffer

    companion object {
        fun isView(value: Any?): Boolean
    }
}

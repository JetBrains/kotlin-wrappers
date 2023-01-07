@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package js.buffer

external class SharedArrayBuffer(
    val byteLength: Int,
) : ArrayBufferLike,
    BufferSource {
    fun slice(
        begin: Int,
        end: Int = definedExternally,
    ): SharedArrayBuffer
}

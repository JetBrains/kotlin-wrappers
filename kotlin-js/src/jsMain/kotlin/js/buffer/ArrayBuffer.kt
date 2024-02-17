@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package js.buffer

import js.transferable.Transferable

external class ArrayBuffer(
    override val byteLength: Int,
) : ArrayBufferLike,
    BufferSource,
    Transferable {
    override fun slice(
        begin: Int,
        end: Int,
    ): ArrayBuffer

    companion object {
        fun isView(value: Any?): Boolean
    }
}

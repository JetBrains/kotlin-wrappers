package js.buffer

import kotlin.js.definedExternally

sealed external interface ArrayBufferLike {
    val byteLength: Int
    val maxByteLength: Int

    fun slice(
        begin: Int,
        end: Int = definedExternally,
    ): ArrayBufferLike
}

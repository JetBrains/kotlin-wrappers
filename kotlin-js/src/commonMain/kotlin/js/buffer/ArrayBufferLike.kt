package js.buffer

import kotlin.js.definedExternally as definedExternally_

sealed external interface ArrayBufferLike {
    val byteLength: Int
    val maxByteLength: Int

    fun slice(
        begin: Int,
        end: Int = definedExternally_,
    ): ArrayBufferLike
}

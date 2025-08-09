package js.buffer

import js.typedarrays.Int8Array
import js.typedarrays.toByteArray
import kotlin.js.definedExternally

sealed external interface ArrayBufferLike {
    val byteLength: Int
    val maxByteLength: Int

    fun slice(
        begin: Int,
        end: Int = definedExternally,
    ): ArrayBufferLike
}

fun ArrayBufferLike.toByteArray(): ByteArray =
    Int8Array(this).toByteArray()

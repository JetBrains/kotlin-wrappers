package js.buffer

sealed external interface ArrayBufferLike {
    val byteLength: Int
    val maxByteLength: Int

    fun slice(
        begin: Int,
        end: Int = definedExternally,
    ): ArrayBufferLike
}

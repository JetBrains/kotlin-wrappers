package js.buffer

external interface ArrayBufferView<out B : ArrayBufferLike> :
    BufferSource {
    val buffer: B
    val byteOffset: Int
    val byteLength: Int
}

package js.buffer

external interface ArrayBufferView<B: ArrayBufferLike> :
    BufferSource {
    val buffer: B
    val byteOffset: Int
    val byteLength: Int
}

package js.buffer

external interface ArrayBufferView : BufferSource {
    val buffer: ArrayBufferLike
    val byteOffset: Int
    val byteLength: Int
}

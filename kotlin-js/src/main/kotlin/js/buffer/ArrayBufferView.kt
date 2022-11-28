package js.buffer

external interface ArrayBufferView : BufferSource {
    val buffer: ArrayBuffer
    val byteOffset: Int
    val byteLength: Int
}

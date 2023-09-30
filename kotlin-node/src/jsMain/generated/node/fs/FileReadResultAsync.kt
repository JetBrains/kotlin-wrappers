package node.fs


sealed external interface FileReadResult<T : js.buffer.ArrayBufferView> {
    var bytesRead: Double
    var buffer: T
}

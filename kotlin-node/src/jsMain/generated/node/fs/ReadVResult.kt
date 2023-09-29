package node.fs


sealed external interface ReadVResult {
    var bytesRead: Double
    var buffers: js.core.ReadonlyArray<js.buffer.ArrayBufferView>
}

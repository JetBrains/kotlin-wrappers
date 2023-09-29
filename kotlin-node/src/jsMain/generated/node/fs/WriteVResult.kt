package node.fs


sealed external interface WriteVResult {
    var bytesWritten: Double
    var buffers: js.core.ReadonlyArray<js.buffer.ArrayBufferView>
}

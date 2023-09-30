package node.fs


sealed external interface FileHandleWriteStringResultPayload {
    var bytesWritten: Double
    var buffer: String
}

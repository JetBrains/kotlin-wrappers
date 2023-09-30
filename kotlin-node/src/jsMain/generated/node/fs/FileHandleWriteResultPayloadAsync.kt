package node.fs

import js.typedarrays.Uint8Array


sealed external interface FileHandleWriteResultPayload<TBuffer : Uint8Array> {
    var bytesWritten: Double
    var buffer: TBuffer
}

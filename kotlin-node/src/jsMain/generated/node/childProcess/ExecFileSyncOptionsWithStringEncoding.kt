package node.childProcess


sealed external interface ExecFileSyncOptionsWithStringEncoding : ExecFileSyncOptions {
    @JsName("encoding")
    var stringEncoding: node.buffer.BufferEncoding
}

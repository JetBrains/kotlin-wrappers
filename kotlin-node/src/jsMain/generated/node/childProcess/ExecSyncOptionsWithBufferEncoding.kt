package node.childProcess


sealed external interface ExecSyncOptionsWithBufferEncoding : ExecSyncOptions {
    @JsName("encoding")
    var bufferEncoding: String /* 'buffer' */?
}

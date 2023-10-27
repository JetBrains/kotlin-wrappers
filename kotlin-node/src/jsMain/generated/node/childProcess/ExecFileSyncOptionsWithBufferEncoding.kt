package node.childProcess


sealed external interface ExecFileSyncOptionsWithBufferEncoding : ExecFileSyncOptions {
    @JsName("encoding")
    var bufferEncoding: String /* 'buffer' */?// specify `null`.

}

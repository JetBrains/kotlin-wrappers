package node.childProcess


sealed external interface SpawnSyncOptionsWithBufferEncoding : SpawnSyncOptions {
    @JsName("encoding")
    var bufferEncoding: String /* 'buffer' */?
}

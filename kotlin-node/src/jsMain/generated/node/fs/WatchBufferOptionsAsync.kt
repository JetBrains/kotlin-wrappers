package node.fs


sealed external interface WatchBufferAsyncOptions : WatchOptions {
    @JsName("encoding")
    var requiredEncoding: String /* 'buffer' */
}

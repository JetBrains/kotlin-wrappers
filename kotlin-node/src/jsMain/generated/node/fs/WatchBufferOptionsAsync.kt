package node.fs


external interface WatchBufferAsyncOptions : WatchOptions {
    @JsName("encoding")
    var requiredEncoding: String /* 'buffer' */
}

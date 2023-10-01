package node.fs


sealed external interface WatchBufferOptions : WatchOptions {
    @JsName("encoding")
    var requiredEncoding: String /* 'buffer' */
}

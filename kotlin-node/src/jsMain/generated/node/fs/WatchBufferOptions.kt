package node.fs


external interface WatchBufferOptions : WatchOptions {
    @JsName("encoding")
    var requiredEncoding: String /* 'buffer' */
}

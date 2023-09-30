package node.fs


sealed external interface ReaddirBufferAsyncOptions {
    var encoding: String /* 'buffer' */
    var withFileTypes: Boolean?
}

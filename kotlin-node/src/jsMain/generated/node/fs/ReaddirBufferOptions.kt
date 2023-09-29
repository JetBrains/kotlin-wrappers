package node.fs


sealed external interface ReaddirBufferOptions {
    var encoding: String /* 'buffer' */
    var withFileTypes: Boolean?
}

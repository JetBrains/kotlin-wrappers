package node.fs


sealed external interface ReaddirSyncBufferOptions {
    var encoding: String /* 'buffer' */
    var withFileTypes: Boolean?
}

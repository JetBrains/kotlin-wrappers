package node.fs


sealed external interface ReaddirSyncStringOptions {
    var encoding: node.buffer.BufferEncoding?
    var withFileTypes: Boolean?
}

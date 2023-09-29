package node.fs


sealed external interface ReaddirStringOptions {
    var encoding: node.buffer.BufferEncoding?
    var withFileTypes: Boolean?
}

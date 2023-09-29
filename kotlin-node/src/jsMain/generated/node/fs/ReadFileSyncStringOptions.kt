package node.fs


sealed external interface ReadFileSyncStringOptions {
    var encoding: node.buffer.BufferEncoding
    var flag: String?
}

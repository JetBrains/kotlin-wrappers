package node.fs


sealed external interface CreateReadStreamOptions {
    var encoding: node.buffer.BufferEncoding?
    var autoClose: Boolean?
    var emitClose: Boolean?
    var start: Double?
    var end: Double?
    var highWaterMark: Double?
}

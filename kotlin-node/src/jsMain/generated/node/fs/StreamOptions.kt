package node.fs


sealed external interface StreamOptions {
    var flags: String?
    var encoding: node.buffer.BufferEncoding?
    var fd: (Any /* number | promises.FileHandle | undefined */)?
    var mode: Double?
    var autoClose: Boolean?

    /**
     * @default false
     */
    var emitClose: Boolean?
    var start: Double?
    var highWaterMark: Double?
}

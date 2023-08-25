// Automatically generated - do not modify!

package node.fs

sealed external interface StreamOptions {
    var flags: String?
    var encoding: node.buffer.BufferEncoding?
    var fd: Any? /* number | promises.FileHandle */
    var mode: Number?
    var autoClose: Boolean?

    /**
     * @default false
     */
    var emitClose: Boolean?
    var start: Number?
    var highWaterMark: Number?
}

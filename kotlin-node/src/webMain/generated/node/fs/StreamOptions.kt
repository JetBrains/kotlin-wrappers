// Automatically generated - do not modify!

package node.fs

@kotlinx.js.JsPlainObject
sealed external interface StreamOptions {
    var flags: String?
    var encoding: node.buffer.BufferEncoding?
    var fd: Any? // number | promises.FileHandle | undefined
    var mode: Double?
    var autoClose: Boolean?
    var emitClose: Boolean?
    var start: Double?
    var signal: web.abort.AbortSignal?
    var highWaterMark: Double?
}

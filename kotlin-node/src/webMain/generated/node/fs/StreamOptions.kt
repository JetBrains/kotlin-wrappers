// Automatically generated - do not modify!

package node.fs

import web.abort.AbortSignal

@js.objects.JsPlainObject
sealed external interface StreamOptions {
    var flags: String?
    var encoding: node.buffer.BufferEncoding?
    var fd: Any? // number | promises.FileHandle | undefined
    var mode: Double?
    var autoClose: Boolean?
    var emitClose: Boolean?
    var start: Double?
    var signal: AbortSignal?
    var highWaterMark: Double?
}

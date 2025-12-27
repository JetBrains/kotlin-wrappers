// Automatically generated - do not modify!

package node.fs

import web.abort.Abortable

@js.objects.JsPlainObject
sealed external interface CreateReadStreamOptions : Abortable {
    var encoding: node.buffer.BufferEncoding?
    var autoClose: Boolean?
    var emitClose: Boolean?
    var start: Double?
    var end: Double?
    var highWaterMark: Double?
}

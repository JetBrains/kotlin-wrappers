// Generated by Karakum - do not modify it manually!

package node.stream

@js.objects.JsPlainObject
sealed external interface DuplexOptions : ReadableOptions, WritableOptions {
    var allowHalfOpen: Boolean?
    var readableObjectMode: Boolean?
    var writableObjectMode: Boolean?
    var readableHighWaterMark: Double?
    var writableHighWaterMark: Double?
    var writableCorked: Double?
    override val construct: ((/* this: Duplex, */ callback: (error: js.errors.JsError? /* use undefined for default */) -> Unit) -> Unit)?
    override val read: ((/* this: Duplex, */ size: Number) -> Unit)?
    override val write: ((/* this: Duplex, */ chunk: Any?, encoding: node.buffer.BufferEncoding, callback: (error: js.errors.JsError? /* use undefined for default */) -> Unit) -> Unit)?
    override val writev: ((/* this: Duplex, */ chunks: Array<WritableOptionsWritevChunksItem>, callback: (error: js.errors.JsError? /* use undefined for default */) -> Unit) -> Unit)?
    override val final: ((/* this: Duplex, */ callback: (error: js.errors.JsError? /* use undefined for default */) -> Unit) -> Unit)?
    override val destroy: ((/* this: Duplex, */ error: js.errors.JsError?, callback: (error: js.errors.JsError? /* use undefined for default */) -> Unit) -> Unit)?
}

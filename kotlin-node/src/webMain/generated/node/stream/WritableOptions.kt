// Automatically generated - do not modify!

package node.stream

@js.objects.JsPlainObject
sealed external interface WritableOptions<T : Writable /* default is Writable */> : StreamOptions<T> {
    var decodeStrings: Boolean?
    var defaultEncoding: node.buffer.BufferEncoding?
    var write: (
        (
        // this: T,
        chunk: Any?,
        encoding: node.buffer.BufferEncoding,
        callback: (error: js.errors.JsError? /* use undefined for default */) -> Unit,
    ) -> Unit
    )?
    var writev: (
        (
        // this: T,
        chunks: js.array.ReadonlyArray<WritableOptionsWritevChunksItem>,
        callback: (error: js.errors.JsError? /* use undefined for default */) -> Unit,
    ) -> Unit
    )?
    var final: ((/* this: T, */ callback: (error: js.errors.JsError? /* use undefined for default */) -> Unit) -> Unit)?
}

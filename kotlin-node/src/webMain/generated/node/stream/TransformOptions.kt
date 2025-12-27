// Automatically generated - do not modify!

package node.stream

@js.objects.JsPlainObject
external interface TransformOptions<T : Transform /* default is Transform */> : DuplexOptions<T> {
    var transform: (
        (/* this: T, */ chunk: Any?, encoding: node.buffer.BufferEncoding, callback: TransformCallback) -> Unit
    )?
    var flush: ((/* this: T, */ callback: TransformCallback) -> Unit)?
}

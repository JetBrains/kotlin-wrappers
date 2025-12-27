// Automatically generated - do not modify!

package node.fs

/**
 * The Keys are events of the WriteStream and the values are the functions that are called when the event is emitted.
 */
sealed external interface WriteStreamEvents : CustomEvents {
    var close: () -> Unit
    var drain: () -> Unit
    var error: (err: js.errors.JsError) -> Unit
    var finish: () -> Unit
    var open: (fd: Number) -> Unit
    var pipe: (src: node.stream.Readable) -> Unit
    var ready: () -> Unit
    var unpipe: (src: node.stream.Readable) -> Unit
}

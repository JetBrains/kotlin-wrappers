// Automatically generated - do not modify!

package node.stream

@kotlinx.js.JsPlainObject
sealed external interface ReadableOptions<T : Readable /* default is Readable */> : StreamOptions<T> {
    var encoding: node.buffer.BufferEncoding?
    var read: ((/* this: T, */ size: Number) -> Unit)?
}

// Automatically generated - do not modify!

package node.stream

@kotlinx.js.JsPlainObject
sealed external interface DuplexOptions<T : Duplex /* default is Duplex */> :
    ReadableOptions<T>,
    WritableOptions<T> {
    var allowHalfOpen: Boolean?
    var readableObjectMode: Boolean?
    var writableObjectMode: Boolean?
    var readableHighWaterMark: Double?
    var writableHighWaterMark: Double?
    var writableCorked: Double?
}

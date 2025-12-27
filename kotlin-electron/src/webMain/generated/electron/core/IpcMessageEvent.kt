// Automatically generated - do not modify!

package electron.core

@Suppress("INTERFACE_WITH_SUPERCLASS")
external interface IpcMessageEvent : DOMEvent {
    /**
     * pair of `[processId, frameId]`.
     */
    var frameId: js.array.Tuple2<Double, Double>
    var channel: String
    var args: js.array.ReadonlyArray<Any?>
}

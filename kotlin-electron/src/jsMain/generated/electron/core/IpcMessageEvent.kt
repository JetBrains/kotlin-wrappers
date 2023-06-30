package electron.core


external interface IpcMessageEvent : Event {
    /**
     * pair of `[processId, frameId]`.
     */
    var frameId: js.core.JsTuple2<Double, Double>
    var channel: String
    var args: js.core.ReadonlyArray<Any?>
}

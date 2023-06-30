package electron.core


external interface ParentPort : node.events.IEventEmitter {
// Docs: https://electronjs.org/docs/api/parent-port
    /**
     * Emitted when the process receives a message. Messages received on this port will
     * be queued up until a handler is registered for this event.
     */
    fun on(event: ParentPortEvent.MESSAGE, listener: (messageEvent: MessageEvent) -> Unit): Unit /* this */
    fun once(event: ParentPortEvent.MESSAGE, listener: (messageEvent: MessageEvent) -> Unit): Unit /* this */
    fun addListener(event: ParentPortEvent.MESSAGE, listener: (messageEvent: MessageEvent) -> Unit): Unit /* this */
    fun removeListener(event: ParentPortEvent.MESSAGE, listener: (messageEvent: MessageEvent) -> Unit): Unit /* this */

    /**
     * Sends a message from the process to its parent.
     */
    fun postMessage(message: Any?): Unit
}

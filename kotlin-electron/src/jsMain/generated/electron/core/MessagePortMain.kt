@file:JsModule("INTERNAL_ENTITY")

package electron.core

import node.events.EventEmitter as NodeEventEmitter


external class MessagePortMain : NodeEventEmitter {
// Docs: https://electronjs.org/docs/api/message-port-main
    /**
     * Emitted when the remote end of a MessagePortMain object becomes disconnected.
     */
    fun on(event: MessagePortMainEvent.CLOSE, listener: Function<*>): Unit /* this */

    /**
     * Emitted when a MessagePortMain object receives a message.
     */
    fun on(event: MessagePortMainEvent.MESSAGE, listener: (messageEvent: MessageEvent) -> Unit): Unit /* this */
    fun once(event: MessagePortMainEvent.CLOSE, listener: Function<*>): Unit /* this */
    fun once(event: MessagePortMainEvent.MESSAGE, listener: (messageEvent: MessageEvent) -> Unit): Unit /* this */
    fun addListener(event: MessagePortMainEvent.CLOSE, listener: Function<*>): Unit /* this */
    fun addListener(event: MessagePortMainEvent.MESSAGE, listener: (messageEvent: MessageEvent) -> Unit): Unit /* this */
    fun removeListener(event: MessagePortMainEvent.CLOSE, listener: Function<*>): Unit /* this */
    fun removeListener(event: MessagePortMainEvent.MESSAGE, listener: (messageEvent: MessageEvent) -> Unit): Unit /* this */

    /**
     * Disconnects the port, so it is no longer active.
     */
    fun close(): Unit

    /**
     * Sends a message from the port, and optionally, transfers ownership of objects to
     * other browsing contexts.
     */
    fun postMessage(message: Any?, transfer: js.core.ReadonlyArray<MessagePortMain> = definedExternally): Unit

    /**
     * Starts the sending of messages queued on the port. Messages will be queued until
     * this method is called.
     */
    fun start(): Unit
}

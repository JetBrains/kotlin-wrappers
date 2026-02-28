// Automatically generated - do not modify!

@file:JsModule("INTERNAL_ENTITY")

package electron.core

import node.events.EventEmitter as NodeEventEmitter

external class Debugger : NodeEventEmitter {
// Docs: https://electronjs.org/docs/api/debugger
    /**
     * Emitted when the debugging session is terminated. This happens either when
     * `webContents` is closed or DevTools is invoked for the attached `webContents`.
     */

    /**
     * Emitted whenever the debugging target issues an instrumentation event.
     */

    /**
     * Attaches the debugger to the `webContents`.
     */
    fun attach(protocolVersion: String = definedExternally)

    /**
     * Detaches the debugger from the `webContents`.
     */
    fun detach()

    /**
     * Whether a debugger is attached to the `webContents`.
     */
    fun isAttached(): Boolean

    /**
     * A promise that resolves with the response defined by the 'returns' attribute of
     * the command description in the remote debugging protocol or is rejected
     * indicating the failure of the command.
     *
     * Send given command to the debugging target.
     */
    fun sendCommand(
        method: String,
        commandParams: Any? = definedExternally,
        sessionId: String = definedExternally,
    ): js.promise.Promise<Any?>

    @web.events.JsEvent("detach")
    val detachEvent: node.events.EventInstance<js.array.Tuple2<Event<*>, String>>

    @web.events.JsEvent("message")
    val messageEvent: node.events.EventInstance<js.array.Tuple4<Event<*>, String, Any?, String>>
}

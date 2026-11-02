// Automatically generated - do not modify!

@file:JsModule("INTERNAL_ENTITY")

package electron.core

import node.events.EventEmitter as NodeEventEmitter

external class Debugger : NodeEventEmitter {
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
     *
     * > [!NOTE]
     *
     * * If `sendCommand` is called before the target has navigated (e.g. immediately
     * after `attach()`), the returned promise may not resolve until navigation occurs.
     * * If the command's response has no `result` data, as defined by that command's
     * entry in the remote debugging protocol, the promise resolves with an empty
     * object (`{}`), not `null` or `undefined`.
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

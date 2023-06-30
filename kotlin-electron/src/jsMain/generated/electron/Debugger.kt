@file:JsModule("INTERNAL_ENTITY")

package electron

import kotlin.js.Promise
import node.events.EventEmitter as NodeEventEmitter


external class Debugger : NodeEventEmitter {
// Docs: https://electronjs.org/docs/api/debugger
    /**
     * Emitted when the debugging session is terminated. This happens either when
     * `webContents` is closed or devtools is invoked for the attached `webContents`.
     */
    fun on(
        event: DebuggerEvent.DETACH, listener: (
            event: Event,
            /**
             * Reason for detaching debugger.
             */
            reason: String
        ) -> Unit
    ): Unit /* this */

    /**
     * Emitted whenever the debugging target issues an instrumentation event.
     */
    fun on(
        event: DebuggerEvent.MESSAGE, listener: (
            event: Event,
            /**
             * Method name.
             */
            method: String,
            /**
             * Event parameters defined by the 'parameters' attribute in the remote debugging
             * protocol.
             */
            params: Any?,
            /**
             * Unique identifier of attached debugging session, will match the value sent from
             * `debugger.sendCommand`.
             */
            sessionId: String
        ) -> Unit
    ): Unit /* this */

    fun once(
        event: DebuggerEvent.DETACH, listener: (
            event: Event,
            /**
             * Reason for detaching debugger.
             */
            reason: String
        ) -> Unit
    ): Unit /* this */

    fun once(
        event: DebuggerEvent.MESSAGE, listener: (
            event: Event,
            /**
             * Method name.
             */
            method: String,
            /**
             * Event parameters defined by the 'parameters' attribute in the remote debugging
             * protocol.
             */
            params: Any?,
            /**
             * Unique identifier of attached debugging session, will match the value sent from
             * `debugger.sendCommand`.
             */
            sessionId: String
        ) -> Unit
    ): Unit /* this */

    fun addListener(
        event: DebuggerEvent.DETACH, listener: (
            event: Event,
            /**
             * Reason for detaching debugger.
             */
            reason: String
        ) -> Unit
    ): Unit /* this */

    fun addListener(
        event: DebuggerEvent.MESSAGE, listener: (
            event: Event,
            /**
             * Method name.
             */
            method: String,
            /**
             * Event parameters defined by the 'parameters' attribute in the remote debugging
             * protocol.
             */
            params: Any?,
            /**
             * Unique identifier of attached debugging session, will match the value sent from
             * `debugger.sendCommand`.
             */
            sessionId: String
        ) -> Unit
    ): Unit /* this */

    fun removeListener(
        event: DebuggerEvent.DETACH, listener: (
            event: Event,
            /**
             * Reason for detaching debugger.
             */
            reason: String
        ) -> Unit
    ): Unit /* this */

    fun removeListener(
        event: DebuggerEvent.MESSAGE, listener: (
            event: Event,
            /**
             * Method name.
             */
            method: String,
            /**
             * Event parameters defined by the 'parameters' attribute in the remote debugging
             * protocol.
             */
            params: Any?,
            /**
             * Unique identifier of attached debugging session, will match the value sent from
             * `debugger.sendCommand`.
             */
            sessionId: String
        ) -> Unit
    ): Unit /* this */

    /**
     * Attaches the debugger to the `webContents`.
     */
    fun attach(protocolVersion: String = definedExternally): Unit

    /**
     * Detaches the debugger from the `webContents`.
     */
    fun detach(): Unit

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
    fun sendCommand(method: String, commandParams: Any? = definedExternally, sessionId: String = definedExternally): Promise<Any?>
}

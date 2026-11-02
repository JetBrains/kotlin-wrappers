// Automatically generated - do not modify!

@file:JsModule("INTERNAL_ENTITY")

package electron.core

import node.events.EventEmitter as NodeEventEmitter

external class UtilityProcess : NodeEventEmitter {
    /**
     * Terminates the process gracefully. On POSIX, it uses SIGTERM but will ensure the
     * process is reaped on exit. This function returns true if the kill is successful,
     * and false otherwise.
     */
    fun kill(): Boolean

    /**
     * Send a message to the child process, optionally transferring ownership of zero
     * or more `MessagePortMain` objects.
     *
     * For example:
     */
    fun postMessage(
        message: Any?,
        transfer: js.array.ReadonlyArray<MessagePortMain> = definedExternally,
    )

    /**
     * A `Integer | undefined` representing the process identifier (PID) of the child
     * process. Until the child process has spawned successfully, the value is
     * `undefined`. When the child process exits, then the value is `undefined` after
     * the `exit` event is emitted.
     *
     * > [!NOTE] You can use the `pid` to determine if the process is currently
     * running.
     */
    var pid: Double?

    /**
     * A `NodeJS.ReadableStream | null` that represents the child process's stderr. If
     * the child was spawned with options.stdio[2] set to anything other than 'pipe',
     * then this will be `null`. When the child process exits, then the value is `null`
     * after the `exit` event is emitted.
     */
    var stderr: node.ReadableStream?

    /**
     * A `NodeJS.ReadableStream | null` that represents the child process's stdout. If
     * the child was spawned with options.stdio[1] set to anything other than 'pipe',
     * then this will be `null`. When the child process exits, then the value is `null`
     * after the `exit` event is emitted.
     */
    var stdout: node.ReadableStream?

    @web.events.JsEvent("error")
    val errorEvent: node.events.EventInstance<js.array.Tuple3<(String /* 'FatalError' */), String, String>>

    @web.events.JsEvent("exit")
    val exitEvent: node.events.EventInstance<js.array.Tuple1<Double>>

    @web.events.JsEvent("login")
    val loginEvent: node.events.EventInstance<
            js.array.Tuple4<
                    Event<*>,
                    AuthenticationResponseDetails,
                    AuthInfo,
                        (
                username: String?, /* use undefined for default */
                password: String?, /* use undefined for default */
            ) -> Unit,
                    >,
            >

    @web.events.JsEvent("message")
    val messageEvent: node.events.EventInstance<js.array.Tuple1<Any?>>

    @web.events.JsEvent("spawn")
    val spawnEvent: node.events.EventInstance<js.array.Tuple>

    companion object {
// Docs: https://electronjs.org/docs/api/utility-process
        /**
         * > [!NOTE] `utilityProcess.fork` can only be called after the `ready` event has
         * been emitted on `App`.
         */
        fun fork(
            modulePath: String,
            args: js.array.ReadonlyArray<String> = definedExternally,
            options: ForkOptions = definedExternally,
        ): UtilityProcess
    }
}

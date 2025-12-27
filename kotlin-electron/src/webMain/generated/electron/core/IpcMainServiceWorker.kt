// Automatically generated - do not modify!

@file:JsModule("INTERNAL_ENTITY")

package electron.core

import node.events.EventEmitter as NodeEventEmitter

open external class IpcMainServiceWorker : NodeEventEmitter {
    // Docs: https://electronjs.org/docs/api/ipc-main-service-worker
    fun handle(
        channel: String,
        listener: Function<Any? /* (Promise<any>) | (any) */>, // (event: IpcMainServiceWorkerInvokeEvent, ...args: any[]) => (Promise<any>) | (any)
    )

    /**
     * Handles a single `invoke`able IPC message, then removes the listener. See
     * `ipcMainServiceWorker.handle(channel, listener)`.
     */
    fun handleOnce(
        channel: String,
        listener: Function<Any? /* (Promise<any>) | (any) */>, // (event: IpcMainServiceWorkerInvokeEvent, ...args: any[]) => (Promise<any>) | (any)
    )

    /**
     * Listens to `channel`, when a new message arrives `listener` would be called with
     * `listener(event, args...)`.
     */
    fun on(
        channel: String,
        listener: Function<Unit>, // (event: IpcMainServiceWorkerEvent, ...args: any[]) => void
    ) // this

    /**
     * Adds a one time `listener` function for the event. This `listener` is invoked
     * only the next time a message is sent to `channel`, after which it is removed.
     */
    fun once(
        channel: String,
        listener: Function<Unit>, // (event: IpcMainServiceWorkerEvent, ...args: any[]) => void
    ) // this

    /**
     * Removes listeners of the specified `channel`.
     */
    fun removeAllListeners(channel: String = definedExternally) // this

    /**
     * Removes any handler for `channel`, if present.
     */
    fun removeHandler(channel: String)

    /**
     * Removes the specified `listener` from the listener array for the specified
     * `channel`.
     */
    fun removeListener(channel: String, listener: Function<Unit> /* (...args: any[]) => void */) // this
}

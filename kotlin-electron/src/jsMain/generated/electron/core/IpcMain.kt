// Generated by Karakum - do not modify it manually!

package electron.core

@Suppress("INTERFACE_WITH_SUPERCLASS")
external interface IpcMain : node.events.EventEmitter {
// Docs: https://electronjs.org/docs/api/ipc-main
    /**
     * Alias for `ipcMain.on`.
     */
    fun addListener(
        channel: String,
        listener: Function<Unit>, /* (event: IpcMainEvent, ...args: any[]) => void */
    ): Unit /* this */

    /**
     * Adds a handler for an `invoke`able IPC. This handler will be called whenever a
     * renderer calls `ipcRenderer.invoke(channel, ...args)`.
     *
     * If `listener` returns a Promise, the eventual result of the promise will be
     * returned as a reply to the remote caller. Otherwise, the return value of the
     * listener will be used as the value of the reply.
     *
     * The `event` that is passed as the first argument to the handler is the same as
     * that passed to a regular event listener. It includes information about which
     * WebContents is the source of the invoke request.
     *
     * Errors thrown through `handle` in the main process are not transparent as they
     * are serialized and only the `message` property from the original error is
     * provided to the renderer process. Please refer to #24427 for details.
     */
    fun handle(
        channel: String,
        listener: Function<Any? /* (Promise<any>) | (any) */>, /* (event: IpcMainInvokeEvent, ...args: any[]) => (Promise<any>) | (any) */
    ): Unit

    /**
     * Handles a single `invoke`able IPC message, then removes the listener. See
     * `ipcMain.handle(channel, listener)`.
     */
    fun handleOnce(
        channel: String,
        listener: Function<Any? /* (Promise<any>) | (any) */>, /* (event: IpcMainInvokeEvent, ...args: any[]) => (Promise<any>) | (any) */
    ): Unit

    /**
     * Removes the specified `listener` from the listener array for the specified
     * `channel`.
     */
    fun off(
        channel: String,
        listener: Function<Unit>, /* (event: IpcMainEvent, ...args: any[]) => void */
    ): Unit /* this */

    /**
     * Listens to `channel`, when a new message arrives `listener` would be called with
     * `listener(event, args...)`.
     */
    fun on(
        channel: String,
        listener: Function<Unit>, /* (event: IpcMainEvent, ...args: any[]) => void */
    ): Unit /* this */

    /**
     * Adds a one time `listener` function for the event. This `listener` is invoked
     * only the next time a message is sent to `channel`, after which it is removed.
     */
    fun once(
        channel: String,
        listener: Function<Unit>, /* (event: IpcMainEvent, ...args: any[]) => void */
    ): Unit /* this */

    /**
     * Removes all listeners from the specified `channel`. Removes all listeners from
     * all channels if no channel is specified.
     */
    fun removeAllListeners(channel: String = definedExternally): Unit /* this */

    /**
     * Removes any handler for `channel`, if present.
     */
    fun removeHandler(channel: String): Unit

    /**
     * Alias for `ipcMain.off`.
     */
    fun removeListener(channel: String, listener: Function<Unit> /* (...args: any[]) => void */): Unit /* this */
}

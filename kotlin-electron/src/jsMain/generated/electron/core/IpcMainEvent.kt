package electron.core


external interface IpcMainEvent : Event {
// Docs: https://electronjs.org/docs/api/structures/ipc-main-event
    /**
     * The ID of the renderer frame that sent this message
     */
    var frameId: Double

    /**
     * A list of MessagePorts that were transferred with this message
     */
    var ports: js.core.ReadonlyArray<MessagePortMain>

    /**
     * The internal ID of the renderer process that sent this message
     */
    var processId: Double

    /**
     * A function that will send an IPC message to the renderer frame that sent the
     * original message that you are currently handling.  You should use this method to
     * "reply" to the sent message in order to guarantee the reply will go to the
     * correct process and frame.
     */
    var reply: Function<*>

    /**
     * Set this to the value to be returned in a synchronous message
     */
    var returnValue: Any?

    /**
     * Returns the `webContents` that sent the message
     */
    var sender: WebContents

    /**
     * The frame that sent this message
     *
     */
    val senderFrame: WebFrameMain
}

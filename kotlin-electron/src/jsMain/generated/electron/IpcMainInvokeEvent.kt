package electron


external interface IpcMainInvokeEvent : Event {
// Docs: https://electronjs.org/docs/api/structures/ipc-main-invoke-event
    /**
     * The ID of the renderer frame that sent this message
     */
    var frameId: Double

    /**
     * The internal ID of the renderer process that sent this message
     */
    var processId: Double

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

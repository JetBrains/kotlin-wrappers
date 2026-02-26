// Automatically generated - do not modify!

package electron.core

external interface IpcRendererEvent : Event<Any> {
// Docs: https://electronjs.org/docs/api/structures/ipc-renderer-event
    /**
     * A list of MessagePorts that were transferred with this message
     */
    var ports: js.array.ReadonlyArray<web.messaging.MessagePort>

    /**
     * The `IpcRenderer` instance that emitted the event originally
     */
    var sender: IpcRenderer
}

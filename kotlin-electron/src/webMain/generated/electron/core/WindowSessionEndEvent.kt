// Automatically generated - do not modify!

package electron.core

external interface WindowSessionEndEvent : Event<Any> {
// Docs: https://electronjs.org/docs/api/structures/window-session-end-event
    /**
     * List of reasons for shutdown. Can be 'shutdown', 'close-app', 'critical', or
     * 'logoff'.
     */
    var reasons: js.array.ReadonlyArray<WindowSessionEndEventReasons>
}

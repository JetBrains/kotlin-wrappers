// Generated by Karakum - do not modify it manually!

package electron.core


@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@seskar.js.JsVirtual
sealed external interface DebuggerEvent {
    sealed interface DETACH : node.events.LegacyEventType
    sealed interface MESSAGE : node.events.LegacyEventType

    companion object {
        @seskar.js.JsValue("detach")
        val DETACH: DETACH

        @seskar.js.JsValue("message")
        val MESSAGE: MESSAGE

        @seskar.js.JsValue("detach")
        fun detach(): node.events.EventType<Debugger, js.array.JsTuple2<Event<*>, String>>

        @seskar.js.JsValue("message")
        fun message(): node.events.EventType<Debugger, js.array.JsTuple4<Event<*>, String, Any?, String>>
    }
}

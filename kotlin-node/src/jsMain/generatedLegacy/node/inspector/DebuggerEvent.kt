// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package node.inspector

import node.events.EventType
import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface DebuggerEvent {
    companion object {
        @JsValue("Debugger.breakpointResolved")
        val BREAKPOINT_RESOLVED: BREAKPOINT_RESOLVED

        @JsValue("Debugger.paused")
        val PAUSED: PAUSED

        @JsValue("Debugger.resumed")
        val RESUMED: RESUMED

        @JsValue("Debugger.scriptFailedToParse")
        val SCRIPT_FAILED_TO_PARSE: SCRIPT_FAILED_TO_PARSE

        @JsValue("Debugger.scriptParsed")
        val SCRIPT_PARSED: SCRIPT_PARSED
    }

    sealed interface BREAKPOINT_RESOLVED : EventType
    sealed interface PAUSED : EventType
    sealed interface RESUMED : EventType
    sealed interface SCRIPT_FAILED_TO_PARSE : EventType
    sealed interface SCRIPT_PARSED : EventType
}

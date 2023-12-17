// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package node.inspector

import node.events.EventType
import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface ProfilerEvent {
    companion object {
        @JsValue("Profiler.consoleProfileFinished")
        val CONSOLE_PROFILE_FINISHED: CONSOLE_PROFILE_FINISHED

        @JsValue("Profiler.consoleProfileStarted")
        val CONSOLE_PROFILE_STARTED: CONSOLE_PROFILE_STARTED
    }

    sealed interface CONSOLE_PROFILE_FINISHED : EventType
    sealed interface CONSOLE_PROFILE_STARTED : EventType
}

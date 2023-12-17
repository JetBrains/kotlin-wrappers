// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package node.inspector

import node.events.EventType
import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface RuntimeEvent {
    companion object {
        @JsValue("Runtime.consoleAPICalled")
        val CONSOLE_APICALLED: CONSOLE_APICALLED

        @JsValue("Runtime.exceptionRevoked")
        val EXCEPTION_REVOKED: EXCEPTION_REVOKED

        @JsValue("Runtime.exceptionThrown")
        val EXCEPTION_THROWN: EXCEPTION_THROWN

        @JsValue("Runtime.executionContextCreated")
        val EXECUTION_CONTEXT_CREATED: EXECUTION_CONTEXT_CREATED

        @JsValue("Runtime.executionContextDestroyed")
        val EXECUTION_CONTEXT_DESTROYED: EXECUTION_CONTEXT_DESTROYED

        @JsValue("Runtime.executionContextsCleared")
        val EXECUTION_CONTEXTS_CLEARED: EXECUTION_CONTEXTS_CLEARED

        @JsValue("Runtime.inspectRequested")
        val INSPECT_REQUESTED: INSPECT_REQUESTED
    }

    sealed interface CONSOLE_APICALLED : EventType
    sealed interface EXCEPTION_REVOKED : EventType
    sealed interface EXCEPTION_THROWN : EventType
    sealed interface EXECUTION_CONTEXT_CREATED : EventType
    sealed interface EXECUTION_CONTEXT_DESTROYED : EventType
    sealed interface EXECUTION_CONTEXTS_CLEARED : EventType
    sealed interface INSPECT_REQUESTED : EventType
}

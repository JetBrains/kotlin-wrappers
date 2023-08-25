// Automatically generated - do not modify!

@file:Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package node.inspector

import node.events.EventType

// language=JavaScript
@JsName("""(/*union*/{CONSOLE_APICALLED: 'Runtime.consoleAPICalled', EXCEPTION_REVOKED: 'Runtime.exceptionRevoked', EXCEPTION_THROWN: 'Runtime.exceptionThrown', EXECUTION_CONTEXT_CREATED: 'Runtime.executionContextCreated', EXECUTION_CONTEXT_DESTROYED: 'Runtime.executionContextDestroyed', EXECUTION_CONTEXTS_CLEARED: 'Runtime.executionContextsCleared', INSPECT_REQUESTED: 'Runtime.inspectRequested'}/*union*/)""")
external object RuntimeEvent {
    object CONSOLE_APICALLED : EventType
    object EXCEPTION_REVOKED : EventType
    object EXCEPTION_THROWN : EventType
    object EXECUTION_CONTEXT_CREATED : EventType
    object EXECUTION_CONTEXT_DESTROYED : EventType
    object EXECUTION_CONTEXTS_CLEARED : EventType
    object INSPECT_REQUESTED : EventType
}

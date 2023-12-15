// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package node.test

import node.events.EventType
import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface TestEvent {
    companion object {
        @JsValue("test:diagnostic")
        val DIAGNOSTIC: DIAGNOSTIC

        @JsValue("test:fail")
        val FAIL: FAIL

        @JsValue("test:pass")
        val PASS: PASS

        @JsValue("test:plan")
        val PLAN: PLAN

        @JsValue("test:start")
        val START: START
    }

    sealed interface DIAGNOSTIC : EventType
    sealed interface FAIL : EventType
    sealed interface PASS : EventType
    sealed interface PLAN : EventType
    sealed interface START : EventType
}

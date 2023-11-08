// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package typescript

import seskar.js.JsIntValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface FlowFlags {
    companion object {
        @JsIntValue(1)
        val Unreachable: FlowFlags

        @JsIntValue(2)
        val Start: FlowFlags

        @JsIntValue(4)
        val BranchLabel: FlowFlags

        @JsIntValue(8)
        val LoopLabel: FlowFlags

        @JsIntValue(16)
        val Assignment: FlowFlags

        @JsIntValue(32)
        val TrueCondition: FlowFlags

        @JsIntValue(64)
        val FalseCondition: FlowFlags

        @JsIntValue(128)
        val SwitchClause: FlowFlags

        @JsIntValue(256)
        val ArrayMutation: FlowFlags

        @JsIntValue(512)
        val Call: FlowFlags

        @JsIntValue(1024)
        val ReduceLabel: FlowFlags

        @JsIntValue(2048)
        val Referenced: FlowFlags

        @JsIntValue(4096)
        val Shared: FlowFlags

        @JsIntValue(12)
        val Label: FlowFlags

        @JsIntValue(96)
        val Condition: FlowFlags
    }
}

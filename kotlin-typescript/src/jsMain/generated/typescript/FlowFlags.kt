// Automatically generated - do not modify!

@file:Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package typescript

// language=JavaScript
@JsName("""(/*union*/{Unreachable: 1, Start: 2, BranchLabel: 4, LoopLabel: 8, Assignment: 16, TrueCondition: 32, FalseCondition: 64, SwitchClause: 128, ArrayMutation: 256, Call: 512, ReduceLabel: 1024, Referenced: 2048, Shared: 4096, Label: 12, Condition: 96}/*union*/)""")
sealed external interface FlowFlags {
    companion object {
        val Unreachable: FlowFlags
        val Start: FlowFlags
        val BranchLabel: FlowFlags
        val LoopLabel: FlowFlags
        val Assignment: FlowFlags
        val TrueCondition: FlowFlags
        val FalseCondition: FlowFlags
        val SwitchClause: FlowFlags
        val ArrayMutation: FlowFlags
        val Call: FlowFlags
        val ReduceLabel: FlowFlags
        val Referenced: FlowFlags
        val Shared: FlowFlags
        val Label: FlowFlags
        val Condition: FlowFlags
    }
}

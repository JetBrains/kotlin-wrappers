// Automatically generated - do not modify!

package typescript

import js.array.ReadonlyArray

sealed external interface FlowReduceLabel : FlowNodeBase, Union.FlowReduceLabel_ {
    var target: FlowLabel
    var antecedents: ReadonlyArray<FlowNode>
    var antecedent: FlowNode
}

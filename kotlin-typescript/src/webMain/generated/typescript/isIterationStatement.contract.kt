// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isIterationStatement(
    node: Node,
    lookInLabeledStatements: Boolean,
): Boolean /* node is IterationStatement | LabeledStatement */ {
    contract {
        returns(true) implies (node is IsIterationStatementResultPredicate)
    }

    return isIterationStatementRaw(node, lookInLabeledStatements)
}

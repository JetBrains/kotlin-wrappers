// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract


@Suppress(
    "NOTHING_TO_INLINE",
    "CANNOT_CHECK_FOR_EXTERNAL_INTERFACE",
    "CANNOT_CHECK_FOR_ERASED",
    "ERROR_IN_CONTRACT_DESCRIPTION"
)
inline fun isIterationStatement(
    node: Node,
    lookInLabeledStatements: Boolean,
): Boolean /* node is IterationStatement | LabeledStatement */ {
    contract {
        returns(true) implies (node is IsIterationStatementResultPredicate)
    }

    return isIterationStatementRaw(node, lookInLabeledStatements)
}

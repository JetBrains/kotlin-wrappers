// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isLabeledStatement(node: Node): Boolean /* node is LabeledStatement */ {
    contract {
        returns(true) implies (node is LabeledStatement)
    }

    return isLabeledStatementRaw(node)
}

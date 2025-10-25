// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isBreakOrContinueStatement(node: Node): Boolean /* node is BreakOrContinueStatement */ {
    contract {
        returns(true) implies (node is BreakOrContinueStatement)
    }

    return isBreakOrContinueStatementRaw(node)
}

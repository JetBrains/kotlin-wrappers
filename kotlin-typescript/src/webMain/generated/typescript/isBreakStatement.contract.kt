// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isBreakStatement(node: Node): Boolean /* node is BreakStatement */ {
    contract {
        returns(true) implies (node is BreakStatement)
    }

    return isBreakStatementRaw(node)
}

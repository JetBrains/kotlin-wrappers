// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isWhileStatement(node: Node): Boolean /* node is WhileStatement */ {
    contract {
        returns(true) implies (node is WhileStatement)
    }

    return isWhileStatementRaw(node)
}

// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isContinueStatement(node: Node): Boolean /* node is ContinueStatement */ {
    contract {
        returns(true) implies (node is ContinueStatement)
    }

    return isContinueStatementRaw(node)
}

// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isReturnStatement(node: Node): Boolean /* node is ReturnStatement */ {
    contract {
        returns(true) implies (node is ReturnStatement)
    }

    return isReturnStatementRaw(node)
}

// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isTryStatement(node: Node): Boolean /* node is TryStatement */ {
    contract {
        returns(true) implies (node is TryStatement)
    }

    return isTryStatementRaw(node)
}

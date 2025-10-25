// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isStatement(node: Node): Boolean /* node is Statement */ {
    contract {
        returns(true) implies (node is Statement)
    }

    return isStatementRaw(node)
}

// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isCatchClause(node: Node): Boolean /* node is CatchClause */ {
    contract {
        returns(true) implies (node is CatchClause)
    }

    return isCatchClauseRaw(node)
}

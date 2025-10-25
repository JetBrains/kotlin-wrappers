// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isDefaultClause(node: Node): Boolean /* node is DefaultClause */ {
    contract {
        returns(true) implies (node is DefaultClause)
    }

    return isDefaultClauseRaw(node)
}

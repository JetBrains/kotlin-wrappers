// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isHeritageClause(node: Node): Boolean /* node is HeritageClause */ {
    contract {
        returns(true) implies (node is HeritageClause)
    }

    return isHeritageClauseRaw(node)
}

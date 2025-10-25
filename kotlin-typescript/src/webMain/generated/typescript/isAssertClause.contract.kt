// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isAssertClause(node: Node): Boolean /* node is AssertClause */ {
    contract {
        returns(true) implies (node is AssertClause)
    }

    return isAssertClauseRaw(node)
}

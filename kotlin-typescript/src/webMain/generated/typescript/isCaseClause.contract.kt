// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isCaseClause(node: Node): Boolean /* node is CaseClause */ {
    contract {
        returns(true) implies (node is CaseClause)
    }

    return isCaseClauseRaw(node)
}

// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isImportClause(node: Node): Boolean /* node is ImportClause */ {
    contract {
        returns(true) implies (node is ImportClause)
    }

    return isImportClauseRaw(node)
}

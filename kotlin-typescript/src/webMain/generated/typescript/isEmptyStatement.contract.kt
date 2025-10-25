// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isEmptyStatement(node: Node): Boolean /* node is EmptyStatement */ {
    contract {
        returns(true) implies (node is EmptyStatement)
    }

    return isEmptyStatementRaw(node)
}

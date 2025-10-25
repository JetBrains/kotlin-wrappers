// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isForInStatement(node: Node): Boolean /* node is ForInStatement */ {
    contract {
        returns(true) implies (node is ForInStatement)
    }

    return isForInStatementRaw(node)
}

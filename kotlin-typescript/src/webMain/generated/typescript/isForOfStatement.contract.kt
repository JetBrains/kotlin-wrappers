// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isForOfStatement(node: Node): Boolean /* node is ForOfStatement */ {
    contract {
        returns(true) implies (node is ForOfStatement)
    }

    return isForOfStatementRaw(node)
}

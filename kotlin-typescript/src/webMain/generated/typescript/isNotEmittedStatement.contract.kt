// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isNotEmittedStatement(node: Node): Boolean /* node is NotEmittedStatement */ {
    contract {
        returns(true) implies (node is NotEmittedStatement)
    }

    return isNotEmittedStatementRaw(node)
}

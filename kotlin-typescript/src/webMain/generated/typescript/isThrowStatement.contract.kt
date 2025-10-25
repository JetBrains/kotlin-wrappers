// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isThrowStatement(node: Node): Boolean /* node is ThrowStatement */ {
    contract {
        returns(true) implies (node is ThrowStatement)
    }

    return isThrowStatementRaw(node)
}

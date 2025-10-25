// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isIfStatement(node: Node): Boolean /* node is IfStatement */ {
    contract {
        returns(true) implies (node is IfStatement)
    }

    return isIfStatementRaw(node)
}

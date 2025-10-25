// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isVariableStatement(node: Node): Boolean /* node is VariableStatement */ {
    contract {
        returns(true) implies (node is VariableStatement)
    }

    return isVariableStatementRaw(node)
}

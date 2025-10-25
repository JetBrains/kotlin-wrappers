// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isDebuggerStatement(node: Node): Boolean /* node is DebuggerStatement */ {
    contract {
        returns(true) implies (node is DebuggerStatement)
    }

    return isDebuggerStatementRaw(node)
}

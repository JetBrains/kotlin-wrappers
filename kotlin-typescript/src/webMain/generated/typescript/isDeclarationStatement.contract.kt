// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isDeclarationStatement(node: Node): Boolean /* node is DeclarationStatement */ {
    contract {
        returns(true) implies (node is DeclarationStatement)
    }

    return isDeclarationStatementRaw(node)
}

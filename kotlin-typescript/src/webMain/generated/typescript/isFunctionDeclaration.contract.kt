// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isFunctionDeclaration(node: Node): Boolean /* node is FunctionDeclaration */ {
    contract {
        returns(true) implies (node is FunctionDeclaration)
    }

    return isFunctionDeclarationRaw(node)
}

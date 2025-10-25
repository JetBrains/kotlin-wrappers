// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isMethodDeclaration(node: Node): Boolean /* node is MethodDeclaration */ {
    contract {
        returns(true) implies (node is MethodDeclaration)
    }

    return isMethodDeclarationRaw(node)
}

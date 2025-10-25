// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isSetAccessorDeclaration(node: Node): Boolean /* node is SetAccessorDeclaration */ {
    contract {
        returns(true) implies (node is SetAccessorDeclaration)
    }

    return isSetAccessorDeclarationRaw(node)
}

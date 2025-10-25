// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isTypeParameterDeclaration(node: Node): Boolean /* node is TypeParameterDeclaration */ {
    contract {
        returns(true) implies (node is TypeParameterDeclaration)
    }

    return isTypeParameterDeclarationRaw(node)
}

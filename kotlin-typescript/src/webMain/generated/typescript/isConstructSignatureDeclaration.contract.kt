// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isConstructSignatureDeclaration(node: Node): Boolean /* node is ConstructSignatureDeclaration */ {
    contract {
        returns(true) implies (node is ConstructSignatureDeclaration)
    }

    return isConstructSignatureDeclarationRaw(node)
}

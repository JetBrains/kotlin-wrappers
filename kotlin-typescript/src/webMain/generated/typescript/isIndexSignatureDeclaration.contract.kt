// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isIndexSignatureDeclaration(node: Node): Boolean /* node is IndexSignatureDeclaration */ {
    contract {
        returns(true) implies (node is IndexSignatureDeclaration)
    }

    return isIndexSignatureDeclarationRaw(node)
}

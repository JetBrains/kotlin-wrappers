// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isCallSignatureDeclaration(node: Node): Boolean /* node is CallSignatureDeclaration */ {
    contract {
        returns(true) implies (node is CallSignatureDeclaration)
    }

    return isCallSignatureDeclarationRaw(node)
}

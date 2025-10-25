// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isTypeAliasDeclaration(node: Node): Boolean /* node is TypeAliasDeclaration */ {
    contract {
        returns(true) implies (node is TypeAliasDeclaration)
    }

    return isTypeAliasDeclarationRaw(node)
}

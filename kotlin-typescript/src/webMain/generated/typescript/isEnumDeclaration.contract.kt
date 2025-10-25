// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isEnumDeclaration(node: Node): Boolean /* node is EnumDeclaration */ {
    contract {
        returns(true) implies (node is EnumDeclaration)
    }

    return isEnumDeclarationRaw(node)
}

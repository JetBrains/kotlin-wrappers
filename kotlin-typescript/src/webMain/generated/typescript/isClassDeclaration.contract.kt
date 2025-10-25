// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isClassDeclaration(node: Node): Boolean /* node is ClassDeclaration */ {
    contract {
        returns(true) implies (node is ClassDeclaration)
    }

    return isClassDeclarationRaw(node)
}

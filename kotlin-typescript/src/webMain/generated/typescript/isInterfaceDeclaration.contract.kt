// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isInterfaceDeclaration(node: Node): Boolean /* node is InterfaceDeclaration */ {
    contract {
        returns(true) implies (node is InterfaceDeclaration)
    }

    return isInterfaceDeclarationRaw(node)
}

// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isPropertyDeclaration(node: Node): Boolean /* node is PropertyDeclaration */ {
    contract {
        returns(true) implies (node is PropertyDeclaration)
    }

    return isPropertyDeclarationRaw(node)
}

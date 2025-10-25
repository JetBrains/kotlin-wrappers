// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isNamespaceExportDeclaration(node: Node): Boolean /* node is NamespaceExportDeclaration */ {
    contract {
        returns(true) implies (node is NamespaceExportDeclaration)
    }

    return isNamespaceExportDeclarationRaw(node)
}

// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isExportDeclaration(node: Node): Boolean /* node is ExportDeclaration */ {
    contract {
        returns(true) implies (node is ExportDeclaration)
    }

    return isExportDeclarationRaw(node)
}

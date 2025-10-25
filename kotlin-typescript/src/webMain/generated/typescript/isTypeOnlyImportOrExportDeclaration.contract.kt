// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isTypeOnlyImportOrExportDeclaration(node: Node): Boolean /* node is TypeOnlyAliasDeclaration */ {
    contract {
        returns(true) implies (node is TypeOnlyAliasDeclaration)
    }

    return isTypeOnlyImportOrExportDeclarationRaw(node)
}

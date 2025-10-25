// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isImportOrExportSpecifier(node: Node): Boolean /* node is ImportSpecifier | ExportSpecifier */ {
    contract {
        returns(true) implies (node is IsImportOrExportSpecifierResultPredicate)
    }

    return isImportOrExportSpecifierRaw(node)
}

// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isExportSpecifier(node: Node): Boolean /* node is ExportSpecifier */ {
    contract {
        returns(true) implies (node is ExportSpecifier)
    }

    return isExportSpecifierRaw(node)
}

// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract


@Suppress(
    "NOTHING_TO_INLINE",
    "CANNOT_CHECK_FOR_EXTERNAL_INTERFACE",
    "CANNOT_CHECK_FOR_ERASED",
    "ERROR_IN_CONTRACT_DESCRIPTION"
)
inline fun isExportDeclaration(node: Node): Boolean /* node is ExportDeclaration */ {
    contract {
        returns(true) implies (node is ExportDeclaration)
    }

    return isExportDeclarationRaw(node)
}

// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isNamespaceExport(node: Node): Boolean /* node is NamespaceExport */ {
    contract {
        returns(true) implies (node is NamespaceExport)
    }

    return isNamespaceExportRaw(node)
}

// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isNamespaceImport(node: Node): Boolean /* node is NamespaceImport */ {
    contract {
        returns(true) implies (node is NamespaceImport)
    }

    return isNamespaceImportRaw(node)
}

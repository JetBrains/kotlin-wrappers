// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isImportTypeNode(node: Node): Boolean /* node is ImportTypeNode */ {
    contract {
        returns(true) implies (node is ImportTypeNode)
    }

    return isImportTypeNodeRaw(node)
}

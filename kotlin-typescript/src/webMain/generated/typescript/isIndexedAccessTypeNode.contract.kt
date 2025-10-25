// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isIndexedAccessTypeNode(node: Node): Boolean /* node is IndexedAccessTypeNode */ {
    contract {
        returns(true) implies (node is IndexedAccessTypeNode)
    }

    return isIndexedAccessTypeNodeRaw(node)
}

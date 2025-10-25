// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isMappedTypeNode(node: Node): Boolean /* node is MappedTypeNode */ {
    contract {
        returns(true) implies (node is MappedTypeNode)
    }

    return isMappedTypeNodeRaw(node)
}

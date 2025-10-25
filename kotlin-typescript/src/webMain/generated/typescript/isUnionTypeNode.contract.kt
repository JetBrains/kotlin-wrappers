// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isUnionTypeNode(node: Node): Boolean /* node is UnionTypeNode */ {
    contract {
        returns(true) implies (node is UnionTypeNode)
    }

    return isUnionTypeNodeRaw(node)
}

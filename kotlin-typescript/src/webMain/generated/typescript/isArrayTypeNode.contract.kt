// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isArrayTypeNode(node: Node): Boolean /* node is ArrayTypeNode */ {
    contract {
        returns(true) implies (node is ArrayTypeNode)
    }

    return isArrayTypeNodeRaw(node)
}

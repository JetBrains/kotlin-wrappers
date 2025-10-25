// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isRestTypeNode(node: Node): Boolean /* node is RestTypeNode */ {
    contract {
        returns(true) implies (node is RestTypeNode)
    }

    return isRestTypeNodeRaw(node)
}

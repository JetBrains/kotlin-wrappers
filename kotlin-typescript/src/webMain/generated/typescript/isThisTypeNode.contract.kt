// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isThisTypeNode(node: Node): Boolean /* node is ThisTypeNode */ {
    contract {
        returns(true) implies (node is ThisTypeNode)
    }

    return isThisTypeNodeRaw(node)
}

// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isFunctionTypeNode(node: Node): Boolean /* node is FunctionTypeNode */ {
    contract {
        returns(true) implies (node is FunctionTypeNode)
    }

    return isFunctionTypeNodeRaw(node)
}

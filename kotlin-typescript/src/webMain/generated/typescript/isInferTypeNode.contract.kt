// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isInferTypeNode(node: Node): Boolean /* node is InferTypeNode */ {
    contract {
        returns(true) implies (node is InferTypeNode)
    }

    return isInferTypeNodeRaw(node)
}

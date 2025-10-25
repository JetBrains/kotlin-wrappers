// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isTypeOperatorNode(node: Node): Boolean /* node is TypeOperatorNode */ {
    contract {
        returns(true) implies (node is TypeOperatorNode)
    }

    return isTypeOperatorNodeRaw(node)
}

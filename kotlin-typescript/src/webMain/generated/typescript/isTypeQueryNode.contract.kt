// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isTypeQueryNode(node: Node): Boolean /* node is TypeQueryNode */ {
    contract {
        returns(true) implies (node is TypeQueryNode)
    }

    return isTypeQueryNodeRaw(node)
}

// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isTypePredicateNode(node: Node): Boolean /* node is TypePredicateNode */ {
    contract {
        returns(true) implies (node is TypePredicateNode)
    }

    return isTypePredicateNodeRaw(node)
}

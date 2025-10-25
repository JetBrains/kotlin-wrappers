// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isTupleTypeNode(node: Node): Boolean /* node is TupleTypeNode */ {
    contract {
        returns(true) implies (node is TupleTypeNode)
    }

    return isTupleTypeNodeRaw(node)
}

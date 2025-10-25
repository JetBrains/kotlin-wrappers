// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isTypeReferenceNode(node: Node): Boolean /* node is TypeReferenceNode */ {
    contract {
        returns(true) implies (node is TypeReferenceNode)
    }

    return isTypeReferenceNodeRaw(node)
}

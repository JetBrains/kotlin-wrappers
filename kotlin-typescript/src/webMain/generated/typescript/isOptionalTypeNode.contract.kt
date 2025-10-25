// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isOptionalTypeNode(node: Node): Boolean /* node is OptionalTypeNode */ {
    contract {
        returns(true) implies (node is OptionalTypeNode)
    }

    return isOptionalTypeNodeRaw(node)
}

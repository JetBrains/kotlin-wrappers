// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isLiteralTypeNode(node: Node): Boolean /* node is LiteralTypeNode */ {
    contract {
        returns(true) implies (node is LiteralTypeNode)
    }

    return isLiteralTypeNodeRaw(node)
}

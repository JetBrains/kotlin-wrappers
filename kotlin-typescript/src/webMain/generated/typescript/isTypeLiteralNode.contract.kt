// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isTypeLiteralNode(node: Node): Boolean /* node is TypeLiteralNode */ {
    contract {
        returns(true) implies (node is TypeLiteralNode)
    }

    return isTypeLiteralNodeRaw(node)
}

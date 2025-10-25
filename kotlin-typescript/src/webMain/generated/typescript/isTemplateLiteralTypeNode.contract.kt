// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isTemplateLiteralTypeNode(node: Node): Boolean /* node is TemplateLiteralTypeNode */ {
    contract {
        returns(true) implies (node is TemplateLiteralTypeNode)
    }

    return isTemplateLiteralTypeNodeRaw(node)
}

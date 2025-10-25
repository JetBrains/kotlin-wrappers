// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isIdentifierOrThisTypeNode(node: Node): Boolean /* node is Identifier | ThisTypeNode */ {
    contract {
        returns(true) implies (node is IsIdentifierOrThisTypeNodeResultPredicate)
    }

    return isIdentifierOrThisTypeNodeRaw(node)
}

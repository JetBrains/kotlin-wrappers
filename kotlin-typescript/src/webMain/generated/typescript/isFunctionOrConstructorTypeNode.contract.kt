// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isFunctionOrConstructorTypeNode(node: Node): Boolean /* node is FunctionTypeNode | ConstructorTypeNode */ {
    contract {
        returns(true) implies (node is IsFunctionOrConstructorTypeNodeResultPredicate)
    }

    return isFunctionOrConstructorTypeNodeRaw(node)
}

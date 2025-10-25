// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isBinaryOperatorToken(node: Node): Boolean /* node is BinaryOperatorToken */ {
    contract {
        returns(true) implies (node is BinaryOperatorToken)
    }

    return isBinaryOperatorTokenRaw(node)
}

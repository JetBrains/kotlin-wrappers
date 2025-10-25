// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isStringTextContainingNode(node: Node): Boolean /* node is StringLiteral | TemplateLiteralToken */ {
    contract {
        returns(true) implies (node is IsStringTextContainingNodeResultPredicate)
    }

    return isStringTextContainingNodeRaw(node)
}

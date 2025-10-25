// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isReadonlyKeywordOrPlusOrMinusToken(
    node: Node,
): Boolean /* node is ReadonlyKeyword | PlusToken | MinusToken */ {
    contract {
        returns(true) implies (node is IsReadonlyKeywordOrPlusOrMinusTokenResultPredicate)
    }

    return isReadonlyKeywordOrPlusOrMinusTokenRaw(node)
}

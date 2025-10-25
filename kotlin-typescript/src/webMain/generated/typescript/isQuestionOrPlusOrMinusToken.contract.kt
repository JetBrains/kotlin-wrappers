// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isQuestionOrPlusOrMinusToken(node: Node): Boolean /* node is QuestionToken | PlusToken | MinusToken */ {
    contract {
        returns(true) implies (node is IsQuestionOrPlusOrMinusTokenResultPredicate)
    }

    return isQuestionOrPlusOrMinusTokenRaw(node)
}

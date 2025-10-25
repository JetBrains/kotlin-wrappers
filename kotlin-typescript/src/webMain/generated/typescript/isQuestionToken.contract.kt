// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isQuestionToken(node: Node): Boolean /* node is QuestionToken */ {
    contract {
        returns(true) implies (node is QuestionToken)
    }

    return isQuestionTokenRaw(node)
}

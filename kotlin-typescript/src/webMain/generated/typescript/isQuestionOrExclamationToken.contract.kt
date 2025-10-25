// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isQuestionOrExclamationToken(node: Node): Boolean /* node is QuestionToken | ExclamationToken */ {
    contract {
        returns(true) implies (node is IsQuestionOrExclamationTokenResultPredicate)
    }

    return isQuestionOrExclamationTokenRaw(node)
}

// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isAssertsKeyword(node: Node): Boolean /* node is AssertsKeyword */ {
    contract {
        returns(true) implies (node is AssertsKeyword)
    }

    return isAssertsKeywordRaw(node)
}

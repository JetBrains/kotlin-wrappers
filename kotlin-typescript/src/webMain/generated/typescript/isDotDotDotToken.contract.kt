// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isDotDotDotToken(node: Node): Boolean /* node is DotDotDotToken */ {
    contract {
        returns(true) implies (node is DotDotDotToken)
    }

    return isDotDotDotTokenRaw(node)
}

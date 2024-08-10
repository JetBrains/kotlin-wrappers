// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract


@Suppress(
    "NOTHING_TO_INLINE",
    "CANNOT_CHECK_FOR_EXTERNAL_INTERFACE",
    "CANNOT_CHECK_FOR_ERASED",
    "ERROR_IN_CONTRACT_DESCRIPTION"
)
inline fun isAsteriskToken(node: Node): Boolean /* node is AsteriskToken */ {
    contract {
        returns(true) implies (node is AsteriskToken)
    }

    return isAsteriskTokenRaw(node)
}

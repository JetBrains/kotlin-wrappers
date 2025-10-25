// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isObjectLiteralElementLike(node: Node): Boolean /* node is ObjectLiteralElementLike */ {
    contract {
        returns(true) implies (node is ObjectLiteralElementLike)
    }

    return isObjectLiteralElementLikeRaw(node)
}

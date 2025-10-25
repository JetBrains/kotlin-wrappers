// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isStringLiteralLike(node: Node): Boolean /* node is StringLiteralLike */ {
    contract {
        returns(true) implies (node is StringLiteralLike)
    }

    return isStringLiteralLikeRaw(node)
}

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isStringLiteralLike(node: FileReference): Boolean /* node is StringLiteralLike */ {
    contract {
        returns(true) implies (node is StringLiteralLike)
    }

    return isStringLiteralLikeRaw(node)
}

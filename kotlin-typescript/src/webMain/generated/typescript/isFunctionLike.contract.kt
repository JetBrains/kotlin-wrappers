// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isFunctionLike(node: Node?): Boolean /* node is SignatureDeclaration */ {
    contract {
        returns(true) implies (node is SignatureDeclaration)
    }

    return isFunctionLikeRaw(node)
}

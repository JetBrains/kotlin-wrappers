// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isModifierLike(node: Node): Boolean /* node is ModifierLike */ {
    contract {
        returns(true) implies (node is ModifierLike)
    }

    return isModifierLikeRaw(node)
}

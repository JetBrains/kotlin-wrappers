// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isModifier(node: Node): Boolean /* node is Modifier */ {
    contract {
        returns(true) implies (node is Modifier)
    }

    return isModifierRaw(node)
}

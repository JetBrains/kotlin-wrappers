// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isBindingElement(node: Node): Boolean /* node is BindingElement */ {
    contract {
        returns(true) implies (node is BindingElement)
    }

    return isBindingElementRaw(node)
}

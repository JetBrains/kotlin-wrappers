// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isArrayBindingElement(node: Node): Boolean /* node is ArrayBindingElement */ {
    contract {
        returns(true) implies (node is ArrayBindingElement)
    }

    return isArrayBindingElementRaw(node)
}

// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isClassElement(node: Node): Boolean /* node is ClassElement */ {
    contract {
        returns(true) implies (node is ClassElement)
    }

    return isClassElementRaw(node)
}

// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isComputedPropertyName(node: Node): Boolean /* node is ComputedPropertyName */ {
    contract {
        returns(true) implies (node is ComputedPropertyName)
    }

    return isComputedPropertyNameRaw(node)
}

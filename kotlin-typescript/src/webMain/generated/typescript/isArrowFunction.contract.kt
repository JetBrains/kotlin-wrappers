// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isArrowFunction(node: Node): Boolean /* node is ArrowFunction */ {
    contract {
        returns(true) implies (node is ArrowFunction)
    }

    return isArrowFunctionRaw(node)
}

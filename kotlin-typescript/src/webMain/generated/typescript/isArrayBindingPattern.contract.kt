// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isArrayBindingPattern(node: Node): Boolean /* node is ArrayBindingPattern */ {
    contract {
        returns(true) implies (node is ArrayBindingPattern)
    }

    return isArrayBindingPatternRaw(node)
}

// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isEmptyBindingPattern(node: BindingName): Boolean /* node is BindingPattern */ {
    contract {
        returns(true) implies (node is BindingPattern)
    }

    return isEmptyBindingPatternRaw(node)
}

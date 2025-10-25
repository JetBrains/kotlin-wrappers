// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isImportAttribute(node: Node): Boolean /* node is ImportAttribute */ {
    contract {
        returns(true) implies (node is ImportAttribute)
    }

    return isImportAttributeRaw(node)
}

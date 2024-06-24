// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract


@Suppress(
    "NOTHING_TO_INLINE",
    "CANNOT_CHECK_FOR_EXTERNAL_INTERFACE",
    "CANNOT_CHECK_FOR_ERASED",
    "ERROR_IN_CONTRACT_DESCRIPTION"
)
inline fun isImportAttribute(node: Node): Boolean /* node is ImportAttribute */ {
    contract {
        returns(true) implies (node is ImportAttribute)
    }

    return isImportAttributeRaw(node)
}

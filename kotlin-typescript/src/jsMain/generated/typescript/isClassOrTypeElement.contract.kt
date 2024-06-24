// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract


@Suppress(
    "NOTHING_TO_INLINE",
    "CANNOT_CHECK_FOR_EXTERNAL_INTERFACE",
    "CANNOT_CHECK_FOR_ERASED",
    "ERROR_IN_CONTRACT_DESCRIPTION"
)
inline fun isClassOrTypeElement(node: Node): Boolean /* node is ClassElement | TypeElement */ {
    contract {
        returns(true) implies (node is IsClassOrTypeElementResultPredicate)
    }

    return isClassOrTypeElementRaw(node)
}

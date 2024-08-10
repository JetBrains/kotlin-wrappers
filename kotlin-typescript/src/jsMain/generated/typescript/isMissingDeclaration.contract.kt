// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract


@Suppress(
    "NOTHING_TO_INLINE",
    "CANNOT_CHECK_FOR_EXTERNAL_INTERFACE",
    "CANNOT_CHECK_FOR_ERASED",
    "ERROR_IN_CONTRACT_DESCRIPTION"
)
inline fun isMissingDeclaration(node: Node): Boolean /* node is MissingDeclaration */ {
    contract {
        returns(true) implies (node is MissingDeclaration)
    }

    return isMissingDeclarationRaw(node)
}

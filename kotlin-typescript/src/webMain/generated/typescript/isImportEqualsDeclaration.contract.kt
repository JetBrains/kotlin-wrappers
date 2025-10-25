// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isImportEqualsDeclaration(node: Node): Boolean /* node is ImportEqualsDeclaration */ {
    contract {
        returns(true) implies (node is ImportEqualsDeclaration)
    }

    return isImportEqualsDeclarationRaw(node)
}

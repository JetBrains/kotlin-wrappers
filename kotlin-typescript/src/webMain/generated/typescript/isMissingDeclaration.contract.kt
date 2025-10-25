// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isMissingDeclaration(node: Node): Boolean /* node is MissingDeclaration */ {
    contract {
        returns(true) implies (node is MissingDeclaration)
    }

    return isMissingDeclarationRaw(node)
}

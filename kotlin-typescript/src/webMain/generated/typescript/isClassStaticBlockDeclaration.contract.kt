// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isClassStaticBlockDeclaration(node: Node): Boolean /* node is ClassStaticBlockDeclaration */ {
    contract {
        returns(true) implies (node is ClassStaticBlockDeclaration)
    }

    return isClassStaticBlockDeclarationRaw(node)
}

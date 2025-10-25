// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isNamedImports(node: Node): Boolean /* node is NamedImports */ {
    contract {
        returns(true) implies (node is NamedImports)
    }

    return isNamedImportsRaw(node)
}

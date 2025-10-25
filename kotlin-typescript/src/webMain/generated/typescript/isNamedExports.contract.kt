// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isNamedExports(node: Node): Boolean /* node is NamedExports */ {
    contract {
        returns(true) implies (node is NamedExports)
    }

    return isNamedExportsRaw(node)
}

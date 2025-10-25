// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isQualifiedName(node: Node): Boolean /* node is QualifiedName */ {
    contract {
        returns(true) implies (node is QualifiedName)
    }

    return isQualifiedNameRaw(node)
}

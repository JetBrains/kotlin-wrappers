// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isJSDocNameReference(node: Node): Boolean /* node is JSDocNameReference */ {
    contract {
        returns(true) implies (node is JSDocNameReference)
    }

    return isJSDocNameReferenceRaw(node)
}

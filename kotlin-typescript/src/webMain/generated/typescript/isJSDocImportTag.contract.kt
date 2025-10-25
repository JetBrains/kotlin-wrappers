// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isJSDocImportTag(node: Node): Boolean /* node is JSDocImportTag */ {
    contract {
        returns(true) implies (node is JSDocImportTag)
    }

    return isJSDocImportTagRaw(node)
}

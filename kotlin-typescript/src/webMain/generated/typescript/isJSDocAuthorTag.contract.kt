// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isJSDocAuthorTag(node: Node): Boolean /* node is JSDocAuthorTag */ {
    contract {
        returns(true) implies (node is JSDocAuthorTag)
    }

    return isJSDocAuthorTagRaw(node)
}

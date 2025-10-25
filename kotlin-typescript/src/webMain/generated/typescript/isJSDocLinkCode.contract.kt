// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isJSDocLinkCode(node: Node): Boolean /* node is JSDocLinkCode */ {
    contract {
        returns(true) implies (node is JSDocLinkCode)
    }

    return isJSDocLinkCodeRaw(node)
}

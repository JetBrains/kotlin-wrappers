// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isJSDocLink(node: Node): Boolean /* node is JSDocLink */ {
    contract {
        returns(true) implies (node is JSDocLink)
    }

    return isJSDocLinkRaw(node)
}

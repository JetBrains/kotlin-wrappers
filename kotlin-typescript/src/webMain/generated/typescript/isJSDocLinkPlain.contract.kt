// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isJSDocLinkPlain(node: Node): Boolean /* node is JSDocLinkPlain */ {
    contract {
        returns(true) implies (node is JSDocLinkPlain)
    }

    return isJSDocLinkPlainRaw(node)
}

// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isJSDocUnknownTag(node: Node): Boolean /* node is JSDocUnknownTag */ {
    contract {
        returns(true) implies (node is JSDocUnknownTag)
    }

    return isJSDocUnknownTagRaw(node)
}

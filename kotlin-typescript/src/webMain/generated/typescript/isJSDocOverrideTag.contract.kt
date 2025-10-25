// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isJSDocOverrideTag(node: Node): Boolean /* node is JSDocOverrideTag */ {
    contract {
        returns(true) implies (node is JSDocOverrideTag)
    }

    return isJSDocOverrideTagRaw(node)
}

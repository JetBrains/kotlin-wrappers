// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isJSDocDeprecatedTag(node: Node): Boolean /* node is JSDocDeprecatedTag */ {
    contract {
        returns(true) implies (node is JSDocDeprecatedTag)
    }

    return isJSDocDeprecatedTagRaw(node)
}

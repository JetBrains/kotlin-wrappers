// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isJSDocImplementsTag(node: Node): Boolean /* node is JSDocImplementsTag */ {
    contract {
        returns(true) implies (node is JSDocImplementsTag)
    }

    return isJSDocImplementsTagRaw(node)
}

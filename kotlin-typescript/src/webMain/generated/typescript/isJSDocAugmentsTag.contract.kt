// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isJSDocAugmentsTag(node: Node): Boolean /* node is JSDocAugmentsTag */ {
    contract {
        returns(true) implies (node is JSDocAugmentsTag)
    }

    return isJSDocAugmentsTagRaw(node)
}

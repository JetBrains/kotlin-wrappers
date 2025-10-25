// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isJSDocParameterTag(node: Node): Boolean /* node is JSDocParameterTag */ {
    contract {
        returns(true) implies (node is JSDocParameterTag)
    }

    return isJSDocParameterTagRaw(node)
}

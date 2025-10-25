// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isJSDocTemplateTag(node: Node): Boolean /* node is JSDocTemplateTag */ {
    contract {
        returns(true) implies (node is JSDocTemplateTag)
    }

    return isJSDocTemplateTagRaw(node)
}

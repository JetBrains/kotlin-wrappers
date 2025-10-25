// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isTemplateSpan(node: Node): Boolean /* node is TemplateSpan */ {
    contract {
        returns(true) implies (node is TemplateSpan)
    }

    return isTemplateSpanRaw(node)
}

// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isTemplateMiddle(node: Node): Boolean /* node is TemplateMiddle */ {
    contract {
        returns(true) implies (node is TemplateMiddle)
    }

    return isTemplateMiddleRaw(node)
}

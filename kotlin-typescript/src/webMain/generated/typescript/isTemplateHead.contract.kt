// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isTemplateHead(node: Node): Boolean /* node is TemplateHead */ {
    contract {
        returns(true) implies (node is TemplateHead)
    }

    return isTemplateHeadRaw(node)
}

// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isTemplateExpression(node: Node): Boolean /* node is TemplateExpression */ {
    contract {
        returns(true) implies (node is TemplateExpression)
    }

    return isTemplateExpressionRaw(node)
}

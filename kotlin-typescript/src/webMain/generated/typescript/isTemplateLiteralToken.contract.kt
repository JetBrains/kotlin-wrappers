// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isTemplateLiteralToken(node: Node): Boolean /* node is TemplateLiteralToken */ {
    contract {
        returns(true) implies (node is TemplateLiteralToken)
    }

    return isTemplateLiteralTokenRaw(node)
}

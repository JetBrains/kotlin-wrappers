// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isTemplateLiteral(node: Node): Boolean /* node is TemplateLiteral */ {
    contract {
        returns(true) implies (node is TemplateLiteral)
    }

    return isTemplateLiteralRaw(node)
}

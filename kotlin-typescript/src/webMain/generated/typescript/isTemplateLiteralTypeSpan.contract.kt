// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isTemplateLiteralTypeSpan(node: Node): Boolean /* node is TemplateLiteralTypeSpan */ {
    contract {
        returns(true) implies (node is TemplateLiteralTypeSpan)
    }

    return isTemplateLiteralTypeSpanRaw(node)
}

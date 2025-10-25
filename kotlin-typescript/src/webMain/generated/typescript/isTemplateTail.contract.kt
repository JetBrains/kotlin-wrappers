// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isTemplateTail(node: Node): Boolean /* node is TemplateTail */ {
    contract {
        returns(true) implies (node is TemplateTail)
    }

    return isTemplateTailRaw(node)
}

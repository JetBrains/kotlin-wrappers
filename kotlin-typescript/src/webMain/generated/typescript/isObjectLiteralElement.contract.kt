// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isObjectLiteralElement(node: Node): Boolean /* node is ObjectLiteralElement */ {
    contract {
        returns(true) implies (node is ObjectLiteralElement)
    }

    return isObjectLiteralElementRaw(node)
}

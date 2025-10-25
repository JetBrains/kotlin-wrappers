// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isDecorator(node: Node): Boolean /* node is Decorator */ {
    contract {
        returns(true) implies (node is Decorator)
    }

    return isDecoratorRaw(node)
}

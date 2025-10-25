// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun hasOnlyExpressionInitializer(node: Node): Boolean /* node is HasExpressionInitializer */ {
    contract {
        returns(true) implies (node is HasExpressionInitializer)
    }

    return hasOnlyExpressionInitializerRaw(node)
}

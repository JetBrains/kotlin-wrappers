// Automatically generated - do not modify!

@file:Suppress(
    "CANNOT_CHECK_FOR_EXTERNAL_INTERFACE",
)

package typescript

import kotlin.contracts.contract

/** True if has initializer node attached to it. */
fun hasOnlyExpressionInitializer(node: Node): Boolean {
    contract {
        returns(true) implies (node is HasExpressionInitializer)
    }

    return typescript.raw.hasOnlyExpressionInitializer(node)
}

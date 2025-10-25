// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isForInitializer(node: Node): Boolean /* node is ForInitializer */ {
    contract {
        returns(true) implies (node is ForInitializer)
    }

    return isForInitializerRaw(node)
}

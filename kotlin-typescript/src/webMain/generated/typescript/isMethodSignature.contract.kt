// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isMethodSignature(node: Node): Boolean /* node is MethodSignature */ {
    contract {
        returns(true) implies (node is MethodSignature)
    }

    return isMethodSignatureRaw(node)
}

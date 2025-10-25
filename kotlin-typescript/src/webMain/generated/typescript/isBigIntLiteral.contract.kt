// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isBigIntLiteral(node: Node): Boolean /* node is BigIntLiteral */ {
    contract {
        returns(true) implies (node is BigIntLiteral)
    }

    return isBigIntLiteralRaw(node)
}

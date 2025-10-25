// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isStringLiteral(node: Node): Boolean /* node is StringLiteral */ {
    contract {
        returns(true) implies (node is StringLiteral)
    }

    return isStringLiteralRaw(node)
}

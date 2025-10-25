// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isNumericLiteral(node: Node): Boolean /* node is NumericLiteral */ {
    contract {
        returns(true) implies (node is NumericLiteral)
    }

    return isNumericLiteralRaw(node)
}

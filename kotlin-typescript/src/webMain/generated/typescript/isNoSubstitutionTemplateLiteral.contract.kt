// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isNoSubstitutionTemplateLiteral(node: Node): Boolean /* node is NoSubstitutionTemplateLiteral */ {
    contract {
        returns(true) implies (node is NoSubstitutionTemplateLiteral)
    }

    return isNoSubstitutionTemplateLiteralRaw(node)
}

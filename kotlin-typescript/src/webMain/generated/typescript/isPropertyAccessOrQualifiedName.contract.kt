// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isPropertyAccessOrQualifiedName(node: Node): Boolean /* node is PropertyAccessExpression | QualifiedName */ {
    contract {
        returns(true) implies (node is IsPropertyAccessOrQualifiedNameResultPredicate)
    }

    return isPropertyAccessOrQualifiedNameRaw(node)
}

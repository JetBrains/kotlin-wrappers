// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isClassOrTypeElement(node: Node): Boolean /* node is ClassElement | TypeElement */ {
    contract {
        returns(true) implies (node is IsClassOrTypeElementResultPredicate)
    }

    return isClassOrTypeElementRaw(node)
}

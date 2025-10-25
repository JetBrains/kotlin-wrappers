// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isMetaProperty(node: Node): Boolean /* node is MetaProperty */ {
    contract {
        returns(true) implies (node is MetaProperty)
    }

    return isMetaPropertyRaw(node)
}

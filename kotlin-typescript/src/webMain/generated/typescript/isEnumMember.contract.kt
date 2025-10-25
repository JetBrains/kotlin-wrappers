// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isEnumMember(node: Node): Boolean /* node is EnumMember */ {
    contract {
        returns(true) implies (node is EnumMember)
    }

    return isEnumMemberRaw(node)
}

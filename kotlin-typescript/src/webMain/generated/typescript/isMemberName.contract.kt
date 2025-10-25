// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isMemberName(node: Node): Boolean /* node is MemberName */ {
    contract {
        returns(true) implies (node is MemberName)
    }

    return isMemberNameRaw(node)
}

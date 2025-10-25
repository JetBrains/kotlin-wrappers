// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isAssertEntry(node: Node): Boolean /* node is AssertEntry */ {
    contract {
        returns(true) implies (node is AssertEntry)
    }

    return isAssertEntryRaw(node)
}

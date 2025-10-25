// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isSourceFile(node: Node): Boolean /* node is SourceFile */ {
    contract {
        returns(true) implies (node is SourceFile)
    }

    return isSourceFileRaw(node)
}

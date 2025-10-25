// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isImportTypeAssertionContainer(node: Node): Boolean /* node is ImportTypeAssertionContainer */ {
    contract {
        returns(true) implies (node is ImportTypeAssertionContainer)
    }

    return isImportTypeAssertionContainerRaw(node)
}

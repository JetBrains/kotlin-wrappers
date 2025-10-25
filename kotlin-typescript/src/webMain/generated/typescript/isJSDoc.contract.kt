// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isJSDoc(node: Node): Boolean /* node is JSDoc */ {
    contract {
        returns(true) implies (node is JSDoc)
    }

    return isJSDocRaw(node)
}

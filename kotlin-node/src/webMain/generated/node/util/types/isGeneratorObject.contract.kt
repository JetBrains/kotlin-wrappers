// Automatically generated - do not modify!

package node.util.types

import js.generator.Generator
import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isGeneratorObject(value: Any?): Boolean /* object is Generator */ {
    contract {
        returns(true) implies (value is Generator<*, *, *>)
    }

    return isGeneratorObjectRaw(value)
}

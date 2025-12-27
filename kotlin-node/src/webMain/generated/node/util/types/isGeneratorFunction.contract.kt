// Automatically generated - do not modify!

package node.util.types

import js.generator.GeneratorFunction
import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isGeneratorFunction(value: Any?): Boolean /* object is GeneratorFunction */ {
    contract {
        returns(true) implies (value is GeneratorFunction<*, *>)
    }

    return isGeneratorFunctionRaw(value)
}

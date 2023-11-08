// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package typescript

import seskar.js.JsIntValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface TokenFlags {
    companion object {
        @JsIntValue(0)
        val None: TokenFlags

        @JsIntValue(16)
        val Scientific: TokenFlags

        @JsIntValue(32)
        val Octal: TokenFlags

        @JsIntValue(64)
        val HexSpecifier: TokenFlags

        @JsIntValue(128)
        val BinarySpecifier: TokenFlags

        @JsIntValue(256)
        val OctalSpecifier: TokenFlags
    }
}

// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package typescript

import seskar.js.JsIntValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface GeneratedIdentifierFlags {
    companion object {
        @JsIntValue(0)
        val None: GeneratedIdentifierFlags

        @JsIntValue(8)
        val ReservedInNestedScopes: GeneratedIdentifierFlags

        @JsIntValue(16)
        val Optimistic: GeneratedIdentifierFlags

        @JsIntValue(32)
        val FileLevel: GeneratedIdentifierFlags

        @JsIntValue(64)
        val AllowNameSubstitution: GeneratedIdentifierFlags
    }
}

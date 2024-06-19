// Automatically generated - do not modify!

package typescript

import seskar.js.JsIntValue

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

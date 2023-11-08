// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package typescript

import seskar.js.JsIntValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface SymbolFormatFlags {
    companion object {
        @JsIntValue(0)
        val None: SymbolFormatFlags

        @JsIntValue(1)
        val WriteTypeParametersOrArguments: SymbolFormatFlags

        @JsIntValue(2)
        val UseOnlyExternalAliasing: SymbolFormatFlags

        @JsIntValue(4)
        val AllowAnyNodeKind: SymbolFormatFlags

        @JsIntValue(8)
        val UseAliasDefinedOutsideCurrentScope: SymbolFormatFlags
    }
}

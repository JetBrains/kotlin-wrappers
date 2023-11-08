// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package typescript

import seskar.js.JsIntValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface EmitHint {
    companion object {
        @JsIntValue(0)
        val SourceFile: EmitHint

        @JsIntValue(1)
        val Expression: EmitHint

        @JsIntValue(2)
        val IdentifierName: EmitHint

        @JsIntValue(3)
        val MappedTypeParameter: EmitHint

        @JsIntValue(4)
        val Unspecified: EmitHint

        @JsIntValue(5)
        val EmbeddedStatement: EmitHint

        @JsIntValue(6)
        val JsxAttributeValue: EmitHint
    }
}

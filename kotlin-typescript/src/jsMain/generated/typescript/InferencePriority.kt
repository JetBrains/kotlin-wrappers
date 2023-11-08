// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package typescript

import seskar.js.JsIntValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface InferencePriority {
    companion object {
        @JsIntValue(1)
        val NakedTypeVariable: InferencePriority

        @JsIntValue(2)
        val SpeculativeTuple: InferencePriority

        @JsIntValue(4)
        val SubstituteSource: InferencePriority

        @JsIntValue(8)
        val HomomorphicMappedType: InferencePriority

        @JsIntValue(16)
        val PartialHomomorphicMappedType: InferencePriority

        @JsIntValue(32)
        val MappedTypeConstraint: InferencePriority

        @JsIntValue(64)
        val ContravariantConditional: InferencePriority

        @JsIntValue(128)
        val ReturnType: InferencePriority

        @JsIntValue(256)
        val LiteralKeyof: InferencePriority

        @JsIntValue(512)
        val NoConstraints: InferencePriority

        @JsIntValue(1024)
        val AlwaysStrict: InferencePriority

        @JsIntValue(2048)
        val MaxValue: InferencePriority

        @JsIntValue(416)
        val PriorityImpliesCombination: InferencePriority

        @JsIntValue(-1)
        val Circularity: InferencePriority
    }
}

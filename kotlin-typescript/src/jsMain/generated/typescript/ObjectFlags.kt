// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package typescript

import seskar.js.JsIntValue
import seskar.js.JsUnion

@JsUnion
sealed external interface ObjectFlags {
    companion object {
        @JsIntValue(1)
        val Class: ObjectFlags

        @JsIntValue(2)
        val Interface: ObjectFlags

        @JsIntValue(4)
        val Reference: ObjectFlags

        @JsIntValue(8)
        val Tuple: ObjectFlags

        @JsIntValue(16)
        val Anonymous: ObjectFlags

        @JsIntValue(32)
        val Mapped: ObjectFlags

        @JsIntValue(64)
        val Instantiated: ObjectFlags

        @JsIntValue(128)
        val ObjectLiteral: ObjectFlags

        @JsIntValue(256)
        val EvolvingArray: ObjectFlags

        @JsIntValue(512)
        val ObjectLiteralPatternWithComputedProperties: ObjectFlags

        @JsIntValue(1024)
        val ReverseMapped: ObjectFlags

        @JsIntValue(2048)
        val JsxAttributes: ObjectFlags

        @JsIntValue(4096)
        val JSLiteral: ObjectFlags

        @JsIntValue(8192)
        val FreshLiteral: ObjectFlags

        @JsIntValue(16384)
        val ArrayLiteral: ObjectFlags

        @JsIntValue(3)
        val ClassOrInterface: ObjectFlags

        @JsIntValue(2097152)
        val ContainsSpread: ObjectFlags

        @JsIntValue(4194304)
        val ObjectRestType: ObjectFlags

        @JsIntValue(8388608)
        val InstantiationExpressionType: ObjectFlags
    }
}

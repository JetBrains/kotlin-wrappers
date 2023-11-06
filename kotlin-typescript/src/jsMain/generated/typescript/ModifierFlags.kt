// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package typescript

import seskar.js.JsIntValue
import seskar.js.JsUnion

@JsUnion
sealed external interface ModifierFlags {
    companion object {
        @JsIntValue(0)
        val None: ModifierFlags

        @JsIntValue(1)
        val Export: ModifierFlags

        @JsIntValue(2)
        val Ambient: ModifierFlags

        @JsIntValue(4)
        val Public: ModifierFlags

        @JsIntValue(8)
        val Private: ModifierFlags

        @JsIntValue(16)
        val Protected: ModifierFlags

        @JsIntValue(32)
        val Static: ModifierFlags

        @JsIntValue(64)
        val Readonly: ModifierFlags

        @JsIntValue(128)
        val Accessor: ModifierFlags

        @JsIntValue(256)
        val Abstract: ModifierFlags

        @JsIntValue(512)
        val Async: ModifierFlags

        @JsIntValue(1024)
        val Default: ModifierFlags

        @JsIntValue(2048)
        val Const: ModifierFlags

        @JsIntValue(4096)
        val HasComputedJSDocModifiers: ModifierFlags

        @JsIntValue(8192)
        val Deprecated: ModifierFlags

        @JsIntValue(16384)
        val Override: ModifierFlags

        @JsIntValue(32768)
        val In: ModifierFlags

        @JsIntValue(65536)
        val Out: ModifierFlags

        @JsIntValue(131072)
        val Decorator: ModifierFlags

        @JsIntValue(536870912)
        val HasComputedFlags: ModifierFlags

        @JsIntValue(28)
        val AccessibilityModifier: ModifierFlags

        @JsIntValue(16476)
        val ParameterPropertyModifier: ModifierFlags

        @JsIntValue(24)
        val NonPublicAccessibilityModifier: ModifierFlags

        @JsIntValue(117086)
        val TypeScriptModifier: ModifierFlags

        @JsIntValue(1025)
        val ExportDefault: ModifierFlags

        @JsIntValue(258047)
        val All: ModifierFlags

        @JsIntValue(126975)
        val Modifier: ModifierFlags
    }
}

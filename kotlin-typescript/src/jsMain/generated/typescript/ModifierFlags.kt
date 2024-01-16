// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package typescript

import seskar.js.JsIntValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface ModifierFlags {
    companion object {
        @JsIntValue(0)
        val None: ModifierFlags

        @JsIntValue(1)
        val Public: ModifierFlags

        @JsIntValue(2)
        val Private: ModifierFlags

        @JsIntValue(4)
        val Protected: ModifierFlags

        @JsIntValue(8)
        val Readonly: ModifierFlags

        @JsIntValue(16)
        val Override: ModifierFlags

        @JsIntValue(32)
        val Export: ModifierFlags

        @JsIntValue(64)
        val Abstract: ModifierFlags

        @JsIntValue(128)
        val Ambient: ModifierFlags

        @JsIntValue(256)
        val Static: ModifierFlags

        @JsIntValue(512)
        val Accessor: ModifierFlags

        @JsIntValue(1024)
        val Async: ModifierFlags

        @JsIntValue(2048)
        val Default: ModifierFlags

        @JsIntValue(4096)
        val Const: ModifierFlags

        @JsIntValue(8192)
        val In: ModifierFlags

        @JsIntValue(16384)
        val Out: ModifierFlags

        @JsIntValue(32768)
        val Decorator: ModifierFlags

        @JsIntValue(65536)
        val Deprecated: ModifierFlags

        @JsIntValue(268435456)
        val HasComputedJSDocModifiers: ModifierFlags

        @JsIntValue(536870912)
        val HasComputedFlags: ModifierFlags

        @JsIntValue(7)
        val AccessibilityModifier: ModifierFlags

        @JsIntValue(31)
        val ParameterPropertyModifier: ModifierFlags

        @JsIntValue(6)
        val NonPublicAccessibilityModifier: ModifierFlags

        @JsIntValue(28895)
        val TypeScriptModifier: ModifierFlags

        @JsIntValue(2080)
        val ExportDefault: ModifierFlags

        @JsIntValue(131071)
        val All: ModifierFlags

        @JsIntValue(98303)
        val Modifier: ModifierFlags
    }
}

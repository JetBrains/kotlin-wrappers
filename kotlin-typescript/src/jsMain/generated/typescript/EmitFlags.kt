// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package typescript

import seskar.js.JsIntValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface EmitFlags {
    companion object {
        @JsIntValue(0)
        val None: EmitFlags

        @JsIntValue(1)
        val SingleLine: EmitFlags

        @JsIntValue(2)
        val MultiLine: EmitFlags

        @JsIntValue(4)
        val AdviseOnEmitNode: EmitFlags

        @JsIntValue(8)
        val NoSubstitution: EmitFlags

        @JsIntValue(16)
        val CapturesThis: EmitFlags

        @JsIntValue(32)
        val NoLeadingSourceMap: EmitFlags

        @JsIntValue(64)
        val NoTrailingSourceMap: EmitFlags

        @JsIntValue(96)
        val NoSourceMap: EmitFlags

        @JsIntValue(128)
        val NoNestedSourceMaps: EmitFlags

        @JsIntValue(256)
        val NoTokenLeadingSourceMaps: EmitFlags

        @JsIntValue(512)
        val NoTokenTrailingSourceMaps: EmitFlags

        @JsIntValue(768)
        val NoTokenSourceMaps: EmitFlags

        @JsIntValue(1024)
        val NoLeadingComments: EmitFlags

        @JsIntValue(2048)
        val NoTrailingComments: EmitFlags

        @JsIntValue(3072)
        val NoComments: EmitFlags

        @JsIntValue(4096)
        val NoNestedComments: EmitFlags

        @JsIntValue(8192)
        val HelperName: EmitFlags

        @JsIntValue(16384)
        val ExportName: EmitFlags

        @JsIntValue(32768)
        val LocalName: EmitFlags

        @JsIntValue(65536)
        val InternalName: EmitFlags

        @JsIntValue(131072)
        val Indented: EmitFlags

        @JsIntValue(262144)
        val NoIndentation: EmitFlags

        @JsIntValue(524288)
        val AsyncFunctionBody: EmitFlags

        @JsIntValue(1048576)
        val ReuseTempVariableScope: EmitFlags

        @JsIntValue(2097152)
        val CustomPrologue: EmitFlags

        @JsIntValue(4194304)
        val NoHoisting: EmitFlags

        @JsIntValue(8388608)
        val Iterator: EmitFlags

        @JsIntValue(16777216)
        val NoAsciiEscaping: EmitFlags
    }
}

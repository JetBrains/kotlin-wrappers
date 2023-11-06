// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package typescript

import seskar.js.JsIntValue
import seskar.js.JsUnion

@JsUnion
sealed external interface EmitFlags {
    companion object {
        @JsIntValue(0)
        val None: EmitFlags

        @JsIntValue(1)
        val SingleLine: EmitFlags

        @JsIntValue(2)
        val AdviseOnEmitNode: EmitFlags

        @JsIntValue(4)
        val NoSubstitution: EmitFlags

        @JsIntValue(8)
        val CapturesThis: EmitFlags

        @JsIntValue(16)
        val NoLeadingSourceMap: EmitFlags

        @JsIntValue(32)
        val NoTrailingSourceMap: EmitFlags

        @JsIntValue(48)
        val NoSourceMap: EmitFlags

        @JsIntValue(64)
        val NoNestedSourceMaps: EmitFlags

        @JsIntValue(128)
        val NoTokenLeadingSourceMaps: EmitFlags

        @JsIntValue(256)
        val NoTokenTrailingSourceMaps: EmitFlags

        @JsIntValue(384)
        val NoTokenSourceMaps: EmitFlags

        @JsIntValue(512)
        val NoLeadingComments: EmitFlags

        @JsIntValue(1024)
        val NoTrailingComments: EmitFlags

        @JsIntValue(1536)
        val NoComments: EmitFlags

        @JsIntValue(2048)
        val NoNestedComments: EmitFlags

        @JsIntValue(4096)
        val HelperName: EmitFlags

        @JsIntValue(8192)
        val ExportName: EmitFlags

        @JsIntValue(16384)
        val LocalName: EmitFlags

        @JsIntValue(32768)
        val InternalName: EmitFlags

        @JsIntValue(65536)
        val Indented: EmitFlags

        @JsIntValue(131072)
        val NoIndentation: EmitFlags

        @JsIntValue(262144)
        val AsyncFunctionBody: EmitFlags

        @JsIntValue(524288)
        val ReuseTempVariableScope: EmitFlags

        @JsIntValue(1048576)
        val CustomPrologue: EmitFlags

        @JsIntValue(2097152)
        val NoHoisting: EmitFlags

        @JsIntValue(4194304)
        val HasEndOfDeclarationMarker: EmitFlags

        @JsIntValue(8388608)
        val Iterator: EmitFlags

        @JsIntValue(16777216)
        val NoAsciiEscaping: EmitFlags
    }
}

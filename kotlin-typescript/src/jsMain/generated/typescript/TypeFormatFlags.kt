// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package typescript

import seskar.js.JsIntValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface TypeFormatFlags {
    companion object {
        @JsIntValue(0)
        val None: TypeFormatFlags

        @JsIntValue(1)
        val NoTruncation: TypeFormatFlags

        @JsIntValue(2)
        val WriteArrayAsGenericType: TypeFormatFlags

        @JsIntValue(8)
        val UseStructuralFallback: TypeFormatFlags

        @JsIntValue(32)
        val WriteTypeArgumentsOfSignature: TypeFormatFlags

        @JsIntValue(64)
        val UseFullyQualifiedType: TypeFormatFlags

        @JsIntValue(256)
        val SuppressAnyReturnType: TypeFormatFlags

        @JsIntValue(1024)
        val MultilineObjectLiterals: TypeFormatFlags

        @JsIntValue(2048)
        val WriteClassExpressionAsTypeLiteral: TypeFormatFlags

        @JsIntValue(4096)
        val UseTypeOfFunction: TypeFormatFlags

        @JsIntValue(8192)
        val OmitParameterModifiers: TypeFormatFlags

        @JsIntValue(16384)
        val UseAliasDefinedOutsideCurrentScope: TypeFormatFlags

        @JsIntValue(268435456)
        val UseSingleQuotesForStringLiteralType: TypeFormatFlags

        @JsIntValue(536870912)
        val NoTypeReduction: TypeFormatFlags

        @JsIntValue(33554432)
        val OmitThisParameter: TypeFormatFlags

        @JsIntValue(1048576)
        val AllowUniqueESSymbolType: TypeFormatFlags

        @JsIntValue(131072)
        val AddUndefined: TypeFormatFlags

        @JsIntValue(262144)
        val WriteArrowStyleSignature: TypeFormatFlags

        @JsIntValue(524288)
        val InArrayType: TypeFormatFlags

        @JsIntValue(2097152)
        val InElementType: TypeFormatFlags

        @JsIntValue(4194304)
        val InFirstTypeArgument: TypeFormatFlags

        @JsIntValue(8388608)
        val InTypeAlias: TypeFormatFlags

        @JsIntValue(0)
        val
                /** @deprecated */
                WriteOwnNameForAnyLike: TypeFormatFlags

        @JsIntValue(848330091)
        val NodeBuilderFlagsMask: TypeFormatFlags
    }
}

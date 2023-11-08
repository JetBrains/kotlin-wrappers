// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package typescript

import seskar.js.JsIntValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface NodeBuilderFlags {
    companion object {
        @JsIntValue(0)
        val None: NodeBuilderFlags

        @JsIntValue(1)
        val NoTruncation: NodeBuilderFlags

        @JsIntValue(2)
        val WriteArrayAsGenericType: NodeBuilderFlags

        @JsIntValue(4)
        val GenerateNamesForShadowedTypeParams: NodeBuilderFlags

        @JsIntValue(8)
        val UseStructuralFallback: NodeBuilderFlags

        @JsIntValue(16)
        val ForbidIndexedAccessSymbolReferences: NodeBuilderFlags

        @JsIntValue(32)
        val WriteTypeArgumentsOfSignature: NodeBuilderFlags

        @JsIntValue(64)
        val UseFullyQualifiedType: NodeBuilderFlags

        @JsIntValue(128)
        val UseOnlyExternalAliasing: NodeBuilderFlags

        @JsIntValue(256)
        val SuppressAnyReturnType: NodeBuilderFlags

        @JsIntValue(512)
        val WriteTypeParametersInQualifiedName: NodeBuilderFlags

        @JsIntValue(1024)
        val MultilineObjectLiterals: NodeBuilderFlags

        @JsIntValue(2048)
        val WriteClassExpressionAsTypeLiteral: NodeBuilderFlags

        @JsIntValue(4096)
        val UseTypeOfFunction: NodeBuilderFlags

        @JsIntValue(8192)
        val OmitParameterModifiers: NodeBuilderFlags

        @JsIntValue(16384)
        val UseAliasDefinedOutsideCurrentScope: NodeBuilderFlags

        @JsIntValue(268435456)
        val UseSingleQuotesForStringLiteralType: NodeBuilderFlags

        @JsIntValue(536870912)
        val NoTypeReduction: NodeBuilderFlags

        @JsIntValue(33554432)
        val OmitThisParameter: NodeBuilderFlags

        @JsIntValue(32768)
        val AllowThisInObjectLiteral: NodeBuilderFlags

        @JsIntValue(65536)
        val AllowQualifiedNameInPlaceOfIdentifier: NodeBuilderFlags

        /** @deprecated AllowQualifedNameInPlaceOfIdentifier. Use AllowQualifiedNameInPlaceOfIdentifier instead. */
        @JsIntValue(65536)
        val AllowQualifedNameInPlaceOfIdentifier: NodeBuilderFlags

        @JsIntValue(131072)
        val AllowAnonymousIdentifier: NodeBuilderFlags

        @JsIntValue(262144)
        val AllowEmptyUnionOrIntersection: NodeBuilderFlags

        @JsIntValue(524288)
        val AllowEmptyTuple: NodeBuilderFlags

        @JsIntValue(1048576)
        val AllowUniqueESSymbolType: NodeBuilderFlags

        @JsIntValue(2097152)
        val AllowEmptyIndexInfoType: NodeBuilderFlags

        @JsIntValue(67108864)
        val AllowNodeModulesRelativePaths: NodeBuilderFlags

        @JsIntValue(70221824)
        val IgnoreErrors: NodeBuilderFlags

        @JsIntValue(4194304)
        val InObjectTypeLiteral: NodeBuilderFlags

        @JsIntValue(8388608)
        val InTypeAlias: NodeBuilderFlags

        @JsIntValue(16777216)
        val InInitialEntityName: NodeBuilderFlags
    }
}

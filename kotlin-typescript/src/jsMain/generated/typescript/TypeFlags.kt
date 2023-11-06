// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package typescript

import seskar.js.JsIntValue
import seskar.js.JsUnion

@JsUnion
sealed external interface TypeFlags {
    companion object {
        @JsIntValue(1)
        val Any: TypeFlags

        @JsIntValue(2)
        val Unknown: TypeFlags

        @JsIntValue(4)
        val String: TypeFlags

        @JsIntValue(8)
        val Number: TypeFlags

        @JsIntValue(16)
        val Boolean: TypeFlags

        @JsIntValue(32)
        val Enum: TypeFlags

        @JsIntValue(64)
        val BigInt: TypeFlags

        @JsIntValue(128)
        val StringLiteral: TypeFlags

        @JsIntValue(256)
        val NumberLiteral: TypeFlags

        @JsIntValue(512)
        val BooleanLiteral: TypeFlags

        @JsIntValue(1024)
        val EnumLiteral: TypeFlags

        @JsIntValue(2048)
        val BigIntLiteral: TypeFlags

        @JsIntValue(4096)
        val ESSymbol: TypeFlags

        @JsIntValue(8192)
        val UniqueESSymbol: TypeFlags

        @JsIntValue(16384)
        val Void: TypeFlags

        @JsIntValue(32768)
        val Undefined: TypeFlags

        @JsIntValue(65536)
        val Null: TypeFlags

        @JsIntValue(131072)
        val Never: TypeFlags

        @JsIntValue(262144)
        val TypeParameter: TypeFlags

        @JsIntValue(524288)
        val Object: TypeFlags

        @JsIntValue(1048576)
        val Union: TypeFlags

        @JsIntValue(2097152)
        val Intersection: TypeFlags

        @JsIntValue(4194304)
        val Index: TypeFlags

        @JsIntValue(8388608)
        val IndexedAccess: TypeFlags

        @JsIntValue(16777216)
        val Conditional: TypeFlags

        @JsIntValue(33554432)
        val Substitution: TypeFlags

        @JsIntValue(67108864)
        val NonPrimitive: TypeFlags

        @JsIntValue(134217728)
        val TemplateLiteral: TypeFlags

        @JsIntValue(268435456)
        val StringMapping: TypeFlags

        @JsIntValue(2944)
        val Literal: TypeFlags

        @JsIntValue(109440)
        val Unit: TypeFlags

        @JsIntValue(384)
        val StringOrNumberLiteral: TypeFlags

        @JsIntValue(117724)
        val PossiblyFalsy: TypeFlags

        @JsIntValue(402653316)
        val StringLike: TypeFlags

        @JsIntValue(296)
        val NumberLike: TypeFlags

        @JsIntValue(2112)
        val BigIntLike: TypeFlags

        @JsIntValue(528)
        val BooleanLike: TypeFlags

        @JsIntValue(1056)
        val EnumLike: TypeFlags

        @JsIntValue(12288)
        val ESSymbolLike: TypeFlags

        @JsIntValue(49152)
        val VoidLike: TypeFlags

        @JsIntValue(3145728)
        val UnionOrIntersection: TypeFlags

        @JsIntValue(3670016)
        val StructuredType: TypeFlags

        @JsIntValue(8650752)
        val TypeVariable: TypeFlags

        @JsIntValue(58982400)
        val InstantiableNonPrimitive: TypeFlags

        @JsIntValue(406847488)
        val InstantiablePrimitive: TypeFlags

        @JsIntValue(465829888)
        val Instantiable: TypeFlags

        @JsIntValue(469499904)
        val StructuredOrInstantiable: TypeFlags

        @JsIntValue(536624127)
        val Narrowable: TypeFlags
    }
}

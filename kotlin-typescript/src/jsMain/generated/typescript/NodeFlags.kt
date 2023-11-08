// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package typescript

import seskar.js.JsIntValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface NodeFlags {
    companion object {
        @JsIntValue(0)
        val None: NodeFlags

        @JsIntValue(1)
        val Let: NodeFlags

        @JsIntValue(2)
        val Const: NodeFlags

        @JsIntValue(4)
        val NestedNamespace: NodeFlags

        @JsIntValue(8)
        val Synthesized: NodeFlags

        @JsIntValue(16)
        val Namespace: NodeFlags

        @JsIntValue(32)
        val OptionalChain: NodeFlags

        @JsIntValue(64)
        val ExportContext: NodeFlags

        @JsIntValue(128)
        val ContainsThis: NodeFlags

        @JsIntValue(256)
        val HasImplicitReturn: NodeFlags

        @JsIntValue(512)
        val HasExplicitReturn: NodeFlags

        @JsIntValue(1024)
        val GlobalAugmentation: NodeFlags

        @JsIntValue(2048)
        val HasAsyncFunctions: NodeFlags

        @JsIntValue(4096)
        val DisallowInContext: NodeFlags

        @JsIntValue(8192)
        val YieldContext: NodeFlags

        @JsIntValue(16384)
        val DecoratorContext: NodeFlags

        @JsIntValue(32768)
        val AwaitContext: NodeFlags

        @JsIntValue(65536)
        val DisallowConditionalTypesContext: NodeFlags

        @JsIntValue(131072)
        val ThisNodeHasError: NodeFlags

        @JsIntValue(262144)
        val JavaScriptFile: NodeFlags

        @JsIntValue(524288)
        val ThisNodeOrAnySubNodesHasError: NodeFlags

        @JsIntValue(1048576)
        val HasAggregatedChildData: NodeFlags

        @JsIntValue(8388608)
        val JSDoc: NodeFlags

        @JsIntValue(67108864)
        val JsonFile: NodeFlags

        @JsIntValue(3)
        val BlockScoped: NodeFlags

        @JsIntValue(768)
        val ReachabilityCheckFlags: NodeFlags

        @JsIntValue(2816)
        val ReachabilityAndEmitFlags: NodeFlags

        @JsIntValue(50720768)
        val ContextFlags: NodeFlags

        @JsIntValue(40960)
        val TypeExcludesFlags: NodeFlags
    }
}

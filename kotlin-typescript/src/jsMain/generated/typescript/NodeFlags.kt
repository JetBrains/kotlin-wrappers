// Automatically generated - do not modify!

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
        val Using: NodeFlags

        @JsIntValue(6)
        val AwaitUsing: NodeFlags

        @JsIntValue(8)
        val NestedNamespace: NodeFlags

        @JsIntValue(16)
        val Synthesized: NodeFlags

        @JsIntValue(32)
        val Namespace: NodeFlags

        @JsIntValue(64)
        val OptionalChain: NodeFlags

        @JsIntValue(128)
        val ExportContext: NodeFlags

        @JsIntValue(256)
        val ContainsThis: NodeFlags

        @JsIntValue(512)
        val HasImplicitReturn: NodeFlags

        @JsIntValue(1024)
        val HasExplicitReturn: NodeFlags

        @JsIntValue(2048)
        val GlobalAugmentation: NodeFlags

        @JsIntValue(4096)
        val HasAsyncFunctions: NodeFlags

        @JsIntValue(8192)
        val DisallowInContext: NodeFlags

        @JsIntValue(16384)
        val YieldContext: NodeFlags

        @JsIntValue(32768)
        val DecoratorContext: NodeFlags

        @JsIntValue(65536)
        val AwaitContext: NodeFlags

        @JsIntValue(131072)
        val DisallowConditionalTypesContext: NodeFlags

        @JsIntValue(262144)
        val ThisNodeHasError: NodeFlags

        @JsIntValue(524288)
        val JavaScriptFile: NodeFlags

        @JsIntValue(1048576)
        val ThisNodeOrAnySubNodesHasError: NodeFlags

        @JsIntValue(2097152)
        val HasAggregatedChildData: NodeFlags

        @JsIntValue(16777216)
        val JSDoc: NodeFlags

        @JsIntValue(134217728)
        val JsonFile: NodeFlags

        @JsIntValue(7)
        val BlockScoped: NodeFlags

        @JsIntValue(6)
        val Constant: NodeFlags

        @JsIntValue(1536)
        val ReachabilityCheckFlags: NodeFlags

        @JsIntValue(5632)
        val ReachabilityAndEmitFlags: NodeFlags

        @JsIntValue(101441536)
        val ContextFlags: NodeFlags

        @JsIntValue(81920)
        val TypeExcludesFlags: NodeFlags
    }
}

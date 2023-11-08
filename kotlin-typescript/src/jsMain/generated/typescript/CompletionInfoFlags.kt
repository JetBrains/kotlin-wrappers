// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package typescript

import seskar.js.JsIntValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface CompletionInfoFlags {
    companion object {
        @JsIntValue(0)
        val None: CompletionInfoFlags

        @JsIntValue(1)
        val MayIncludeAutoImports: CompletionInfoFlags

        @JsIntValue(2)
        val IsImportStatementCompletion: CompletionInfoFlags

        @JsIntValue(4)
        val IsContinuation: CompletionInfoFlags

        @JsIntValue(8)
        val ResolvedModuleSpecifiers: CompletionInfoFlags

        @JsIntValue(16)
        val ResolvedModuleSpecifiersBeyondLimit: CompletionInfoFlags

        @JsIntValue(32)
        val MayIncludeMethodSnippets: CompletionInfoFlags
    }
}

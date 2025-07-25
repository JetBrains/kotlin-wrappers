// Automatically generated - do not modify!

package vscode

import js.core.JsInt
import js.promise.PromiseLike
import kotlin.js.JsName
import kotlin.js.definedExternally

/**
 * Options related to tokenization for a tool invocation.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#LanguageModelToolTokenizationOptions)
 */
external interface LanguageModelToolTokenizationOptions {
    /**
     * If known, the maximum number of tokens the tool should emit in its result.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#LanguageModelToolTokenizationOptions.tokenBudget)
     */
    var tokenBudget: Int

    /**
     * Count the number of tokens in a message using the model specific tokenizer-logic.
     * @param text A string.
     * @param token Optional cancellation token.  See [CancellationTokenSource] for how to create one.
     * @returns A thenable that resolves to the number of tokens.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#LanguageModelToolTokenizationOptions.countTokens)
     */
    @JsName("countTokens")
    fun countTokensAsync(
        text: String,
        token: CancellationToken = definedExternally,
    ): PromiseLike<JsInt>
}

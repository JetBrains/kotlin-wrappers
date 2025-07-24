// Automatically generated - do not modify!

package vscode

import js.core.JsInt
import js.promise.PromiseLike

/**
 * Options related to tokenization for a tool invocation.
 */
external interface LanguageModelToolTokenizationOptions {
    /**
     * If known, the maximum number of tokens the tool should emit in its result.
     */
    var tokenBudget: Int

    /**
     * Count the number of tokens in a message using the model specific tokenizer-logic.
     * @param text A string.
     * @param token Optional cancellation token.  See {@link CancellationTokenSource} for how to create one.
     * @returns A thenable that resolves to the number of tokens.
     */
    fun countTokens(
        text: String,
        token: CancellationToken = definedExternally,
    ): PromiseLike<JsInt>
}

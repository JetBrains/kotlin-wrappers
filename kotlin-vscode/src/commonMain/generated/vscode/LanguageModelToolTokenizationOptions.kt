// Automatically generated - do not modify!

package vscode

/**
 * Options related to tokenization for a tool invocation.
 */
external interface LanguageModelToolTokenizationOptions {
    /**
    // ORIGINAL SOURCE

    /**
     * If known, the maximum number of tokens the tool should emit in its result.
    */
    tokenBudget: number;

    /**
     * Count the number of tokens in a message using the model specific tokenizer-logic.
     * @param text A string.
     * @param token Optional cancellation token.  See {@link CancellationTokenSource} for how to create one.
     * @returns A thenable that resolves to the number of tokens.
    */
    countTokens(text: string, token?: CancellationToken): Thenable<number>;

    // ORIGINAL SOURCE
     **/
}

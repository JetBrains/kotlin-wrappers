// Automatically generated - do not modify!

package vscode

import js.array.ReadonlyArray
import js.core.JsInt
import js.promise.PromiseLike
import kotlin.js.JsAny
import kotlin.js.definedExternally

/**
 * Represents a language model for making chat requests.
 *
 * @see [lm.selectChatModels]
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#LanguageModelChat)
 */
external interface LanguageModelChat {
    /**
     * Human-readable name of the language model.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#LanguageModelChat.name)
     */
    val name: String

    /**
     * Opaque identifier of the language model.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#LanguageModelChat.id)
     */
    val id: String

    /**
     * A well-known identifier of the vendor of the language model. An example is `copilot`, but
     * values are defined by extensions contributing chat models and need to be looked up with them.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#LanguageModelChat.vendor)
     */
    val vendor: String

    /**
     * Opaque family-name of the language model. Values might be `gpt-3.5-turbo`, `gpt4`, `phi2`, or `llama`
     * but they are defined by extensions contributing languages and subject to change.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#LanguageModelChat.family)
     */
    val family: String

    /**
     * Opaque version string of the model. This is defined by the extension contributing the language model
     * and subject to change.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#LanguageModelChat.version)
     */
    val version: String

    /**
     * The maximum number of tokens that can be sent to the model in a single request.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#LanguageModelChat.maxInputTokens)
     */
    val maxInputTokens: Int

    /**
     * Make a chat request using a language model.
     *
     * *Note* that language model use may be subject to access restrictions and user consent. Calling this function
     * for the first time (for an extension) will show a consent dialog to the user and because of that this function
     * must _only be called in response to a user action!_ Extensions can use [LanguageModelAccessInformation.canSendRequest]
     * to check if they have the necessary permissions to make a request.
     *
     * This function will return a rejected promise if making a request to the language model is not
     * possible. Reasons for this can be:
     *
     * - user consent not given, see [`NoPermissions`][LanguageModelError.NoPermissions]
     * - model does not exist anymore, see [`NotFound`][LanguageModelError.NotFound]
     * - quota limits exceeded, see [`Blocked`][LanguageModelError.Blocked]
     * - other issues in which case extension must check [`LanguageModelError.cause`][LanguageModelError.cause]
     *
     * An extension can make use of language model tool calling by passing a set of tools to
     * [LanguageModelChatRequestOptions.tools]. The language model will return a [LanguageModelToolCallPart] and
     * the extension can invoke the tool and make another request with the result.
     *
     * @param messages An array of message instances.
     * @param options Options that control the request.
     * @param token A cancellation token which controls the request. See [CancellationTokenSource] for how to create one.
     * @returns A thenable that resolves to a [LanguageModelChatResponse]. The promise will reject when the request couldn't be made.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#LanguageModelChat.sendRequest)
     */
    fun sendRequest(
        messages: ReadonlyArray<LanguageModelChatMessage>,
        options: LanguageModelChatRequestOptions = definedExternally,
        token: CancellationToken = definedExternally,
    ): PromiseLike<LanguageModelChatResponse>

    /**
     * Count the number of tokens in a message using the model specific tokenizer-logic.

     * @param text A string or a message instance.
     * @param token Optional cancellation token.  See [CancellationTokenSource] for how to create one.
     * @returns A thenable that resolves to the number of tokens.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#LanguageModelChat.countTokens)
     */
    fun countTokens(
        text: JsAny, /* string | LanguageModelChatMessage */
        token: CancellationToken = definedExternally,
    ): PromiseLike<JsInt>
}

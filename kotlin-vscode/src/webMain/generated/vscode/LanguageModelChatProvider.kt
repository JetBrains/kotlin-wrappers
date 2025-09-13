// Automatically generated - do not modify!

package vscode

import js.array.ReadonlyArray
import js.core.JsInt
import js.core.Void
import js.promise.PromiseLike
import kotlin.js.JsAny

/**
 * A LanguageModelChatProvider implements access to language models, which users can then use through the chat view, or through extension API by acquiring a LanguageModelChat.
 * An example of this would be an OpenAI provider that provides models like gpt-5, o3, etc.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#LanguageModelChatProvider)
 */
external interface LanguageModelChatProvider<T : LanguageModelChatInformation> {
    /**
     * An optional event fired when the available set of language models changes.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#LanguageModelChatProvider.onDidChangeLanguageModelChatInformation)
     */
    val onDidChangeLanguageModelChatInformation: Event<Void>?

    /**
     * Get the list of available language models provided by this provider
     * @param options Options which specify the calling context of this function
     * @param token A cancellation token
     * @returns The list of available language models
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#LanguageModelChatProvider.provideLanguageModelChatInformation)
     */
    fun provideLanguageModelChatInformation(
        options: PrepareLanguageModelChatModelOptions,
        token: CancellationToken,
    ): ProviderResult<ReadonlyArray<T>>

    /**
     * Returns the response for a chat request, passing the results to the progress callback.
     * The {@linkcode LanguageModelChatProvider} must emit the response parts to the progress callback as they are received from the language model.
     * @param model The language model to use
     * @param messages The messages to include in the request
     * @param options Options for the request
     * @param progress The progress to emit the streamed response chunks to
     * @param token A cancellation token
     * @returns A promise that resolves when the response is complete. Results are actually passed to the progress callback.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#LanguageModelChatProvider.provideLanguageModelChatResponse)
     */
    fun provideLanguageModelChatResponse(
        model: T,
        messages: ReadonlyArray<LanguageModelChatRequestMessage>,
        options: ProvideLanguageModelChatResponseOptions,
        progress: Progress<LanguageModelResponsePart>,
        token: CancellationToken,
    ): PromiseLike<Void>

    /**
     * Returns the number of tokens for a given text using the model-specific tokenizer logic
     * @param model The language model to use
     * @param text The text to count tokens for
     * @param token A cancellation token
     * @returns The number of tokens
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#LanguageModelChatProvider.provideTokenCount)
     */
    fun provideTokenCount(
        model: T,
        text: JsAny, /* string | LanguageModelChatRequestMessage */
        token: CancellationToken,
    ): PromiseLike<JsInt>
}

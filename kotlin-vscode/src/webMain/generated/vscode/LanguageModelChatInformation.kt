// Automatically generated - do not modify!

package vscode

import js.objects.JsPlainObject

/**
 * Represents a language model provided by a {@linkcode LanguageModelChatProvider}.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#LanguageModelChatInformation)
 */
@JsPlainObject
external interface LanguageModelChatInformation {
    /**
     * Unique identifier for the language model. Must be unique per provider, but not required to be globally unique.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#LanguageModelChatInformation.id)
     */
    val id: String

    /**
     * Human-readable name of the language model.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#LanguageModelChatInformation.name)
     */
    val name: String

    /**
     * Opaque family-name of the language model. Values might be `gpt-3.5-turbo`, `gpt4`, `phi2`, or `llama`
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#LanguageModelChatInformation.family)
     */
    val family: String

    /**
     * The tooltip to render when hovering the model. Used to provide more information about the model.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#LanguageModelChatInformation.tooltip)
     */
    val tooltip: String?

    /**
     * An optional, human-readable string which will be rendered alongside the model.
     * Useful for distinguishing models of the same name in the UI.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#LanguageModelChatInformation.detail)
     */
    val detail: String?

    /**
     * Opaque version string of the model.
     * This is used as a lookup value in {@linkcode LanguageModelChatSelector.version}
     * An example is how GPT 4o has multiple versions like 2024-11-20 and 2024-08-06
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#LanguageModelChatInformation.version)
     */
    val version: String

    /**
     * The maximum number of tokens the model can accept as input.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#LanguageModelChatInformation.maxInputTokens)
     */
    val maxInputTokens: Int

    /**
     * The maximum number of tokens the model is capable of producing.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#LanguageModelChatInformation.maxOutputTokens)
     */
    val maxOutputTokens: Int

    /**
     * Various features that the model supports such as tool calling or image input.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#LanguageModelChatInformation.capabilities)
     */
    val capabilities: LanguageModelChatCapabilities
}

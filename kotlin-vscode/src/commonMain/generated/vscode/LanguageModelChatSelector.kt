// Automatically generated - do not modify!

package vscode

/**
 * Describes how to select language models for chat requests.
 *
 * @see [lm.selectChatModels]
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#LanguageModelChatSelector)
 */
external interface LanguageModelChatSelector {
    /**
     * A vendor of language models.
     * @see [LanguageModelChat.vendor]
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#LanguageModelChatSelector.vendor)
     */
    var vendor: String?

    /**
     * A family of language models.
     * @see [LanguageModelChat.family]
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#LanguageModelChatSelector.family)
     */
    var family: String?

    /**
     * The version of a language model.
     * @see [LanguageModelChat.version]
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#LanguageModelChatSelector.version)
     */
    var version: String?

    /**
     * The identifier of a language model.
     * @see [LanguageModelChat.id]
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#LanguageModelChatSelector.id)
     */
    var id: String?
}

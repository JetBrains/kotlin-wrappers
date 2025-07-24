// Automatically generated - do not modify!

package vscode

/**
 * Describes how to select language models for chat requests.
 *
 * @see [lm.selectChatModels]
 */
external interface LanguageModelChatSelector {
    /**
     * A vendor of language models.
     * @see [LanguageModelChat.vendor]
     */
    var vendor: String?

    /**
     * A family of language models.
     * @see [LanguageModelChat.family]
     */
    var family: String?

    /**
     * The version of a language model.
     * @see [LanguageModelChat.version]
     */
    var version: String?

    /**
     * The identifier of a language model.
     * @see [LanguageModelChat.id]
     */
    var id: String?
}

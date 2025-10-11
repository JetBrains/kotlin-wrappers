// Automatically generated - do not modify!

package vscode

import js.core.Void

/**
 * Represents extension specific information about the access to language models.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#LanguageModelAccessInformation)
 */
external interface LanguageModelAccessInformation {
    /**
     * An event that fires when access information changes.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#LanguageModelAccessInformation.onDidChange)
     */
    val onDidChange: Event<Void>

    /**
     * Checks if a request can be made to a language model.
     *
     * *Note* that calling this function will not trigger a consent UI but just checks for a persisted state.
     *
     * @param chat A language model chat object.
     * @return `true` if a request can be made, `false` if not, `undefined` if the language
     * model does not exist or consent hasn't been asked for.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#LanguageModelAccessInformation.canSendRequest)
     */
    fun canSendRequest(chat: LanguageModelChat): Boolean?
}

// Automatically generated - do not modify!

package vscode

/**
 * Represents extension specific information about the access to language models.
 */
external interface LanguageModelAccessInformation {
    /**
     * An event that fires when access information changes.
     */
//  onDidChange: Event<void>;

    /**
     * Checks if a request can be made to a language model.
     *
     * *Note* that calling this function will not trigger a consent UI but just checks for a persisted state.
     *
     * @param chat A language model chat object.
     * @return `true` if a request can be made, `false` if not, `undefined` if the language
     * model does not exist or consent hasn't been asked for.
     */
//  canSendRequest(chat: LanguageModelChat): boolean | undefined;
}

// Automatically generated - do not modify!

package vscode

import js.objects.JsPlainObject

/**
 * The list of options passed into {@linkcode LanguageModelChatProvider.provideLanguageModelChatInformation}
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#PrepareLanguageModelChatModelOptions)
 */
@JsPlainObject
external interface PrepareLanguageModelChatModelOptions {
    /**
     * Whether or not the user should be prompted via some UI flow, or if models should be attempted to be resolved silently.
     * If silent is true, all models may not be resolved due to lack of info such as API keys.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#PrepareLanguageModelChatModelOptions.silent)
     */
    val silent: Boolean
}

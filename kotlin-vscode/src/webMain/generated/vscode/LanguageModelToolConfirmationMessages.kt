// Automatically generated - do not modify!

package vscode

import js.objects.JsPlainObject
import kotlin.js.JsAny

/**
 * When this is returned in [PreparedToolInvocation], the user will be asked to confirm before running the tool. These
 * messages will be shown with buttons that say "Continue" and "Cancel".
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#LanguageModelToolConfirmationMessages)
 */
@JsPlainObject
external interface LanguageModelToolConfirmationMessages {
    /**
     * The title of the confirmation message.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#LanguageModelToolConfirmationMessages.title)
     */
    var title: String

    /**
     * The body of the confirmation message.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#LanguageModelToolConfirmationMessages.message)
     */
    var message: JsAny /* string | MarkdownString */
}

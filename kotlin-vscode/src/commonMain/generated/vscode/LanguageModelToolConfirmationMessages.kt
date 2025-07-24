// Automatically generated - do not modify!

package vscode

import js.core.JsAny

/**
 * When this is returned in [PreparedToolInvocation], the user will be asked to confirm before running the tool. These
 * messages will be shown with buttons that say "Continue" and "Cancel".
 */
external interface LanguageModelToolConfirmationMessages {
    /**
     * The title of the confirmation message.
     */
    var title: String

    /**
     * The body of the confirmation message.
     */
    var message: JsAny /* string | MarkdownString */
}

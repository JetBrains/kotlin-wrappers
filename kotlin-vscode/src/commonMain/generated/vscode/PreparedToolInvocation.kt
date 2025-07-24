// Automatically generated - do not modify!

package vscode

import js.core.JsAny

/**
 * The result of a call to {@link LanguageModelTool.prepareInvocation}.
 */
external interface PreparedToolInvocation {
    /**
     * A customized progress message to show while the tool runs.
     */
    var invocationMessage: JsAny /* string | MarkdownString */?

    /**
     * The presence of this property indicates that the user should be asked to confirm before running the tool. The user
     * should be asked for confirmation for any tool that has a side-effect or may potentially be dangerous.
     */
    var confirmationMessages: LanguageModelToolConfirmationMessages?
}

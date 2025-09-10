// Automatically generated - do not modify!

package vscode

import js.objects.JsPlainObject
import kotlin.js.JsAny

/**
 * The result of a call to [LanguageModelTool.prepareInvocation].
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#PreparedToolInvocation)
 */
@JsPlainObject
external interface PreparedToolInvocation {
    /**
     * A customized progress message to show while the tool runs.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#PreparedToolInvocation.invocationMessage)
     */
    var invocationMessage: JsAny /* string | MarkdownString */?

    /**
     * The presence of this property indicates that the user should be asked to confirm before running the tool. The user
     * should be asked for confirmation for any tool that has a side-effect or may potentially be dangerous.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#PreparedToolInvocation.confirmationMessages)
     */
    var confirmationMessages: LanguageModelToolConfirmationMessages?
}

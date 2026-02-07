// Automatically generated - do not modify!

package vscode

import kotlinx.js.JsPlainObject

/**
 * Represents user feedback for a result.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#ChatResultFeedback)
 */
@JsPlainObject
external interface ChatResultFeedback {
    /**
     * The ChatResult for which the user is providing feedback.
     * This object has the same properties as the result returned from the participant callback, including `metadata`, but is not the same instance.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#ChatResultFeedback.result)
     */
    val result: ChatResult

    /**
     * The kind of feedback that was received.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#ChatResultFeedback.kind)
     */
    val kind: ChatResultFeedbackKind
}

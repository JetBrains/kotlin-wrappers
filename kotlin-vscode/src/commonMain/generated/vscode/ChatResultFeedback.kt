// Automatically generated - do not modify!

package vscode

/**
 * Represents user feedback for a result.
 */
external interface ChatResultFeedback {
    /**
     * The ChatResult for which the user is providing feedback.
     * This object has the same properties as the result returned from the participant callback, including `metadata`, but is not the same instance.
     */
    val result: ChatResult

    /**
     * The kind of feedback that was received.
     */
    val kind: ChatResultFeedbackKind
}

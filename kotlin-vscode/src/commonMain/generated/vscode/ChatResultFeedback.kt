// Automatically generated - do not modify!

package vscode

/**
 * Represents user feedback for a result.
 */
external interface ChatResultFeedback {
    /**
    // ORIGINAL SOURCE

    /**
     * The ChatResult for which the user is providing feedback.
     * This object has the same properties as the result returned from the participant callback, including `metadata`, but is not the same instance.
    */
    readonly result: ChatResult;

    /**
     * The kind of feedback that was received.
    */
    readonly kind: ChatResultFeedbackKind;

    // ORIGINAL SOURCE
     **/
}

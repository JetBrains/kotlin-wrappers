// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

/**
 * Represents the type of user feedback received.
 */
sealed /* enum */
external interface ChatResultFeedbackKind {
    companion object {
        /**
         * The user marked the result as unhelpful.
         */
        val Unhelpful: ChatResultFeedbackKind // 0

        /**
         * The user marked the result as helpful.
         */
        val Helpful: ChatResultFeedbackKind // 1
    }
}

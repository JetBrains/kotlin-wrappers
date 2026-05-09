// Automatically generated - do not modify!

@file:JsModule("vscode")

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

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

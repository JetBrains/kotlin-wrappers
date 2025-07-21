// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

/**
 * Possible kinds of UI that can use extensions.
 */
sealed /* enum */
external interface UIKind {
    companion object {
        /**
         * Extensions are accessed from a desktop application.
         */
        val Desktop: UIKind // 1

        /**
         * Extensions are accessed from a web browser.
         */
        val Web: UIKind // 2
    }
}

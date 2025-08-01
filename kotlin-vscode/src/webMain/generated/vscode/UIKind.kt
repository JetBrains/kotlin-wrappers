// Automatically generated - do not modify!

@file:JsModule("vscode")

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package vscode

import kotlin.js.JsModule

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

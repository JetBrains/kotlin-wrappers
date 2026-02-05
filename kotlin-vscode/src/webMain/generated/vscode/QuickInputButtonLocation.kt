// Automatically generated - do not modify!

@file:JsModule("vscode")

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package vscode

import kotlin.js.JsModule

/**
 * Specifies the location where a {@link QuickInputButton} should be rendered.
 */
sealed /* enum */
external interface QuickInputButtonLocation {
    companion object {
        /**
         * The button is rendered in the title bar.
         */
        val Title: QuickInputButtonLocation // 1

        /**
         * The button is rendered inline to the right of the input box.
         */
        val Inline: QuickInputButtonLocation // 2

        /**
         * The button is rendered at the far end inside the input box.
         */
        val Input: QuickInputButtonLocation // 3
    }
}

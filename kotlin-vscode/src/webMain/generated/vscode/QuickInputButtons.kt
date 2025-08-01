// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

import kotlin.js.JsModule

/**
 * Predefined buttons for [QuickPick] and [InputBox].
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#QuickInputButtons)
 */
open external class QuickInputButtons {
    /**
     * @hidden
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#QuickInputButtons.constructor)
     */
    private constructor()

    companion object {
        /**
         * A back button for [QuickPick] and [InputBox].
         *
         * When a navigation 'back' button is needed this one should be used for consistency.
         * It comes with a predefined icon, tooltip and location.
         *
         * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#QuickInputButtons.Back)
         */
        val Back: QuickInputButton
    }
}

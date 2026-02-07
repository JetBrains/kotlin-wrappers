// Automatically generated - do not modify!

package vscode

import kotlinx.js.JsPlainObject

/**
 * A button for an action in a [QuickPick] or [InputBox].
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#QuickInputButton)
 */
@JsPlainObject
external interface QuickInputButton {
    /**
     * The icon for the button.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#QuickInputButton.iconPath)
     */
    val iconPath: IconPath

    /**
     * An optional tooltip displayed when hovering over the button.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#QuickInputButton.tooltip)
     */
    val tooltip: String?

    /**
     * The location where the button should be rendered.
     *
     * Defaults to [QuickInputButtonLocation.Title].
     *
     * **Note:** This property is ignored if the button was added to a [QuickPickItem].
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#QuickInputButton.location)
     */
    var location: QuickInputButtonLocation?

    /**
     * When present, indicates that the button is a toggle button that can be checked or unchecked.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#QuickInputButton.toggle)
     */
    /*
    readonly toggle?: {
        /**
         * Indicates whether the toggle button is currently checked.
         * This property will be updated when the button is toggled.
         */
        checked: boolean;
    }
    */
}

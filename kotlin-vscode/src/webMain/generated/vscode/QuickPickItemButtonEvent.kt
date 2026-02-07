// Automatically generated - do not modify!

package vscode

import kotlinx.js.JsPlainObject

/**
 * An event describing a button that was pressed on a [QuickPickItem].
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#QuickPickItemButtonEvent)
 */
@JsPlainObject
external interface QuickPickItemButtonEvent<
        T :
        QuickPickItem,
        > {
    /**
     * The button that was pressed.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#QuickPickItemButtonEvent.button)
     */
    val button: QuickInputButton

    /**
     * The item that the button belongs to.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#QuickPickItemButtonEvent.item)
     */
    val item: T
}

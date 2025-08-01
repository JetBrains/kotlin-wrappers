// Automatically generated - do not modify!

package vscode

import js.objects.JsPlainObject

/**
 * An event signaling when a button in a particular [QuickPickItem] was triggered.
 * This event does not fire for buttons in the title bar.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#QuickPickItemButtonEvent)
 */
@JsPlainObject
external interface QuickPickItemButtonEvent<
        T :
        QuickPickItem,
        > {
    /**
     * The button that was clicked.
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

// Automatically generated - do not modify!

package vscode

/**
 * Represents the state of a window.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#WindowState)
 */
external interface WindowState {
    /**
     * Whether the current window is focused.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#WindowState.focused)
     */
    val focused: Boolean

    /**
     * Whether the window has been interacted with recently. This will change
     * immediately on activity, or after a short time of user inactivity.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#WindowState.active)
     */
    val active: Boolean
}

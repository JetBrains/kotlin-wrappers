// Automatically generated - do not modify!

package vscode

/**
 * Represents the state of a window.
 */
external interface WindowState {
    /**
     * Whether the current window is focused.
     */
    val focused: Boolean

    /**
     * Whether the window has been interacted with recently. This will change
     * immediately on activity, or after a short time of user inactivity.
     */
    val active: Boolean
}

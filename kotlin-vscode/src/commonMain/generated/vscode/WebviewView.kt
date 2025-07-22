// Automatically generated - do not modify!

package vscode

import js.core.Void

/**
 * A webview based view.
 */
external interface WebviewView {
    /**
     * Identifies the type of the webview view, such as `'hexEditor.dataView'`.
     */
    val viewType: String

    /**
     * The underlying webview for the view.
     */
    val webview: Webview

    /**
     * View title displayed in the UI.
     *
     * The view title is initially taken from the extension `package.json` contribution.
     */
//  title?: string

    /**
     * Human-readable string which is rendered less prominently in the title.
     */
//  description?: string

    /**
     * The badge to display for this webview view.
     * To remove the badge, set to undefined.
     */
//  badge?: ViewBadge | undefined

    /**
     * Event fired when the view is disposed.
     *
     * Views are disposed when they are explicitly hidden by a user (this happens when a user
     * right clicks in a view and unchecks the webview view).
     *
     * Trying to use the view after it has been disposed throws an exception.
     */
    val onDidDispose: Event<Void>

    /**
     * Tracks if the webview is currently visible.
     *
     * Views are visible when they are on the screen and expanded.
     */
    val visible: Boolean

    /**
     * Event fired when the visibility of the view changes.
     *
     * Actions that trigger a visibility change:
     *
     * - The view is collapsed or expanded.
     * - The user switches to a different view group in the sidebar or panel.
     *
     * Note that hiding a view using the context menu instead disposes of the view and fires `onDidDispose`.
     */
    val onDidChangeVisibility: Event<Void>

    /**
     * Reveal the view in the UI.
     *
     * If the view is collapsed, this will expand it.
     *
     * @param preserveFocus When `true` the view will not take focus.
     */
//  show(preserveFocus?: boolean): void
}

// Automatically generated - do not modify!

package vscode

import js.core.Void
import kotlin.js.definedExternally

/**
 * A webview based view.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#WebviewView)
 */
external interface WebviewView {
    /**
     * Identifies the type of the webview view, such as `'hexEditor.dataView'`.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#WebviewView.viewType)
     */
    val viewType: String

    /**
     * The underlying webview for the view.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#WebviewView.webview)
     */
    val webview: Webview

    /**
     * View title displayed in the UI.
     *
     * The view title is initially taken from the extension `package.json` contribution.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#WebviewView.title)
     */
    var title: String?

    /**
     * Human-readable string which is rendered less prominently in the title.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#WebviewView.description)
     */
    var description: String?

    /**
     * The badge to display for this webview view.
     * To remove the badge, set to undefined.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#WebviewView.badge)
     */
    var badge: ViewBadge?

    /**
     * Event fired when the view is disposed.
     *
     * Views are disposed when they are explicitly hidden by a user (this happens when a user
     * right clicks in a view and unchecks the webview view).
     *
     * Trying to use the view after it has been disposed throws an exception.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#WebviewView.onDidDispose)
     */
    val onDidDispose: Event<Void>

    /**
     * Tracks if the webview is currently visible.
     *
     * Views are visible when they are on the screen and expanded.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#WebviewView.visible)
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
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#WebviewView.onDidChangeVisibility)
     */
    val onDidChangeVisibility: Event<Void>

    /**
     * Reveal the view in the UI.
     *
     * If the view is collapsed, this will expand it.
     *
     * @param preserveFocus When `true` the view will not take focus.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#WebviewView.show)
     */
    fun show(preserveFocus: Boolean = definedExternally)
}

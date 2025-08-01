// Automatically generated - do not modify!

package vscode

import js.core.Void
import kotlin.js.definedExternally

/**
 * A panel that contains a webview.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#WebviewPanel)
 */
external interface WebviewPanel :
    DisposableLike {
    /**
     * Identifies the type of the webview panel, such as `'markdown.preview'`.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#WebviewPanel.viewType)
     */
    val viewType: String

    /**
     * Title of the panel shown in UI.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#WebviewPanel.title)
     */
    var title: String

    /**
     * Icon for the panel shown in UI.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#WebviewPanel.iconPath)
     */
    /*
    iconPath?: Uri | {
        /**
         * The icon path for the light theme.
         */
        readonly light: Uri;
        /**
         * The icon path for the dark theme.
         */
        readonly dark: Uri;
    }
    */

    /**
     * {@linkcode Webview} belonging to the panel.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#WebviewPanel.webview)
     */
    val webview: Webview

    /**
     * Content settings for the webview panel.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#WebviewPanel.options)
     */
    val options: WebviewPanelOptions

    /**
     * Editor position of the panel. This property is only set if the webview is in
     * one of the editor view columns.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#WebviewPanel.viewColumn)
     */
    val viewColumn: ViewColumn?

    /**
     * Whether the panel is active (focused by the user).
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#WebviewPanel.active)
     */
    val active: Boolean

    /**
     * Whether the panel is visible.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#WebviewPanel.visible)
     */
    val visible: Boolean

    /**
     * Fired when the panel's view state changes.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#WebviewPanel.onDidChangeViewState)
     */
    val onDidChangeViewState: Event<WebviewPanelOnDidChangeViewStateEvent>

    /**
     * Fired when the panel is disposed.
     *
     * This may be because the user closed the panel or because `.dispose()` was
     * called on it.
     *
     * Trying to use the panel after it has been disposed throws an exception.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#WebviewPanel.onDidDispose)
     */
    val onDidDispose: Event<Void>

    /**
     * Show the webview panel in a given column.
     *
     * A webview panel may only show in a single column at a time. If it is already showing, this
     * method moves it to a new column.
     *
     * @param viewColumn View column to show the panel in. Shows in the current `viewColumn` if undefined.
     * @param preserveFocus When `true`, the webview will not take focus.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#WebviewPanel.reveal)
     */
    fun reveal(
        viewColumn: ViewColumn = definedExternally,
        preserveFocus: Boolean = definedExternally,
    )

    /**
     * Dispose of the webview panel.
     *
     * This closes the panel if it showing and disposes of the resources owned by the webview.
     * Webview panels are also disposed when the user closes the webview panel. Both cases
     * fire the `onDispose` event.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#WebviewPanel.dispose)
     */
    override fun dispose()
}

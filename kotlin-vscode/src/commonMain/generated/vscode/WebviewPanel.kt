// Automatically generated - do not modify!

package vscode

import js.core.Void

/**
 * A panel that contains a webview.
 */
external interface WebviewPanel {
    /**
     * Identifies the type of the webview panel, such as `'markdown.preview'`.
     */
    val viewType: String

    /**
     * Title of the panel shown in UI.
     */
    var title: String

    /**
     * Icon for the panel shown in UI.
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
     */
    val webview: Webview

    /**
     * Content settings for the webview panel.
     */
    val options: WebviewPanelOptions

    /**
     * Editor position of the panel. This property is only set if the webview is in
     * one of the editor view columns.
     */
    val viewColumn: ViewColumn

    /**
     * Whether the panel is active (focused by the user).
     */
    val active: Boolean

    /**
     * Whether the panel is visible.
     */
    val visible: Boolean

    /**
     * Fired when the panel's view state changes.
     */
    val onDidChangeViewState: Event<WebviewPanelOnDidChangeViewStateEvent>

    /**
     * Fired when the panel is disposed.
     *
     * This may be because the user closed the panel or because `.dispose()` was
     * called on it.
     *
     * Trying to use the panel after it has been disposed throws an exception.
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
     */
//  reveal(viewColumn?: ViewColumn, preserveFocus?: boolean): void

    /**
     * Dispose of the webview panel.
     *
     * This closes the panel if it showing and disposes of the resources owned by the webview.
     * Webview panels are also disposed when the user closes the webview panel. Both cases
     * fire the `onDispose` event.
     */
//  dispose(): any
}

// Automatically generated - do not modify!

package vscode

import js.objects.JsPlainObject

/**
 * Content settings for a webview panel.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#WebviewPanelOptions)
 */
@JsPlainObject
external interface WebviewPanelOptions {
    /**
     * Controls if the find widget is enabled in the panel.
     *
     * Defaults to `false`.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#WebviewPanelOptions.enableFindWidget)
     */
    val enableFindWidget: Boolean?

    /**
     * Controls if the webview panel's content (iframe) is kept around even when the panel
     * is no longer visible.
     *
     * Normally the webview panel's html context is created when the panel becomes visible
     * and destroyed when it is hidden. Extensions that have complex state
     * or UI can set the `retainContextWhenHidden` to make the editor keep the webview
     * context around, even when the webview moves to a background tab. When a webview using
     * `retainContextWhenHidden` becomes hidden, its scripts and other dynamic content are suspended.
     * When the panel becomes visible again, the context is automatically restored
     * in the exact same state it was in originally. You cannot send messages to a
     * hidden webview, even with `retainContextWhenHidden` enabled.
     *
     * `retainContextWhenHidden` has a high memory overhead and should only be used if
     * your panel's context cannot be quickly saved and restored.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#WebviewPanelOptions.retainContextWhenHidden)
     */
    val retainContextWhenHidden: Boolean?
}

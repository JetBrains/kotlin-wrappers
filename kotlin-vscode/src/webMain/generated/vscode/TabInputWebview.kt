// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

import kotlin.js.JsModule

/**
 * The tab represents a webview.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TabInputWebview)
 */
open external class TabInputWebview {
    /**
     * The type of webview. Maps to {@linkcode WebviewPanel.viewType WebviewPanel's viewType}
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TabInputWebview.viewType)
     */
    val viewType: String

    /**
     * Constructs a webview tab input with the given view type.
     * @param viewType The type of webview. Maps to {@linkcode WebviewPanel.viewType WebviewPanel's viewType}
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TabInputWebview.constructor)
     */
    constructor(viewType: String)
}

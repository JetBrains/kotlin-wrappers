// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

import kotlin.js.JsModule

/**
 * The tab represents a custom editor.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TabInputCustom)
 */
open external class TabInputCustom {
    /**
     * The uri that the tab is representing.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TabInputCustom.uri)
     */
    val uri: Uri

    /**
     * The type of custom editor.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TabInputCustom.viewType)
     */
    val viewType: String

    /**
     * Constructs a custom editor tab input.
     * @param uri The uri of the tab.
     * @param viewType The viewtype of the custom editor.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TabInputCustom.constructor)
     */
    constructor(
        uri: Uri,
        viewType: String,
    )
}

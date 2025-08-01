// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

import kotlin.js.JsModule

/**
 * The tab represents two text based resources
 * being rendered as a diff.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TabInputTextDiff)
 */
open external class TabInputTextDiff {
    /**
     * The uri of the original text resource.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TabInputTextDiff.original)
     */
    val original: Uri

    /**
     * The uri of the modified text resource.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TabInputTextDiff.modified)
     */
    val modified: Uri

    /**
     * Constructs a new text diff tab input with the given URIs.
     * @param original The uri of the original text resource.
     * @param modified The uri of the modified text resource.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TabInputTextDiff.constructor)
     */
    constructor(
        original: Uri,
        modified: Uri,
    )
}

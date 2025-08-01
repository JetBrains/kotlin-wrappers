// Automatically generated - do not modify!

package vscode

import js.objects.JsPlainObject

/**
 * The decorations for a [source control resource state][SourceControlResourceState].
 * Can be independently specified for light and dark themes.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#SourceControlResourceDecorations)
 */
@JsPlainObject
external interface SourceControlResourceDecorations :
    SourceControlResourceThemableDecorations {
    /**
     * Whether the [source control resource state][SourceControlResourceState] should
     * be striked-through in the UI.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#SourceControlResourceDecorations.strikeThrough)
     */
    val strikeThrough: Boolean?

    /**
     * Whether the [source control resource state][SourceControlResourceState] should
     * be faded in the UI.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#SourceControlResourceDecorations.faded)
     */
    val faded: Boolean?

    /**
     * The title for a specific
     * [source control resource state][SourceControlResourceState].
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#SourceControlResourceDecorations.tooltip)
     */
    val tooltip: String?

    /**
     * The light theme decorations.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#SourceControlResourceDecorations.light)
     */
    val light: SourceControlResourceThemableDecorations?

    /**
     * The dark theme decorations.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#SourceControlResourceDecorations.dark)
     */
    val dark: SourceControlResourceThemableDecorations?
}

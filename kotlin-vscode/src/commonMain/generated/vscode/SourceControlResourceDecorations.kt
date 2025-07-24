// Automatically generated - do not modify!

package vscode

/**
 * The decorations for a [source control resource state][SourceControlResourceState].
 * Can be independently specified for light and dark themes.
 */
external interface SourceControlResourceDecorations :
    SourceControlResourceThemableDecorations {
    /**
     * Whether the [source control resource state][SourceControlResourceState] should
     * be striked-through in the UI.
     */
    val strikeThrough: Boolean?

    /**
     * Whether the [source control resource state][SourceControlResourceState] should
     * be faded in the UI.
     */
    val faded: Boolean?

    /**
     * The title for a specific
     * [source control resource state][SourceControlResourceState].
     */
    val tooltip: String?

    /**
     * The light theme decorations.
     */
    val light: SourceControlResourceThemableDecorations?

    /**
     * The dark theme decorations.
     */
    val dark: SourceControlResourceThemableDecorations?
}

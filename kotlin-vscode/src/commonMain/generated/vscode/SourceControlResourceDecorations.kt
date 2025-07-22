// Automatically generated - do not modify!

package vscode

/**
 * The decorations for a {@link SourceControlResourceState source control resource state}.
 * Can be independently specified for light and dark themes.
 */
external interface SourceControlResourceDecorations :
    SourceControlResourceThemableDecorations {
    /**
     * Whether the {@link SourceControlResourceState source control resource state} should
     * be striked-through in the UI.
     */
    val strikeThrough: Boolean?

    /**
     * Whether the {@link SourceControlResourceState source control resource state} should
     * be faded in the UI.
     */
    val faded: Boolean?

    /**
     * The title for a specific
     * {@link SourceControlResourceState source control resource state}.
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

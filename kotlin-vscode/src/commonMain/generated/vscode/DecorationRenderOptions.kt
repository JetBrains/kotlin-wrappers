// Automatically generated - do not modify!

package vscode

/**
 * Represents rendering styles for a [text editor decoration][TextEditorDecorationType].
 */
external interface DecorationRenderOptions :
    ThemableDecorationRenderOptions {
    /**
     * Should the decoration be rendered also on the whitespace after the line text.
     * Defaults to `false`.
     */
    var isWholeLine: Boolean?

    /**
     * Customize the growing behavior of the decoration when edits occur at the edges of the decoration's range.
     * Defaults to `DecorationRangeBehavior.OpenOpen`.
     */
    var rangeBehavior: DecorationRangeBehavior?

    /**
     * The position in the overview ruler where the decoration should be rendered.
     */
    var overviewRulerLane: OverviewRulerLane?

    /**
     * Overwrite options for light themes.
     */
    var light: ThemableDecorationRenderOptions?

    /**
     * Overwrite options for dark themes.
     */
    var dark: ThemableDecorationRenderOptions?
}

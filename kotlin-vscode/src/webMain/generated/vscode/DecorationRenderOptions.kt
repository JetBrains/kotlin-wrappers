// Automatically generated - do not modify!

package vscode

import js.objects.JsPlainObject

/**
 * Represents rendering styles for a [text editor decoration][TextEditorDecorationType].
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#DecorationRenderOptions)
 */
@JsPlainObject
external interface DecorationRenderOptions :
    ThemableDecorationRenderOptions {
    /**
     * Should the decoration be rendered also on the whitespace after the line text.
     * Defaults to `false`.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#DecorationRenderOptions.isWholeLine)
     */
    var isWholeLine: Boolean?

    /**
     * Customize the growing behavior of the decoration when edits occur at the edges of the decoration's range.
     * Defaults to `DecorationRangeBehavior.OpenOpen`.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#DecorationRenderOptions.rangeBehavior)
     */
    var rangeBehavior: DecorationRangeBehavior?

    /**
     * The position in the overview ruler where the decoration should be rendered.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#DecorationRenderOptions.overviewRulerLane)
     */
    var overviewRulerLane: OverviewRulerLane?

    /**
     * Overwrite options for light themes.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#DecorationRenderOptions.light)
     */
    var light: ThemableDecorationRenderOptions?

    /**
     * Overwrite options for dark themes.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#DecorationRenderOptions.dark)
     */
    var dark: ThemableDecorationRenderOptions?
}

// Automatically generated - do not modify!

package vscode

import kotlinx.js.JsPlainObject
import kotlin.js.JsAny

/**
 * Represents theme specific rendering styles for a [text editor decoration][TextEditorDecorationType].
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#ThemableDecorationRenderOptions)
 */
@JsPlainObject
external interface ThemableDecorationRenderOptions {
    /**
     * Background color of the decoration. Use rgba() and define transparent background colors to play well with other decorations.
     * Alternatively a color from the color registry can be [referenced][ThemeColor].
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#ThemableDecorationRenderOptions.backgroundColor)
     */
    var backgroundColor: JsAny /* string | ThemeColor */?

    /**
     * CSS styling property that will be applied to text enclosed by a decoration.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#ThemableDecorationRenderOptions.outline)
     */
    var outline: String?

    /**
     * CSS styling property that will be applied to text enclosed by a decoration.
     * Better use 'outline' for setting one or more of the individual outline properties.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#ThemableDecorationRenderOptions.outlineColor)
     */
    var outlineColor: JsAny /* string | ThemeColor */?

    /**
     * CSS styling property that will be applied to text enclosed by a decoration.
     * Better use 'outline' for setting one or more of the individual outline properties.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#ThemableDecorationRenderOptions.outlineStyle)
     */
    var outlineStyle: String?

    /**
     * CSS styling property that will be applied to text enclosed by a decoration.
     * Better use 'outline' for setting one or more of the individual outline properties.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#ThemableDecorationRenderOptions.outlineWidth)
     */
    var outlineWidth: String?

    /**
     * CSS styling property that will be applied to text enclosed by a decoration.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#ThemableDecorationRenderOptions.border)
     */
    var border: String?

    /**
     * CSS styling property that will be applied to text enclosed by a decoration.
     * Better use 'border' for setting one or more of the individual border properties.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#ThemableDecorationRenderOptions.borderColor)
     */
    var borderColor: JsAny /* string | ThemeColor */?

    /**
     * CSS styling property that will be applied to text enclosed by a decoration.
     * Better use 'border' for setting one or more of the individual border properties.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#ThemableDecorationRenderOptions.borderRadius)
     */
    var borderRadius: String?

    /**
     * CSS styling property that will be applied to text enclosed by a decoration.
     * Better use 'border' for setting one or more of the individual border properties.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#ThemableDecorationRenderOptions.borderSpacing)
     */
    var borderSpacing: String?

    /**
     * CSS styling property that will be applied to text enclosed by a decoration.
     * Better use 'border' for setting one or more of the individual border properties.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#ThemableDecorationRenderOptions.borderStyle)
     */
    var borderStyle: String?

    /**
     * CSS styling property that will be applied to text enclosed by a decoration.
     * Better use 'border' for setting one or more of the individual border properties.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#ThemableDecorationRenderOptions.borderWidth)
     */
    var borderWidth: String?

    /**
     * CSS styling property that will be applied to text enclosed by a decoration.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#ThemableDecorationRenderOptions.fontStyle)
     */
    var fontStyle: String?

    /**
     * CSS styling property that will be applied to text enclosed by a decoration.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#ThemableDecorationRenderOptions.fontWeight)
     */
    var fontWeight: String?

    /**
     * CSS styling property that will be applied to text enclosed by a decoration.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#ThemableDecorationRenderOptions.textDecoration)
     */
    var textDecoration: String?

    /**
     * CSS styling property that will be applied to text enclosed by a decoration.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#ThemableDecorationRenderOptions.cursor)
     */
    var cursor: String?

    /**
     * CSS styling property that will be applied to text enclosed by a decoration.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#ThemableDecorationRenderOptions.color)
     */
    var color: JsAny /* string | ThemeColor */?

    /**
     * CSS styling property that will be applied to text enclosed by a decoration.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#ThemableDecorationRenderOptions.opacity)
     */
    var opacity: String?

    /**
     * CSS styling property that will be applied to text enclosed by a decoration.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#ThemableDecorationRenderOptions.letterSpacing)
     */
    var letterSpacing: String?

    /**
     * An **absolute path** or an URI to an image to be rendered in the gutter.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#ThemableDecorationRenderOptions.gutterIconPath)
     */
    var gutterIconPath: JsAny /* string | Uri */?

    /**
     * Specifies the size of the gutter icon.
     * Available values are 'auto', 'contain', 'cover' and any percentage value.
     * For further information: https://msdn.microsoft.com/en-us/library/jj127316(v=vs.85).aspx
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#ThemableDecorationRenderOptions.gutterIconSize)
     */
    var gutterIconSize: String?

    /**
     * The color of the decoration in the overview ruler. Use rgba() and define transparent colors to play well with other decorations.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#ThemableDecorationRenderOptions.overviewRulerColor)
     */
    var overviewRulerColor: JsAny /* string | ThemeColor */?

    /**
     * Defines the rendering options of the attachment that is inserted before the decorated text.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#ThemableDecorationRenderOptions.before)
     */
    var before: ThemableDecorationAttachmentRenderOptions?

    /**
     * Defines the rendering options of the attachment that is inserted after the decorated text.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#ThemableDecorationRenderOptions.after)
     */
    var after: ThemableDecorationAttachmentRenderOptions?
}

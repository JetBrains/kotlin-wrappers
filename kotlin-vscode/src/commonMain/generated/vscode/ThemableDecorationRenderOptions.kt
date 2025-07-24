// Automatically generated - do not modify!

package vscode

import js.core.JsAny

/**
 * Represents theme specific rendering styles for a [text editor decoration][TextEditorDecorationType].
 */
external interface ThemableDecorationRenderOptions {
    /**
     * Background color of the decoration. Use rgba() and define transparent background colors to play well with other decorations.
     * Alternatively a color from the color registry can be [referenced][ThemeColor].
     */
    var backgroundColor: JsAny /* string | ThemeColor */?

    /**
     * CSS styling property that will be applied to text enclosed by a decoration.
     */
    var outline: String?

    /**
     * CSS styling property that will be applied to text enclosed by a decoration.
     * Better use 'outline' for setting one or more of the individual outline properties.
     */
    var outlineColor: JsAny /* string | ThemeColor */?

    /**
     * CSS styling property that will be applied to text enclosed by a decoration.
     * Better use 'outline' for setting one or more of the individual outline properties.
     */
    var outlineStyle: String?

    /**
     * CSS styling property that will be applied to text enclosed by a decoration.
     * Better use 'outline' for setting one or more of the individual outline properties.
     */
    var outlineWidth: String?

    /**
     * CSS styling property that will be applied to text enclosed by a decoration.
     */
    var border: String?

    /**
     * CSS styling property that will be applied to text enclosed by a decoration.
     * Better use 'border' for setting one or more of the individual border properties.
     */
    var borderColor: JsAny /* string | ThemeColor */?

    /**
     * CSS styling property that will be applied to text enclosed by a decoration.
     * Better use 'border' for setting one or more of the individual border properties.
     */
    var borderRadius: String?

    /**
     * CSS styling property that will be applied to text enclosed by a decoration.
     * Better use 'border' for setting one or more of the individual border properties.
     */
    var borderSpacing: String?

    /**
     * CSS styling property that will be applied to text enclosed by a decoration.
     * Better use 'border' for setting one or more of the individual border properties.
     */
    var borderStyle: String?

    /**
     * CSS styling property that will be applied to text enclosed by a decoration.
     * Better use 'border' for setting one or more of the individual border properties.
     */
    var borderWidth: String?

    /**
     * CSS styling property that will be applied to text enclosed by a decoration.
     */
    var fontStyle: String?

    /**
     * CSS styling property that will be applied to text enclosed by a decoration.
     */
    var fontWeight: String?

    /**
     * CSS styling property that will be applied to text enclosed by a decoration.
     */
    var textDecoration: String?

    /**
     * CSS styling property that will be applied to text enclosed by a decoration.
     */
    var cursor: String?

    /**
     * CSS styling property that will be applied to text enclosed by a decoration.
     */
    var color: JsAny /* string | ThemeColor */?

    /**
     * CSS styling property that will be applied to text enclosed by a decoration.
     */
    var opacity: String?

    /**
     * CSS styling property that will be applied to text enclosed by a decoration.
     */
    var letterSpacing: String?

    /**
     * An **absolute path** or an URI to an image to be rendered in the gutter.
     */
    var gutterIconPath: JsAny /* string | Uri */?

    /**
     * Specifies the size of the gutter icon.
     * Available values are 'auto', 'contain', 'cover' and any percentage value.
     * For further information: https://msdn.microsoft.com/en-us/library/jj127316(v=vs.85).aspx
     */
    var gutterIconSize: String?

    /**
     * The color of the decoration in the overview ruler. Use rgba() and define transparent colors to play well with other decorations.
     */
    var overviewRulerColor: JsAny /* string | ThemeColor */?

    /**
     * Defines the rendering options of the attachment that is inserted before the decorated text.
     */
    var before: ThemableDecorationAttachmentRenderOptions?

    /**
     * Defines the rendering options of the attachment that is inserted after the decorated text.
     */
    var after: ThemableDecorationAttachmentRenderOptions?
}

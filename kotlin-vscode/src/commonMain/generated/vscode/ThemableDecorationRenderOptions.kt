// Automatically generated - do not modify!

package vscode

/**
 * Represents theme specific rendering styles for a {@link TextEditorDecorationType text editor decoration}.
 */
external interface ThemableDecorationRenderOptions {
    /**
    // ORIGINAL SOURCE

    /**
     * Background color of the decoration. Use rgba() and define transparent background colors to play well with other decorations.
     * Alternatively a color from the color registry can be {@link ThemeColor referenced}.
    */
    backgroundColor?: string | ThemeColor;

    /**
     * CSS styling property that will be applied to text enclosed by a decoration.
    */
    outline?: string;

    /**
     * CSS styling property that will be applied to text enclosed by a decoration.
     * Better use 'outline' for setting one or more of the individual outline properties.
    */
    outlineColor?: string | ThemeColor;

    /**
     * CSS styling property that will be applied to text enclosed by a decoration.
     * Better use 'outline' for setting one or more of the individual outline properties.
    */
    outlineStyle?: string;

    /**
     * CSS styling property that will be applied to text enclosed by a decoration.
     * Better use 'outline' for setting one or more of the individual outline properties.
    */
    outlineWidth?: string;

    /**
     * CSS styling property that will be applied to text enclosed by a decoration.
    */
    border?: string;

    /**
     * CSS styling property that will be applied to text enclosed by a decoration.
     * Better use 'border' for setting one or more of the individual border properties.
    */
    borderColor?: string | ThemeColor;

    /**
     * CSS styling property that will be applied to text enclosed by a decoration.
     * Better use 'border' for setting one or more of the individual border properties.
    */
    borderRadius?: string;

    /**
     * CSS styling property that will be applied to text enclosed by a decoration.
     * Better use 'border' for setting one or more of the individual border properties.
    */
    borderSpacing?: string;

    /**
     * CSS styling property that will be applied to text enclosed by a decoration.
     * Better use 'border' for setting one or more of the individual border properties.
    */
    borderStyle?: string;

    /**
     * CSS styling property that will be applied to text enclosed by a decoration.
     * Better use 'border' for setting one or more of the individual border properties.
    */
    borderWidth?: string;

    /**
     * CSS styling property that will be applied to text enclosed by a decoration.
    */
    fontStyle?: string;

    /**
     * CSS styling property that will be applied to text enclosed by a decoration.
    */
    fontWeight?: string;

    /**
     * CSS styling property that will be applied to text enclosed by a decoration.
    */
    textDecoration?: string;

    /**
     * CSS styling property that will be applied to text enclosed by a decoration.
    */
    cursor?: string;

    /**
     * CSS styling property that will be applied to text enclosed by a decoration.
    */
    color?: string | ThemeColor;

    /**
     * CSS styling property that will be applied to text enclosed by a decoration.
    */
    opacity?: string;

    /**
     * CSS styling property that will be applied to text enclosed by a decoration.
    */
    letterSpacing?: string;

    /**
     * An **absolute path** or an URI to an image to be rendered in the gutter.
    */
    gutterIconPath?: string | Uri;

    /**
     * Specifies the size of the gutter icon.
     * Available values are 'auto', 'contain', 'cover' and any percentage value.
     * For further information: https://msdn.microsoft.com/en-us/library/jj127316(v=vs.85).aspx
    */
    gutterIconSize?: string;

    /**
     * The color of the decoration in the overview ruler. Use rgba() and define transparent colors to play well with other decorations.
    */
    overviewRulerColor?: string | ThemeColor;

    /**
     * Defines the rendering options of the attachment that is inserted before the decorated text.
    */
    before?: ThemableDecorationAttachmentRenderOptions;

    /**
     * Defines the rendering options of the attachment that is inserted after the decorated text.
    */
    after?: ThemableDecorationAttachmentRenderOptions;

    // ORIGINAL SOURCE
     **/
}

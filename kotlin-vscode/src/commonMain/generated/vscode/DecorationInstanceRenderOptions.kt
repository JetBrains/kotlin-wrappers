// Automatically generated - do not modify!

package vscode

/**
 * Represents render options for decoration instances. See {@link DecorationOptions.renderOptions}.
 */
external interface DecorationInstanceRenderOptions :
    ThemableDecorationInstanceRenderOptions {
    /**
     * Overwrite options for light themes.
     */
    var light: ThemableDecorationInstanceRenderOptions?

    /**
     * Overwrite options for dark themes.
     */
    var dark: ThemableDecorationInstanceRenderOptions?
}

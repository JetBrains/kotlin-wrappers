// Automatically generated - do not modify!

package vscode

import kotlinx.js.JsPlainObject

/**
 * Represents render options for decoration instances. See [DecorationOptions.renderOptions].
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#DecorationInstanceRenderOptions)
 */
@JsPlainObject
external interface DecorationInstanceRenderOptions :
    ThemableDecorationInstanceRenderOptions {
    /**
     * Overwrite options for light themes.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#DecorationInstanceRenderOptions.light)
     */
    var light: ThemableDecorationInstanceRenderOptions?

    /**
     * Overwrite options for dark themes.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#DecorationInstanceRenderOptions.dark)
     */
    var dark: ThemableDecorationInstanceRenderOptions?
}

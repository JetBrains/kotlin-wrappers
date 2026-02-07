// Automatically generated - do not modify!

package vscode

import kotlinx.js.JsPlainObject

/**
 * Represents themable render options for decoration instances.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#ThemableDecorationInstanceRenderOptions)
 */
@JsPlainObject
external interface ThemableDecorationInstanceRenderOptions {
    /**
     * Defines the rendering options of the attachment that is inserted before the decorated text.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#ThemableDecorationInstanceRenderOptions.before)
     */
    var before: ThemableDecorationAttachmentRenderOptions?

    /**
     * Defines the rendering options of the attachment that is inserted after the decorated text.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#ThemableDecorationInstanceRenderOptions.after)
     */
    var after: ThemableDecorationAttachmentRenderOptions?
}

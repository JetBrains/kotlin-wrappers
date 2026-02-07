// Automatically generated - do not modify!

package vscode

import kotlinx.js.JsPlainObject
import kotlin.js.JsAny

/**
 * Represents theme specific rendering styles for [before][ThemableDecorationRenderOptions.before] and
 * [after][ThemableDecorationRenderOptions.after] the content of text decorations.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#ThemableDecorationAttachmentRenderOptions)
 */
@JsPlainObject
external interface ThemableDecorationAttachmentRenderOptions {
    /**
     * Defines a text content that is shown in the attachment. Either an icon or a text can be shown, but not both.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#ThemableDecorationAttachmentRenderOptions.contentText)
     */
    var contentText: String?

    /**
     * An **absolute path** or an URI to an image to be rendered in the attachment. Either an icon
     * or a text can be shown, but not both.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#ThemableDecorationAttachmentRenderOptions.contentIconPath)
     */
    var contentIconPath: JsAny /* string | Uri */?

    /**
     * CSS styling property that will be applied to the decoration attachment.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#ThemableDecorationAttachmentRenderOptions.border)
     */
    var border: String?

    /**
     * CSS styling property that will be applied to text enclosed by a decoration.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#ThemableDecorationAttachmentRenderOptions.borderColor)
     */
    var borderColor: JsAny /* string | ThemeColor */?

    /**
     * CSS styling property that will be applied to the decoration attachment.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#ThemableDecorationAttachmentRenderOptions.fontStyle)
     */
    var fontStyle: String?

    /**
     * CSS styling property that will be applied to the decoration attachment.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#ThemableDecorationAttachmentRenderOptions.fontWeight)
     */
    var fontWeight: String?

    /**
     * CSS styling property that will be applied to the decoration attachment.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#ThemableDecorationAttachmentRenderOptions.textDecoration)
     */
    var textDecoration: String?

    /**
     * CSS styling property that will be applied to the decoration attachment.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#ThemableDecorationAttachmentRenderOptions.color)
     */
    var color: JsAny /* string | ThemeColor */?

    /**
     * CSS styling property that will be applied to the decoration attachment.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#ThemableDecorationAttachmentRenderOptions.backgroundColor)
     */
    var backgroundColor: JsAny /* string | ThemeColor */?

    /**
     * CSS styling property that will be applied to the decoration attachment.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#ThemableDecorationAttachmentRenderOptions.margin)
     */
    var margin: String?

    /**
     * CSS styling property that will be applied to the decoration attachment.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#ThemableDecorationAttachmentRenderOptions.width)
     */
    var width: String?

    /**
     * CSS styling property that will be applied to the decoration attachment.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#ThemableDecorationAttachmentRenderOptions.height)
     */
    var height: String?
}

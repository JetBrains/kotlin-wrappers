// Automatically generated - do not modify!

package vscode

import js.core.JsAny

/**
 * Represents theme specific rendering styles for {@link ThemableDecorationRenderOptions.before before} and
 * {@link ThemableDecorationRenderOptions.after after} the content of text decorations.
 */
external interface ThemableDecorationAttachmentRenderOptions {
    /**
     * Defines a text content that is shown in the attachment. Either an icon or a text can be shown, but not both.
     */
    var contentText: String?

    /**
     * An **absolute path** or an URI to an image to be rendered in the attachment. Either an icon
     * or a text can be shown, but not both.
     */
    var contentIconPath: JsAny /* string | Uri */?

    /**
     * CSS styling property that will be applied to the decoration attachment.
     */
    var border: String?

    /**
     * CSS styling property that will be applied to text enclosed by a decoration.
     */
    var borderColor: JsAny /* string | ThemeColor */?

    /**
     * CSS styling property that will be applied to the decoration attachment.
     */
    var fontStyle: String?

    /**
     * CSS styling property that will be applied to the decoration attachment.
     */
    var fontWeight: String?

    /**
     * CSS styling property that will be applied to the decoration attachment.
     */
    var textDecoration: String?

    /**
     * CSS styling property that will be applied to the decoration attachment.
     */
    var color: JsAny /* string | ThemeColor */?

    /**
     * CSS styling property that will be applied to the decoration attachment.
     */
    var backgroundColor: JsAny /* string | ThemeColor */?

    /**
     * CSS styling property that will be applied to the decoration attachment.
     */
    var margin: String?

    /**
     * CSS styling property that will be applied to the decoration attachment.
     */
    var width: String?

    /**
     * CSS styling property that will be applied to the decoration attachment.
     */
    var height: String?
}

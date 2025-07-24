// Automatically generated - do not modify!

package vscode

import js.core.JsAny

/**
 * Represents options for a specific decoration in a {@link TextEditorDecorationType decoration set}.
 */
external interface DecorationOptions {
    /**
     * Range to which this decoration is applied. The range must not be empty.
     */
    var range: Range

    /**
     * A message that should be rendered when hovering over the decoration.
     */
    var hoverMessage: JsAny /* MarkdownString | MarkedString | Array<MarkdownString | MarkedString> */?

    /**
     * Render options applied to the current decoration. For performance reasons, keep the
     * number of decoration specific options small, and use decoration types wherever possible.
     */
    var renderOptions: DecorationInstanceRenderOptions?
}

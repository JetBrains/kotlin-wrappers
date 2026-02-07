// Automatically generated - do not modify!

package vscode

import kotlinx.js.JsPlainObject
import kotlin.js.JsAny

/**
 * Represents options for a specific decoration in a [decoration set][TextEditorDecorationType].
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#DecorationOptions)
 */
@JsPlainObject
external interface DecorationOptions {
    /**
     * Range to which this decoration is applied. The range must not be empty.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#DecorationOptions.range)
     */
    var range: Range

    /**
     * A message that should be rendered when hovering over the decoration.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#DecorationOptions.hoverMessage)
     */
    var hoverMessage: JsAny /* MarkdownString | MarkedString | Array<MarkdownString | MarkedString> */?

    /**
     * Render options applied to the current decoration. For performance reasons, keep the
     * number of decoration specific options small, and use decoration types wherever possible.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#DecorationOptions.renderOptions)
     */
    var renderOptions: DecorationInstanceRenderOptions?
}

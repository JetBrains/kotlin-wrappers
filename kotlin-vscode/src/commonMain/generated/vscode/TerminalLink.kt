// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

import kotlin.js.JsModule
import kotlin.js.definedExternally

/**
 * A link on a terminal line.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TerminalLink)
 */
open external class TerminalLink {
    /**
     * The start index of the link on [TerminalLinkContext.line].
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TerminalLink.startIndex)
     */
    var startIndex: Int

    /**
     * The length of the link on [TerminalLinkContext.line].
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TerminalLink.length)
     */
    var length: Int

    /**
     * The tooltip text when you hover over this link.
     *
     * If a tooltip is provided, is will be displayed in a string that includes instructions on
     * how to trigger the link, such as `{0} (ctrl + click)`. The specific instructions vary
     * depending on OS, user settings, and localization.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TerminalLink.tooltip)
     */
    var tooltip: String?

    /**
     * Creates a new terminal link.
     * @param startIndex The start index of the link on [TerminalLinkContext.line].
     * @param length The length of the link on [TerminalLinkContext.line].
     * @param tooltip The tooltip text when you hover over this link.
     *
     * If a tooltip is provided, is will be displayed in a string that includes instructions on
     * how to trigger the link, such as `{0} (ctrl + click)`. The specific instructions vary
     * depending on OS, user settings, and localization.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TerminalLink.constructor)
     */
    constructor(
        startIndex: Int,
        length: Int,
        tooltip: String = definedExternally,
    )
}

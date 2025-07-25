// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

import kotlin.js.JsModule
import kotlin.js.definedExternally

/**
 * A document link is a range in a text document that links to an internal or external resource, like another
 * text document or a web site.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#DocumentLink)
 */
open external class DocumentLink {
    /**
     * The range this link applies to.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#DocumentLink.range)
     */
    var range: Range

    /**
     * The uri this link points to.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#DocumentLink.target)
     */
    var target: Uri?

    /**
     * The tooltip text when you hover over this link.
     *
     * If a tooltip is provided, is will be displayed in a string that includes instructions on how to
     * trigger the link, such as `{0} (ctrl + click)`. The specific instructions vary depending on OS,
     * user settings, and localization.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#DocumentLink.tooltip)
     */
    var tooltip: String?

    /**
     * Creates a new document link.
     *
     * @param range The range the document link applies to. Must not be empty.
     * @param target The uri the document link points to.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#DocumentLink.constructor)
     */
    constructor(
        range: Range,
        target: Uri = definedExternally,
    )
}

// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

import kotlin.js.JsModule
import kotlin.js.definedExternally

/**
 * A document link is a range in a text document that links to an internal or external resource, like another
 * text document or a web site.
 */
open external class DocumentLink {
    /**
     * The range this link applies to.
     */
    var range: Range

    /**
     * The uri this link points to.
     */
    var target: Uri?

    /**
     * The tooltip text when you hover over this link.
     *
     * If a tooltip is provided, is will be displayed in a string that includes instructions on how to
     * trigger the link, such as `{0} (ctrl + click)`. The specific instructions vary depending on OS,
     * user settings, and localization.
     */
    var tooltip: String?

    /**
     * Creates a new document link.
     *
     * @param range The range the document link applies to. Must not be empty.
     * @param target The uri the document link points to.
     */
    constructor(
        range: Range,
        target: Uri = definedExternally,
    )
}

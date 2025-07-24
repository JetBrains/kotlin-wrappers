// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

import js.core.JsAny
import kotlin.js.JsModule
import kotlin.js.definedExternally

/**
 * Represents a parameter of a callable-signature. A parameter can
 * have a label and a doc-comment.
 */
open external class ParameterInformation {
    /**
     * The label of this signature.
     *
     * Either a string or inclusive start and exclusive end offsets within its containing
     * [signature label][SignatureInformation.label]. *Note*: A label of type string must be
     * a substring of its containing signature information's [label][SignatureInformation.label].
     */
    var label: JsAny /* string | [number, number] */

    /**
     * The human-readable doc-comment of this signature. Will be shown
     * in the UI but can be omitted.
     */
    var documentation: JsAny /* string | MarkdownString */?

    /**
     * Creates a new parameter information object.
     *
     * @param label A label string or inclusive start and exclusive end offsets within its containing signature label.
     * @param documentation A doc string.
     */
    constructor(
        label: JsAny, /* string | [number, number] */
        documentation: JsAny /* string | MarkdownString */ = definedExternally,
    )
}

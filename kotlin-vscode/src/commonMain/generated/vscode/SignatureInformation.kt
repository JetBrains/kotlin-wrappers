// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

import js.array.ReadonlyArray
import js.core.JsAny

/**
 * Represents the signature of something callable. A signature
 * can have a label, like a function-name, a doc-comment, and
 * a set of parameters.
 */
open external class SignatureInformation {
    /**
     * The label of this signature. Will be shown in
     * the UI.
     */
    var label: String

    /**
     * The human-readable doc-comment of this signature. Will be shown
     * in the UI but can be omitted.
     */
    var documentation: JsAny /* string | MarkdownString */?

    /**
     * The parameters of this signature.
     */
    var parameters: ReadonlyArray<ParameterInformation>

    /**
     * The index of the active parameter.
     *
     * If provided, this is used in place of {@linkcode SignatureHelp.activeParameter}.
     */
    var activeParameter: Int?

    /**
     * Creates a new signature information object.
     *
     * @param label A label string.
     * @param documentation A doc string.
     */
    constructor(
        label: String,
        documentation: JsAny /* string | MarkdownString */ = definedExternally,
    )
}

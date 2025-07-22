// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

/**
 * Represents a parameter of a callable-signature. A parameter can
 * have a label and a doc-comment.
 */
open external class ParameterInformation {
    /**
     * The label of this signature.
     *
     * Either a string or inclusive start and exclusive end offsets within its containing
     * {@link SignatureInformation.label signature label}. *Note*: A label of type string must be
     * a substring of its containing signature information's {@link SignatureInformation.label label}.
     */
//  label: string | [number, number];

    /**
     * The human-readable doc-comment of this signature. Will be shown
     * in the UI but can be omitted.
     */
//  documentation?: string | MarkdownString;

    /**
     * Creates a new parameter information object.
     *
     * @param label A label string or inclusive start and exclusive end offsets within its containing signature label.
     * @param documentation A doc string.
     */
//  constructor(label: string | [number, number], documentation?: string | MarkdownString);
}

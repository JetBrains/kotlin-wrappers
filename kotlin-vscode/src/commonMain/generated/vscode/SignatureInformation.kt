// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

/**
// ORIGINAL SOURCE

/**
 * Represents the signature of something callable. A signature
 * can have a label, like a function-name, a doc-comment, and
 * a set of parameters.
*/
export class SignatureInformation {

/**
 * The label of this signature. Will be shown in
 * the UI.
*/
label: string;

/**
 * The human-readable doc-comment of this signature. Will be shown
 * in the UI but can be omitted.
*/
documentation?: string | MarkdownString;

/**
 * The parameters of this signature.
*/
parameters: ParameterInformation[];

/**
 * The index of the active parameter.
 *
 * If provided, this is used in place of {@linkcode SignatureHelp.activeParameter}.
*/
activeParameter?: number;

/**
 * Creates a new signature information object.
 *
 * @param label A label string.
 * @param documentation A doc string.
*/
constructor(label: string, documentation?: string | MarkdownString);
}

// ORIGINAL SOURCE
 **/

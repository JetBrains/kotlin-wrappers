// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

/**
// ORIGINAL SOURCE

/**
 * NotebookCellData is the raw representation of notebook cells. Its is part of {@linkcode NotebookData}.
*/
export class NotebookCellData {

/**
 * The {@link NotebookCellKind kind} of this cell data.
*/
kind: NotebookCellKind;

/**
 * The source value of this cell data - either source code or formatted text.
*/
value: string;

/**
 * The language identifier of the source value of this cell data. Any value from
 * {@linkcode languages.getLanguages getLanguages} is possible.
*/
languageId: string;

/**
 * The outputs of this cell data.
*/
outputs?: NotebookCellOutput[];

/**
 * Arbitrary metadata of this cell data. Can be anything but must be JSON-stringifyable.
*/
metadata?: { [key: string]: any };

/**
 * The execution summary of this cell data.
*/
executionSummary?: NotebookCellExecutionSummary;

/**
 * Create new cell data. Minimal cell data specifies its kind, its source value, and the
 * language identifier of its source.
 *
 * @param kind The kind.
 * @param value The source value.
 * @param languageId The language identifier of the source value.
*/
constructor(kind: NotebookCellKind, value: string, languageId: string);
}

// ORIGINAL SOURCE
 **/

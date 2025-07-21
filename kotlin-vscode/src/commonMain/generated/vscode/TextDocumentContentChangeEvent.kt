// Automatically generated - do not modify!

package vscode

/**
// ORIGINAL SOURCE

/**
 * An event describing an individual change in the text of a {@link TextDocument document}.
*/
export interface TextDocumentContentChangeEvent {
/**
 * The range that got replaced.
*/
readonly range: Range;
/**
 * The offset of the range that got replaced.
*/
readonly rangeOffset: number;
/**
 * The length of the range that got replaced.
*/
readonly rangeLength: number;
/**
 * The new text for the range.
*/
readonly text: string;
}

// ORIGINAL SOURCE
 **/

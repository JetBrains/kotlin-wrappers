// Automatically generated - do not modify!

package vscode

/**
// ORIGINAL SOURCE

/**
 * A value-object that contains contextual information when requesting inline values from a InlineValuesProvider.
*/
export interface InlineValueContext {

/**
 * The stack frame (as a DAP Id) where the execution has stopped.
*/
readonly frameId: number;

/**
 * The document range where execution has stopped.
 * Typically the end position of the range denotes the line where the inline values are shown.
*/
readonly stoppedLocation: Range;
}

// ORIGINAL SOURCE
 **/

// Automatically generated - do not modify!

package vscode

/**
// ORIGINAL SOURCE

/**
 * Represents an event describing the change in a {@link TextEditor.selections text editor's selections}.
*/
export interface TextEditorSelectionChangeEvent {
/**
 * The {@link TextEditor text editor} for which the selections have changed.
*/
readonly textEditor: TextEditor;
/**
 * The new value for the {@link TextEditor.selections text editor's selections}.
*/
readonly selections: readonly Selection[];
/**
 * The {@link TextEditorSelectionChangeKind change kind} which has triggered this
 * event. Can be `undefined`.
*/
readonly kind: TextEditorSelectionChangeKind | undefined;
}

// ORIGINAL SOURCE
 **/

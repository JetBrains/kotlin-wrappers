// Automatically generated - do not modify!

package vscode

/**
// ORIGINAL SOURCE

/**
 * A complex edit that will be applied in one transaction on a TextEditor.
 * This holds a description of the edits and if the edits are valid (i.e. no overlapping regions, document was not changed in the meantime, etc.)
 * they can be applied on a {@link TextDocument document} associated with a {@link TextEditor text editor}.
*/
export interface TextEditorEdit {
/**
 * Replace a certain text region with a new value.
 * You can use `\r\n` or `\n` in `value` and they will be normalized to the current {@link TextDocument document}.
 *
 * @param location The range this operation should remove.
 * @param value The new text this operation should insert after removing `location`.
*/
replace(location: Position | Range | Selection, value: string): void;

/**
 * Insert text at a location.
 * You can use `\r\n` or `\n` in `value` and they will be normalized to the current {@link TextDocument document}.
 * Although the equivalent text edit can be made with {@link TextEditorEdit.replace replace}, `insert` will produce a different resulting selection (it will get moved).
 *
 * @param location The position where the new text should be inserted.
 * @param value The new text this operation should insert.
*/
insert(location: Position, value: string): void;

/**
 * Delete a certain text region.
 *
 * @param location The range this operation should remove.
*/
delete(location: Range | Selection): void;

/**
 * Set the end of line sequence.
 *
 * @param endOfLine The new end of line for the {@link TextDocument document}.
*/
setEndOfLine(endOfLine: EndOfLine): void;
}

// ORIGINAL SOURCE
 **/

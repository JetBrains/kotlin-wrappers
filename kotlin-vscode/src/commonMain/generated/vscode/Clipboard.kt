// Automatically generated - do not modify!

package vscode

/**
// ORIGINAL SOURCE

/**
 * The clipboard provides read and write access to the system's clipboard.
*/
export interface Clipboard {

/**
 * Read the current clipboard contents as text.
 * @returns A thenable that resolves to a string.
*/
readText(): Thenable<string>;

/**
 * Writes text into the clipboard.
 * @returns A thenable that resolves when writing happened.
*/
writeText(value: string): Thenable<void>;
}

// ORIGINAL SOURCE
 **/

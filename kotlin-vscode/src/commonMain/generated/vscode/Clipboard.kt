// Automatically generated - do not modify!

package vscode

/**
 * The clipboard provides read and write access to the system's clipboard.
 */
external interface Clipboard {
    /**
    // ORIGINAL SOURCE


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

    // ORIGINAL SOURCE
     **/
}

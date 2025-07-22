// Automatically generated - do not modify!

package vscode

/**
 * The notebook serializer enables the editor to open notebook files.
 *
 * At its core the editor only knows a {@link NotebookData notebook data structure} but not
 * how that data structure is written to a file, nor how it is read from a file. The
 * notebook serializer bridges this gap by deserializing bytes into notebook data and
 * vice versa.
 */
external interface NotebookSerializer {
    /**
    // ORIGINAL SOURCE


    /**
     * Deserialize contents of a notebook file into the notebook data structure.
     *
     * @param content Contents of a notebook file.
     * @param token A cancellation token.
     * @returns Notebook data or a thenable that resolves to such.
    */
    deserializeNotebook(content: Uint8Array, token: CancellationToken): NotebookData | Thenable<NotebookData>;

    /**
     * Serialize notebook data into file contents.
     *
     * @param data A notebook data structure.
     * @param token A cancellation token.
     * @returns An array of bytes or a thenable that resolves to such.
    */
    serializeNotebook(data: NotebookData, token: CancellationToken): Uint8Array | Thenable<Uint8Array>;

    // ORIGINAL SOURCE
     **/
}

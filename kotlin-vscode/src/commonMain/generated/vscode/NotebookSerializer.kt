// Automatically generated - do not modify!

package vscode

import js.promise.PromiseResult
import js.typedarrays.Uint8Array

/**
 * The notebook serializer enables the editor to open notebook files.
 *
 * At its core the editor only knows a [notebook data structure][NotebookData] but not
 * how that data structure is written to a file, nor how it is read from a file. The
 * notebook serializer bridges this gap by deserializing bytes into notebook data and
 * vice versa.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#NotebookSerializer)
 */
external interface NotebookSerializer {
    /**
     * Deserialize contents of a notebook file into the notebook data structure.
     *
     * @param content Contents of a notebook file.
     * @param token A cancellation token.
     * @returns Notebook data or a thenable that resolves to such.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#NotebookSerializer.deserializeNotebook)
     */
    fun deserializeNotebook(
        content: Uint8Array<*>,
        token: CancellationToken,
    ): PromiseResult<NotebookData>

    /**
     * Serialize notebook data into file contents.
     *
     * @param data A notebook data structure.
     * @param token A cancellation token.
     * @returns An array of bytes or a thenable that resolves to such.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#NotebookSerializer.serializeNotebook)
     */
    fun serializeNotebook(
        data: NotebookData,
        token: CancellationToken,
    ): PromiseResult<Uint8Array<*>>
}

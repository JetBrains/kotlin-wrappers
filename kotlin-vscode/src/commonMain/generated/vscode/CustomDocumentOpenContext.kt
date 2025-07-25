// Automatically generated - do not modify!

package vscode

import js.typedarrays.Uint8Array

/**
 * Additional information about the opening custom document.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#CustomDocumentOpenContext)
 */
external interface CustomDocumentOpenContext {
    /**
     * The id of the backup to restore the document from or `undefined` if there is no backup.
     *
     * If this is provided, your extension should restore the editor from the backup instead of reading the file
     * from the user's workspace.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#CustomDocumentOpenContext.backupId)
     */
    val backupId: String?

    /**
     * If the URI is an untitled file, this will be populated with the byte data of that file
     *
     * If this is provided, your extension should utilize this byte data rather than executing fs APIs on the URI passed in
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#CustomDocumentOpenContext.untitledDocumentData)
     */
    val untitledDocumentData: Uint8Array<*>?
}

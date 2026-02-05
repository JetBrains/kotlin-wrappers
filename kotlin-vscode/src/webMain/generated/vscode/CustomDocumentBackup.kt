// Automatically generated - do not modify!

package vscode

/**
 * A backup for an [CustomDocument].
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#CustomDocumentBackup)
 */
external interface CustomDocumentBackup {
    /**
     * Unique identifier for the backup.
     *
     * This id is passed back to your extension in [openCustomDocument][CustomReadonlyEditorProvider.openCustomDocument] when opening a custom editor from a backup.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#CustomDocumentBackup.id)
     */
    val id: String

    /**
     * Delete the current backup.
     *
     * This is called by the editor when it is clear the current backup is no longer needed, such as when a new backup
     * is made or when the file is saved.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#CustomDocumentBackup.delete)
     */
    fun delete()
}

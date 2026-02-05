// Automatically generated - do not modify!

package vscode

import js.objects.JsPlainObject

/**
 * Additional information used to implement [CustomDocumentBackup].
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#CustomDocumentBackupContext)
 */
@JsPlainObject
external interface CustomDocumentBackupContext {
    /**
     * Suggested file location to write the new backup.
     *
     * Note that your extension is free to ignore this and use its own strategy for backup.
     *
     * If the editor is for a resource from the current workspace, `destination` will point to a file inside
     * `ExtensionContext.storagePath`. The parent folder of `destination` may not exist, so make sure to created it
     * before writing the backup to this location.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#CustomDocumentBackupContext.destination)
     */
    val destination: Uri
}

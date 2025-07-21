// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

/**
 * Permissions of a file.
 */
sealed /* enum */
external interface FilePermission {
    companion object {
        /**
         * The file is readonly.
         *
         * *Note:* All `FileStat` from a `FileSystemProvider` that is registered with
         * the option `isReadonly: true` will be implicitly handled as if `FilePermission.Readonly`
         * is set. As a consequence, it is not possible to have a readonly file system provider
         * registered where some `FileStat` are not readonly.
         */
        val Readonly: FilePermission // 1
    }
}

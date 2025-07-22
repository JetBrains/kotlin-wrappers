// Automatically generated - do not modify!

package vscode

/**
 * A file associated with a {@linkcode DataTransferItem}.
 *
 * Instances of this type can only be created by the editor and not by extensions.
 */
external interface DataTransferFile {
    /**
     * The name of the file.
     */
    val name: String

    /**
     * The full file path of the file.
     *
     * May be `undefined` on web.
     */
    val uri: Uri?

    /**
     * The full file contents of the file.
     */
//  data(): Thenable<Uint8Array>
}

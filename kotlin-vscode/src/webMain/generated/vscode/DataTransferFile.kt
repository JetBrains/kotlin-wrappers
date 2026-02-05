// Automatically generated - do not modify!

package vscode

import js.promise.PromiseLike
import js.typedarrays.Uint8Array

/**
 * A file associated with a [DataTransferItem].
 *
 * Instances of this type can only be created by the editor and not by extensions.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#DataTransferFile)
 */
external interface DataTransferFile {
    /**
     * The name of the file.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#DataTransferFile.name)
     */
    val name: String

    /**
     * The full file path of the file.
     *
     * May be `undefined` on web.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#DataTransferFile.uri)
     */
    val uri: Uri?

    /**
     * The full file contents of the file.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#DataTransferFile.data)
     */
    fun data(): PromiseLike<Uint8Array<*>>
}

// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

import js.core.JsAny
import js.errors.JsError
import kotlin.js.JsModule
import kotlin.js.definedExternally

/**
 * A type that filesystem providers should use to signal errors.
 *
 * This class has factory methods for common error-cases, like `FileNotFound` when
 * a file or folder doesn't exist, use them like so: `throw vscode.FileSystemError.FileNotFound(someUri);`
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#FileSystemError)
 */
open external class FileSystemError :
    JsError {
    /**
     * Creates a new filesystem error.
     *
     * @param messageOrUri Message or uri.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#FileSystemError.constructor)
     */
    constructor(messageOrUri: JsAny /* string | Uri */ = definedExternally)

    /**
     * A code that identifies this error.
     *
     * Possible values are names of errors, like {@linkcode FileSystemError.FileNotFound FileNotFound},
     * or `Unknown` for unspecified errors.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#FileSystemError.code)
     */
    val code: String

    companion object {
        /**
         * Create an error to signal that a file or folder wasn't found.
         * @param messageOrUri Message or uri.
         *
         * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#FileSystemError.FileNotFound)
         */
        fun FileNotFound(messageOrUri: JsAny /* string | Uri */ = definedExternally): FileSystemError

        /**
         * Create an error to signal that a file or folder already exists, e.g. when
         * creating but not overwriting a file.
         * @param messageOrUri Message or uri.
         *
         * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#FileSystemError.FileExists)
         */
        fun FileExists(messageOrUri: JsAny /* string | Uri */ = definedExternally): FileSystemError

        /**
         * Create an error to signal that a file is not a folder.
         * @param messageOrUri Message or uri.
         *
         * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#FileSystemError.FileNotADirectory)
         */
        fun FileNotADirectory(messageOrUri: JsAny /* string | Uri */ = definedExternally): FileSystemError

        /**
         * Create an error to signal that a file is a folder.
         * @param messageOrUri Message or uri.
         *
         * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#FileSystemError.FileIsADirectory)
         */
        fun FileIsADirectory(messageOrUri: JsAny /* string | Uri */ = definedExternally): FileSystemError

        /**
         * Create an error to signal that an operation lacks required permissions.
         * @param messageOrUri Message or uri.
         *
         * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#FileSystemError.NoPermissions)
         */
        fun NoPermissions(messageOrUri: JsAny /* string | Uri */ = definedExternally): FileSystemError

        /**
         * Create an error to signal that the file system is unavailable or too busy to
         * complete a request.
         * @param messageOrUri Message or uri.
         *
         * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#FileSystemError.Unavailable)
         */
        fun Unavailable(messageOrUri: JsAny /* string | Uri */ = definedExternally): FileSystemError
    }
}

// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

import js.errors.JsError

/**
 * A type that filesystem providers should use to signal errors.
 *
 * This class has factory methods for common error-cases, like `FileNotFound` when
 * a file or folder doesn't exist, use them like so: `throw vscode.FileSystemError.FileNotFound(someUri);`
 */
open external class FileSystemError :
    JsError {
    /**
     * Create an error to signal that a file or folder wasn't found.
     * @param messageOrUri Message or uri.
     */
//  static FileNotFound(messageOrUri?: string | Uri): FileSystemError

    /**
     * Create an error to signal that a file or folder already exists, e.g. when
     * creating but not overwriting a file.
     * @param messageOrUri Message or uri.
     */
//  static FileExists(messageOrUri?: string | Uri): FileSystemError

    /**
     * Create an error to signal that a file is not a folder.
     * @param messageOrUri Message or uri.
     */
//  static FileNotADirectory(messageOrUri?: string | Uri): FileSystemError

    /**
     * Create an error to signal that a file is a folder.
     * @param messageOrUri Message or uri.
     */
//  static FileIsADirectory(messageOrUri?: string | Uri): FileSystemError

    /**
     * Create an error to signal that an operation lacks required permissions.
     * @param messageOrUri Message or uri.
     */
//  static NoPermissions(messageOrUri?: string | Uri): FileSystemError

    /**
     * Create an error to signal that the file system is unavailable or too busy to
     * complete a request.
     * @param messageOrUri Message or uri.
     */
//  static Unavailable(messageOrUri?: string | Uri): FileSystemError

    /**
     * Creates a new filesystem error.
     *
     * @param messageOrUri Message or uri.
     */
//  constructor(messageOrUri?: string | Uri)

    /**
     * A code that identifies this error.
     *
     * Possible values are names of errors, like {@linkcode FileSystemError.FileNotFound FileNotFound},
     * or `Unknown` for unspecified errors.
     */
    val code: String
}

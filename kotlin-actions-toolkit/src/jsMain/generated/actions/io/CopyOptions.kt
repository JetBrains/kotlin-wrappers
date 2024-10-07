// Automatically generated - do not modify!

package actions.io

import kotlinx.js.JsPlainObject

@JsPlainObject
external interface CopyOptions {
    /** Optional. Whether to recursively copy all subdirectories. Defaults to false */
    val recursive: Boolean?

    /** Optional. Whether to overwrite existing files in the destination. Defaults to true */
    val force: Boolean?

    /** Optional. Whether to copy the source directory along with all the files. Only takes effect when recursive=true and copying a directory. Default is true*/
    val copySourceDirectory: Boolean?
}

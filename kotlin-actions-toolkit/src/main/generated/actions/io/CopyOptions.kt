// Automatically generated - do not modify!

package actions.io

sealed external interface CopyOptions {
    /** Optional. Whether to recursively copy all subdirectories. Defaults to false */
    var recursive: Boolean?

    /** Optional. Whether to overwrite existing files in the destination. Defaults to true */
    var force: Boolean?

    /** Optional. Whether to copy the source directory along with all the files. Only takes effect when recursive=true and copying a directory. Default is true*/
    var copySourceDirectory: Boolean?
}

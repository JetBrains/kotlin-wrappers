// Automatically generated - do not modify!

package electron.core

external interface FileSystemAccessRestrictedDetails {
    /**
     * The origin that initiated access to the blocked path.
     */
    var origin: String

    /**
     * Whether or not the path is a directory.
     */
    var isDirectory: Boolean

    /**
     * The blocked path attempting to be accessed.
     */
    var path: String
}

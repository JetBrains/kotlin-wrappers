// Automatically generated - do not modify!

package node.buffer

sealed external interface FileOptions {
    /**
     * One of either `'transparent'` or `'native'`. When set to `'native'`, line endings in string source parts will be
     * converted to the platform native line-ending as specified by `require('node:os').EOL`.
     */
    var endings: Any? /* 'native' | 'transparent' */

    /** The File content-type. */
    var type: String?

    /** The last modified date of the file. `Default`: Date.now(). */
    var lastModified: Number?
}

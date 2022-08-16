// Automatically generated - do not modify!

package node.fs

sealed external interface CopySyncOptions : CopyOptionsBase {
    /**
     * Function to filter copied files/directories. Return
     * `true` to copy the item, `false` to ignore it.
     */
    var filter: ((
        source: String,
        destination: String,
    ) -> Boolean)?
}

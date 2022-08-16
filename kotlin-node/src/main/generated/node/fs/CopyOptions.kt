// Automatically generated - do not modify!

package node.fs

import kotlinx.js.PromiseResult

sealed external interface CopyOptions : CopyOptionsBase {
    /**
     * Function to filter copied files/directories. Return
     * `true` to copy the item, `false` to ignore it.
     */
    var filter: ((
        source: String,
        destination: String,
    ) -> PromiseResult<Boolean>)?
}

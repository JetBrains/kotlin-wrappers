// Automatically generated - do not modify!

package typescript

sealed external interface ProjectReference {
    /** A normalized path on disk */
    var path: String

    /** The path as the user originally wrote it */
    var originalPath: String?

    /** @deprecated */
    var prepend: Boolean?

    /** True if it is intended that this reference form a circularity */
    var circular: Boolean?
}

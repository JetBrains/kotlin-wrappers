// Automatically generated - do not modify!

package typescript

external interface ProjectReference {
    /** A normalized path on disk */
    var path: String

    /** The path as the user originally wrote it */
    var originalPath: String?

    /** True if the output of this reference should be prepended to the output of this project. Only valid for --outFile compilations */
    var prepend: Boolean?

    /** True if it is intended that this reference form a circularity */
    var circular: Boolean?
}

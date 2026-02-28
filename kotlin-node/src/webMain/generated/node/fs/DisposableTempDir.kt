// Automatically generated - do not modify!

package node.fs

sealed external interface _DisposableTempDir : js.disposable.Disposable {
    /**
     * The path of the created directory.
     */
    var path: String

    /**
     * A function which removes the created directory.
     */
    fun remove()
}

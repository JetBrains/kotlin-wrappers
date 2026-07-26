// Automatically generated - do not modify!

package node.fs

external interface DisposableTempDir : js.disposable.AsyncDisposable {
    /**
     * The path of the created directory.
     */
    var path: String

    /**
     * A function which removes the created directory.
     */
    @JsName("remove")
    fun removeAsync(): js.promise.Promise<js.void.Void>

    @seskar.js.JsAsync
    suspend fun remove(): js.void.Void
}

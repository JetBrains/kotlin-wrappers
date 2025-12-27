// Automatically generated - do not modify!

package node.fs

import js.disposable.AsyncDisposable
import js.promise.Promise

sealed external interface DisposableTempDir : AsyncDisposable {
    /**
     * The path of the created directory.
     */
    var path: String

    /**
     * A function which removes the created directory.
     */
    @JsName("remove")
    fun removeAsync(): Promise<js.core.Void>

    @seskar.js.JsAsync
    suspend fun remove(): js.core.Void
}

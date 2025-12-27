// Automatically generated - do not modify!

package node.v8

import js.promise.Promise

/**
 * @since v24.9.0
 */
sealed external interface HeapProfileHandle {
    /**
     * Stopping collecting the profile, then return a Promise that fulfills with an error or the
     * profile data.
     * @since v24.9.0
     */
    @JsName("stop")
    fun stopAsync(): Promise<String>

    @seskar.js.JsAsync
    suspend fun stop(): String
}

// Automatically generated - do not modify!

@file:JsModule("@actions/artifact")

package actions.artifact

import js.core.ReadonlyArray
import js.promise.Promise

sealed external class DefaultArtifactClient : ArtifactClient {
    /**
     * Uploads an artifact
     */
    fun uploadArtifact(
        name: String,
        files: ReadonlyArray<String>,
        rootDirectory: String,
        options: UploadOptions? = definedExternally,
    ): Promise<UploadResponse>

    fun downloadArtifact(
        name: String,
        path: String? = definedExternally,
        options: DownloadOptions? = definedExternally,
    ): Promise<DownloadResponse>

    fun downloadAllArtifacts(path: String? = definedExternally): Promise<ReadonlyArray<DownloadResponse>>

    companion object {
        /**
         * Constructs a DefaultArtifactClient
         */
        fun create(): DefaultArtifactClient
    }
}

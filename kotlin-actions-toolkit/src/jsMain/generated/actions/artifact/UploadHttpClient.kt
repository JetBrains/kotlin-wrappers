// Automatically generated - do not modify!

@file:JsModule("@actions/artifact")

package actions.artifact

import js.core.ReadonlyArray
import js.core.Void
import js.promise.Promise

external class UploadHttpClient {
    constructor()

    /**
     * Creates a file container for the new artifact in the remote blob storage/file service
     * @param {string} artifactName Name of the artifact being created
     * @returns The response from the Artifact Service if the file container was successfully created
     */
    fun createArtifactInFileContainer(
        artifactName: String,
        options: UploadOptions? = definedExternally,
    ): Promise<ArtifactResponse>

    /**
     * Concurrently upload all of the files in chunks
     * @param {string} uploadUrl Base Url for the artifact that was created
     * @param {SearchResult[]} filesToUpload A list of information about the files being uploaded
     * @returns The size of all the files uploaded in bytes
     */
    fun uploadArtifactToFileContainer(
        uploadUrl: String,
        filesToUpload: ReadonlyArray<UploadSpecification>,
        options: UploadOptions = definedExternally,
    ): Promise<UploadResults>

    /**
     * Updates the size of the artifact from -1 which was initially set when the container was first created for the artifact.
     * Updating the size indicates that we are done uploading all the contents of the artifact
     */
    fun patchArtifactSize(
        size: Number,
        artifactName: String,
    ): Promise<Void>
}

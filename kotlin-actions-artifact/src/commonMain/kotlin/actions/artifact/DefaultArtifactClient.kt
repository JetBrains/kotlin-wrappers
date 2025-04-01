// Automatically generated - do not modify!

@file:JsModule("@actions/artifact")

package actions.artifact

import js.array.ReadonlyArray
import js.promise.Promise

sealed external class DefaultArtifactClient : ArtifactClient {
    override fun uploadArtifact(
        name: String,
        files: ReadonlyArray<String>,
        rootDirectory: String,
        options: UploadArtifactOptions,
    ): Promise<UploadArtifactResponse>

    override fun downloadArtifact(
        artifactId: Number,
        options: DownloadArtifactOptions, /* & FindOptions */
    ): Promise<DownloadArtifactResponse>

    override fun listArtifacts(options: ListArtifactsOptions /* & FindOptions */): Promise<ListArtifactsResponse>
    override fun getArtifact(
        artifactName: String,
        options: FindOptions,
    ): Promise<GetArtifactResponse>

    override fun deleteArtifact(
        artifactName: String,
        options: FindOptions,
    ): Promise<DeleteArtifactResponse>
}

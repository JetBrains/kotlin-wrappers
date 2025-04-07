// Automatically generated - do not modify!

@file:JsModule("@actions/artifact")

package actions.artifact

import js.promise.Promise
import seskar.js.JsAsync

@JsAsync
external suspend fun downloadArtifactPublic(
    artifactId: Number,
    repositoryOwner: String,
    repositoryName: String,
    token: String,
    options: DownloadArtifactOptions = definedExternally,
): DownloadArtifactResponse

@JsName("downloadArtifactPublic")
external fun downloadArtifactPublicAsync(
    artifactId: Number,
    repositoryOwner: String,
    repositoryName: String,
    token: String,
    options: DownloadArtifactOptions = definedExternally,
): Promise<DownloadArtifactResponse>

// Automatically generated - do not modify!

@file:JsModule("@actions/artifact")

package actions.artifact

import js.promise.Promise
import seskar.js.JsAsync

@JsAsync
external suspend fun downloadArtifactInternal(
    artifactId: Number,
    options: DownloadArtifactOptions = definedExternally,
): DownloadArtifactResponse

@JsName("downloadArtifactInternal")
external fun downloadArtifactInternalAsync(
    artifactId: Number,
    options: DownloadArtifactOptions = definedExternally,
): Promise<DownloadArtifactResponse>

// Automatically generated - do not modify!

@file:JsModule("@actions/artifact")

package actions.artifact

import js.promise.Promise
import seskar.js.JsAsync

@JsAsync
external suspend fun getArtifactInternal(artifactName: String): GetArtifactResponse

@JsName("getArtifactInternal")
external fun getArtifactInternalAsync(artifactName: String): Promise<GetArtifactResponse>

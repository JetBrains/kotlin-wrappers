// Automatically generated - do not modify!

@file:JsModule("@actions/artifact")

package actions.artifact

import js.promise.Promise
import seskar.js.JsAsync

@JsAsync
external suspend fun deleteArtifactInternal(artifactName: Any?): DeleteArtifactResponse

@JsName("deleteArtifactInternal")
external fun deleteArtifactInternalAsync(artifactName: Any?): Promise<DeleteArtifactResponse>

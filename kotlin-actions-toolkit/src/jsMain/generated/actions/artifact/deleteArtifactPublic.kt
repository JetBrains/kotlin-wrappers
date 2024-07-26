// Automatically generated - do not modify!

@file:JsModule("@actions/artifact")

package actions.artifact

import js.promise.Promise
import seskar.js.JsAsync

@JsAsync
external suspend fun deleteArtifactPublic(
    artifactName: String,
    workflowRunId: Number,
    repositoryOwner: String,
    repositoryName: String,
    token: String,
): DeleteArtifactResponse

@JsName("deleteArtifactPublic")
external fun deleteArtifactPublicAsync(
    artifactName: String,
    workflowRunId: Number,
    repositoryOwner: String,
    repositoryName: String,
    token: String,
): Promise<DeleteArtifactResponse>

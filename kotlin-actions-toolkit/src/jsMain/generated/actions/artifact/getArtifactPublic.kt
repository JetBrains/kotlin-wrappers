// Automatically generated - do not modify!

@file:JsModule("@actions/artifact")

package actions.artifact

import js.promise.Promise
import seskar.js.JsAsync

@JsAsync
external suspend fun getArtifactPublic(
    artifactName: String,
    workflowRunId: Number,
    repositoryOwner: String,
    repositoryName: String,
    token: String,
): GetArtifactResponse

@JsName("getArtifactPublic")
external fun getArtifactPublicAsync(
    artifactName: String,
    workflowRunId: Number,
    repositoryOwner: String,
    repositoryName: String,
    token: String,
): Promise<GetArtifactResponse>

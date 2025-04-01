// Automatically generated - do not modify!

@file:JsModule("@actions/artifact")

package actions.artifact

import js.promise.Promise
import seskar.js.JsAsync

@JsAsync
external suspend fun listArtifactsPublic(
    workflowRunId: Number,
    repositoryOwner: String,
    repositoryName: String,
    token: String,
    latest: Boolean = definedExternally,
): ListArtifactsResponse

@JsName("listArtifactsPublic")
external fun listArtifactsPublicAsync(
    workflowRunId: Number,
    repositoryOwner: String,
    repositoryName: String,
    token: String,
    latest: Boolean = definedExternally,
): Promise<ListArtifactsResponse>

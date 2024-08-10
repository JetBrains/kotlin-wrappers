// Automatically generated - do not modify!

@file:JsModule("@actions/artifact")

package actions.artifact

import js.promise.Promise
import seskar.js.JsAsync

@JsAsync
external suspend fun listArtifactsInternal(latest: Boolean = definedExternally): ListArtifactsResponse

@JsName("listArtifactsInternal")
external fun listArtifactsInternalAsync(latest: Boolean = definedExternally): Promise<ListArtifactsResponse>

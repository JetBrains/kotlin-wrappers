// Automatically generated - do not modify!

@file:JsModule("@actions/artifact")

package actions.artifact

import js.array.ReadonlyArray
import js.promise.Promise
import seskar.js.JsAsync

@JsAsync
external suspend fun uploadArtifact(
    name: String,
    files: ReadonlyArray<String>,
    rootDirectory: String,
    options: UploadArtifactOptions? = definedExternally,
): UploadArtifactResponse

@JsName("uploadArtifact")
external fun uploadArtifactAsync(
    name: String,
    files: ReadonlyArray<String>,
    rootDirectory: String,
    options: UploadArtifactOptions? = definedExternally,
): Promise<UploadArtifactResponse>

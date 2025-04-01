// Automatically generated - do not modify!

@file:JsModule("@actions/artifact")

package actions.artifact

import js.array.ReadonlyArray
import js.promise.Promise
import seskar.js.JsAsync

@JsAsync
external suspend fun createZipUploadStream(
    uploadSpecification: ReadonlyArray<UploadZipSpecification>,
    compressionLevel: Number = definedExternally,
): ZipUploadStream

@JsName("createZipUploadStream")
external fun createZipUploadStreamAsync(
    uploadSpecification: ReadonlyArray<UploadZipSpecification>,
    compressionLevel: Number = definedExternally,
): Promise<ZipUploadStream>

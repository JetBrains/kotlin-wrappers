// Automatically generated - do not modify!

@file:JsModule("@actions/artifact")

package actions.artifact

import js.promise.Promise
import seskar.js.JsAsync

@JsAsync
external suspend fun createGZipFileOnDisk(
    originalFilePath: String,
    tempFilePath: String,
): Number

@JsName("createGZipFileOnDisk")
external fun createGZipFileOnDiskAsync(
    originalFilePath: String,
    tempFilePath: String,
): Promise<Number>

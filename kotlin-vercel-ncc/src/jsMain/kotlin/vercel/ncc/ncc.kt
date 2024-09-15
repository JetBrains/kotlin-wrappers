package vercel.ncc

import js.promise.Promise
import seskar.js.JsAsync

@JsModule("@vercel/ncc")
external fun nccAsync(
    input: String,
    options: NccBuildOptions = definedExternally,
): Promise<NccBuildSuccessResult>

@JsAsync
external suspend fun ncc(
    input: String,
    options: NccBuildOptions = definedExternally,
): NccBuildSuccessResult

@JsModule("@vercel/ncc")
external fun ncc(
    input: String,
    options: NccWatchOptions,
): NccWatchResult

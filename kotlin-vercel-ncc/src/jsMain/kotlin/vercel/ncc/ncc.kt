package vercel.ncc

import seskar.js.JsAsync
import kotlin.js.Promise

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

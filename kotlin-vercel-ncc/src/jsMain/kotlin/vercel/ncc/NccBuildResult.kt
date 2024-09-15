package vercel.ncc

import js.errors.JsError
import kotlinx.js.JsPlainObject

@JsPlainObject
external interface NccBuildResult {
    val err: String?
}

fun NccBuildResult.toResult(): Result<NccBuildSuccessResult> {
    return if (err == null) {
        Result.success(unsafeCast<NccBuildSuccessResult>())
    } else {
        Result.failure(JsError(err))
    }
}

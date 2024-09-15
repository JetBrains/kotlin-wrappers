package vercel.ncc

import js.objects.Record
import kotlinx.js.JsPlainObject

@JsPlainObject
external interface NccBuildSuccessResult :
    NccBuildResult {
    val code: String
    val map: String?
    val assets: Record<String, Asset>?
}

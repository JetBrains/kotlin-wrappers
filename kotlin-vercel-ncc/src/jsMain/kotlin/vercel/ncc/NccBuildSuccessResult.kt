package vercel.ncc

import js.objects.ReadonlyRecord
import kotlinx.js.JsPlainObject

@JsPlainObject
external interface NccBuildSuccessResult :
    NccBuildResult {
    val code: String
    val map: String?
    val assets: ReadonlyRecord<String, Asset>?
}

package vercel.ncc

import js.objects.JsPlainObject
import js.objects.ReadonlyRecord

@JsPlainObject
external interface NccBuildSuccessResult :
    NccBuildResult {
    val code: String
    val map: String?
    val assets: ReadonlyRecord<String, Asset>?
}

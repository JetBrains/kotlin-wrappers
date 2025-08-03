package pako

import js.array.ReadonlyArray
import js.core.Int53
import js.core.JsUShort
import js.objects.JsPlainObject

@JsPlainObject
external interface Header {
    var text: Boolean?
    var time: Int53? /* EpochTimeStamp */
    var os: Short?
    var extra: ReadonlyArray<JsUShort>?
    var name: String?
    var comment: String?
    var hcrc: Boolean?
}

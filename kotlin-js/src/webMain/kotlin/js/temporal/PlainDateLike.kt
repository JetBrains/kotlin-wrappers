package js.temporal

import kotlinx.js.JsPlainObject

@JsPlainObject
external interface PlainDateLike {

    var era: String?
    var eraYear: Int?
    var year: Int?
    var month: Int?
    var monthCode: String?
    var day: Int?
    var calendar: Calendar?
}

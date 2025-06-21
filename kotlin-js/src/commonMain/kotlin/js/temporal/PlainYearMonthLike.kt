package js.temporal

import js.objects.JsPlainObject

@JsPlainObject
external interface PlainYearMonthLike {

    var era: String?
    var eraYear: Int?
    var year: Int?
    var month: Int?
    var monthCode: String?
    var calendar: Calendar?
}

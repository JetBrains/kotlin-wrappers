package js.temporal

import js.objects.JsPlainObject

@JsPlainObject
external interface MonthOrMonthCode {
    var month: Int?

    // or
    var monthCode: String?
}

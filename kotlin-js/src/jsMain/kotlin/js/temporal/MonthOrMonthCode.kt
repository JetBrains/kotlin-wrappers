package js.temporal

import js.objects.JsPlainObject

@JsPlainObject
sealed external interface MonthOrMonthCode {
    var month: Int?

    // or
    var monthCode: String?
}

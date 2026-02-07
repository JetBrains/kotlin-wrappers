package js.temporal

import kotlinx.js.JsPlainObject

@JsPlainObject
external interface MonthOrMonthCode {
    var month: Int?

    // or
    var monthCode: String?
}

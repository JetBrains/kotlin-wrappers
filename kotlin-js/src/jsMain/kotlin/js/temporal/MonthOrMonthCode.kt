package js.temporal

import kotlinx.js.JsPlainObject

@JsPlainObject
sealed external interface MonthOrMonthCode {
    var month: Int?

    // or
    var monthCode: String?
}

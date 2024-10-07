package js.temporal

import kotlinx.js.JsPlainObject

@JsPlainObject
external interface MonthOrMonthCode {
    val month: Int?

    // or
    val monthCode: String?
}

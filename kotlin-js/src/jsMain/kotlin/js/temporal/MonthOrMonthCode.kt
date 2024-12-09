package js.temporal

import js.objects.JsPlainObject

@JsPlainObject
external interface MonthOrMonthCode {
    val month: Int?

    // or
    val monthCode: String?
}

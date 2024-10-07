package js.temporal

import kotlinx.js.JsPlainObject

@JsPlainObject
external interface MonthCodeOrMonthAndYear :
    YearOrEraAndEraYear {
    val month: Int?

    // or (single)
    val monthCode: String?
}

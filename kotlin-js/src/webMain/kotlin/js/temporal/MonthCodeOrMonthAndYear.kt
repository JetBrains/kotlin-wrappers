package js.temporal

import kotlinx.js.JsPlainObject

@JsPlainObject
external interface MonthCodeOrMonthAndYear :
    YearOrEraAndEraYear {
    var month: Int?

    // or (single)
    var monthCode: String?
}

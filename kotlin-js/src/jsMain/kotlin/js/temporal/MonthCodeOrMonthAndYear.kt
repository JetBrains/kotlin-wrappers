package js.temporal

import kotlinx.js.JsPlainObject

@JsPlainObject
sealed external interface MonthCodeOrMonthAndYear :
    YearOrEraAndEraYear {
    var month: Int?

    // or (single)
    var monthCode: String?
}

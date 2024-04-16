package js.temporal

import js.objects.JsPlainObject

@JsPlainObject
sealed external interface MonthCodeOrMonthAndYear :
    YearOrEraAndEraYear {
    var month: Int?

    // or (single)
    var monthCode: String?
}

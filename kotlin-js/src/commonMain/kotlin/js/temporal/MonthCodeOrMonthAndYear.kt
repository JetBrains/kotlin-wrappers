package js.temporal

import js.objects.JsPlainObject

@JsPlainObject
external interface MonthCodeOrMonthAndYear :
    YearOrEraAndEraYear {
    var month: Int?

    // or (single)
    var monthCode: String?
}

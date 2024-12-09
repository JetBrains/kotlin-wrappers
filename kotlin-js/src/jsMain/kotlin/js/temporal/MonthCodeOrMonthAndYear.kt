package js.temporal

import js.objects.JsPlainObject

@JsPlainObject
external interface MonthCodeOrMonthAndYear :
    YearOrEraAndEraYear {
    val month: Int?

    // or (single)
    val monthCode: String?
}

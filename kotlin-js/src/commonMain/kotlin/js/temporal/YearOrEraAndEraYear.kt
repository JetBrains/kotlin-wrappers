package js.temporal

import js.objects.JsPlainObject

@JsPlainObject
external interface YearOrEraAndEraYear {
    var era: String?
    var eraYear: Int?

    // or
    var year: Int?
}

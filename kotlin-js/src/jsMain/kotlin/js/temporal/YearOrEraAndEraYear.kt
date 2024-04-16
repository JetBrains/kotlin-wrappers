package js.temporal

import js.objects.JsPlainObject

@JsPlainObject
sealed external interface YearOrEraAndEraYear {
    var era: String?
    var eraYear: Int?

    // or
    var year: Int?
}

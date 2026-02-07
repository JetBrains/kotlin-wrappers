package js.temporal

import kotlinx.js.JsPlainObject

@JsPlainObject
external interface YearOrEraAndEraYear {
    var era: String?
    var eraYear: Int?

    // or
    var year: Int?
}

package js.temporal

import kotlinx.js.JsPlainObject

@JsPlainObject
sealed external interface YearOrEraAndEraYear {
    var era: String?
    var eraYear: Int?

    // or
    var year: Int?
}

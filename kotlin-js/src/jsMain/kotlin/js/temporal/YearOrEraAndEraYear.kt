package js.temporal

import kotlinx.js.JsPlainObject

@JsPlainObject
external interface YearOrEraAndEraYear {
    val era: String?
    val eraYear: Int?

    // or
    val year: Int?
}

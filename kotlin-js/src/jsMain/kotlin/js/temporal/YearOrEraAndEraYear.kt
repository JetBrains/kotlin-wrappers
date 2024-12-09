package js.temporal

import js.objects.JsPlainObject

@JsPlainObject
external interface YearOrEraAndEraYear {
    val era: String?
    val eraYear: Int?

    // or
    val year: Int?
}

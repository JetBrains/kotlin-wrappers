package react.select

import kotlinx.js.JsPlainObject

@JsPlainObject
external interface FilterOptionOption<Option> {
    val label: String
    val value: String
    val data: Option
}

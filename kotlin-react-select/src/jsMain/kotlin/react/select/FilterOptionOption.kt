package react.select

import js.objects.JsPlainObject

@JsPlainObject
external interface FilterOptionOption<Option> {
    val label: String
    val value: String
    val data: Option
}

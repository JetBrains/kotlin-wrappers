package react.select

import kotlinx.js.JsPlainObject

@JsPlainObject
external interface Accessors<Option> {
    val getOptionValue: GetOptionValue<Option>
    val getOptionLabel: GetOptionLabel<Option>
}

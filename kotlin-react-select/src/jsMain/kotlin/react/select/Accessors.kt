package react.select

import js.objects.JsPlainObject

@JsPlainObject
external interface Accessors<Option> {
    val getOptionValue: GetOptionValue<Option>
    val getOptionLabel: GetOptionLabel<Option>
}

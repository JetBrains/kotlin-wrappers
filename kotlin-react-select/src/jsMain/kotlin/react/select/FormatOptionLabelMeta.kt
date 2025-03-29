package react.select

import js.objects.JsPlainObject

@JsPlainObject
external interface FormatOptionLabelMeta<Option> {
    val context: FormatOptionLabelContext
    val inputValue: String
    val selectValue: Options<Option>
}

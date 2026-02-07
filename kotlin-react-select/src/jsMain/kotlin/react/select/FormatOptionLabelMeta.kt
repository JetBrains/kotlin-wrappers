package react.select

import kotlinx.js.JsPlainObject

@JsPlainObject
external interface FormatOptionLabelMeta<Option> {
    val context: FormatOptionLabelContext
    val inputValue: String
    val selectValue: Options<Option>
}

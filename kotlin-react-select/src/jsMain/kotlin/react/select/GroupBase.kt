package react.select

import js.array.ReadonlyArray
import kotlinx.js.JsPlainObject

@JsPlainObject
external interface GroupBase<Option> {
    val options: ReadonlyArray<Option>
    val label: String?
}

package react.select

import js.array.ReadonlyArray
import js.objects.JsPlainObject

@JsPlainObject
external interface GroupBase<Option> {
    val options: ReadonlyArray<Option>
    val label: String?
}

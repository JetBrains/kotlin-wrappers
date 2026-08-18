package react.select

import kotlinx.js.JsPlainObject

@JsPlainObject
sealed external interface ActionMeta<Option> {
    val action: Action
    val option: Option?
    val removedValue: Option?
    val removedValues: Options<Option>?
    val name: String?
}

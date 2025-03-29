package react.select

import js.objects.JsPlainObject

@JsPlainObject
sealed external interface ActionMeta<Option> {
    val action: String
    val option: Option?
    val removedValue: Option?
    val removedValues: Options<Option>?
    val name: String?
}

package react.select

import js.objects.jso
import react.ChildrenBuilder
import react.ReactDsl

fun <Option : Any, Group : GroupBase<Option>> ChildrenBuilder.CreatableSelect(
    block: @ReactDsl CreatableSelectProps<Option, Group>.() -> Unit,
) {
    child(CreatableSelect, jso(block))
}

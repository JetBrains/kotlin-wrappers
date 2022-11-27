package react.select

import js.core.jso
import react.ChildrenBuilder
import react.ReactDsl

fun <Option : Any, Group : GroupBase<Option>> ChildrenBuilder.Select(
    block: @ReactDsl SelectProps<Option, Group>.() -> Unit,
) {
    child(Select, jso(block))
}

package react.select

import kotlinx.js.jso
import react.ChildrenBuilder
import react.ReactDsl

fun <Option : Any, Group : GroupBase<Option>> ChildrenBuilder.Select(
    block: @ReactDsl SelectProps<Option, Group>.() -> Unit,
) {
    child(Select, jso(block))
}

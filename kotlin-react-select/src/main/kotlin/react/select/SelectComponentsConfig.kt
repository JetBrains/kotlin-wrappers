package react.select

import kotlinx.js.jso
import react.ComponentType

external interface SelectComponentsConfig<Option : Any, Group : GroupBase<Option>> {
    var ClearIndicator: ComponentType<ClearIndicatorProps>?
    var DropdownIndicator: ComponentType<DropdownIndicatorProps>?
    var Menu: ComponentType<MenuProps>?
    var MultiValueRemove: ComponentType<MultiValueRemoveProps<Option, Group>>?
    var MultiValueContainer: ComponentType<MultiValueGenericProps<Option, Group>>?
}


inline fun <Option : Any, Group : GroupBase<Option>> ComponentsConfig(
    block: SelectComponentsConfig<Option, Group>.() -> Unit,
): SelectComponentsConfig<Option, Group> =
    jso(block)

package react.select

import js.core.jso
import react.ComponentType

external interface SelectComponentsConfig<Option : Any, Group : GroupBase<Option>> {
    var ClearIndicator: ComponentType<ClearIndicatorProps>?
    var DropdownIndicator: ComponentType<DropdownIndicatorProps>?
    var Group: ComponentType<GroupProps<Option, Group>>?
    var GroupHeading: ComponentType<GroupHeadingProps<Option, Group>>?
    var Menu: ComponentType<MenuProps>?
    var MultiValueRemove: ComponentType<MultiValueRemoveProps<Option, Group>>?
    var MultiValueContainer: ComponentType<MultiValueGenericProps<Option, Group>>?
    var Option: ComponentType<OptionProps<Option, Group>>?
    var SingleValue: ComponentType<SingleValueProps<Option, Group>>?
}


inline fun <Option : Any, Group : GroupBase<Option>> ComponentsConfig(
    block: SelectComponentsConfig<Option, Group>.() -> Unit,
): SelectComponentsConfig<Option, Group> =
    jso(block)

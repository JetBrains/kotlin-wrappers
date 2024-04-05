package react.select

import js.objects.jso
import react.ComponentType

external interface SelectComponentsConfig<Option : Any, Group : GroupBase<Option>> {
    var ClearIndicator: ComponentType<ClearIndicatorProps>?
    var DropdownIndicator: ComponentType<DropdownIndicatorProps>?
    var Group: ComponentType<GroupProps<Option, Group>>?
    var GroupHeading: ComponentType<GroupHeadingProps<Option, Group>>?
    var LoadingIndicator: ComponentType<LoadingIndicatorProps>?
    var Menu: ComponentType<MenuProps>?
    var MultiValueRemove: ComponentType<MultiValueRemoveProps<Option, Group>>?
    var MultiValueContainer: ComponentType<MultiValueGenericProps<Option, Group>>?
    var NoOptionsMessage: ComponentType<NoOptionsMessageProps>?
    var Option: ComponentType<OptionProps<Option, Group>>?
    var SingleValue: ComponentType<SingleValueProps<Option, Group>>?
    var ValueContainer: ComponentType<ValueContainerProps<Option, Group>>?
}


inline fun <Option : Any, Group : GroupBase<Option>> ComponentsConfig(
    block: SelectComponentsConfig<Option, Group>.() -> Unit,
): SelectComponentsConfig<Option, Group> =
    jso(block)

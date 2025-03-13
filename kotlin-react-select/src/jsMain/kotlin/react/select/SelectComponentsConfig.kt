package react.select

import js.objects.jso
import react.ComponentType

external interface SelectComponentsConfig<Option : Any, Group : GroupBase<Option>> {
    var ClearIndicator: ComponentType<ClearIndicatorProps<Option, Group>>?
    var DropdownIndicator: ComponentType<DropdownIndicatorProps<Option, Group>>?
    var Group: ComponentType<GroupProps<Option, Group>>?
    var GroupHeading: ComponentType<GroupHeadingProps<Option, Group>>?
    var LoadingIndicator: ComponentType<LoadingIndicatorProps<Option, Group>>?
    var Menu: ComponentType<MenuProps<Option, Group>>?
    var MultiValue: ComponentType<MultiValueGenericProps<Option, Group>>?
    var MultiValueContainer: ComponentType<MultiValueGenericProps<Option, Group>>?
    var MultiValueLabel: ComponentType<MultiValueGenericProps<Option, Group>>?
    var MultiValueRemove: ComponentType<MultiValueRemoveProps<Option, Group>>?
    var NoOptionsMessage: ComponentType<NoOptionsMessageProps<Option, Group>>?
    var Option: ComponentType<OptionProps<Option, Group>>?
    var SingleValue: ComponentType<SingleValueProps<Option, Group>>?
    var ValueContainer: ComponentType<ValueContainerProps<Option, Group>>?
}

inline fun <Option : Any, Group : GroupBase<Option>> ComponentsConfig(
    block: SelectComponentsConfig<Option, Group>.() -> Unit,
): SelectComponentsConfig<Option, Group> =
    jso(block)

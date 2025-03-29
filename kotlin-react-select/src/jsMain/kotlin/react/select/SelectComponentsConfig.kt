package react.select

import js.objects.JsPlainObject
import react.ComponentType

@JsPlainObject
external interface SelectComponentsConfig<Option : Any, Group : GroupBase<Option>> {
    val ClearIndicator: ComponentType<ClearIndicatorProps<Option, Group>>?
    val DropdownIndicator: ComponentType<DropdownIndicatorProps<Option, Group>>?
    val Group: ComponentType<GroupProps<Option, Group>>?
    val GroupHeading: ComponentType<GroupHeadingProps<Option, Group>>?
    val LoadingIndicator: ComponentType<LoadingIndicatorProps<Option, Group>>?
    val Menu: ComponentType<MenuProps<Option, Group>>?
    val MultiValue: ComponentType<MultiValueGenericProps<Option, Group>>?
    val MultiValueContainer: ComponentType<MultiValueGenericProps<Option, Group>>?
    val MultiValueLabel: ComponentType<MultiValueGenericProps<Option, Group>>?
    val MultiValueRemove: ComponentType<MultiValueRemoveProps<Option, Group>>?
    val NoOptionsMessage: ComponentType<NoOptionsMessageProps<Option, Group>>?
    val Option: ComponentType<OptionProps<Option, Group>>?
    val SingleValue: ComponentType<SingleValueProps<Option, Group>>?
    val ValueContainer: ComponentType<ValueContainerProps<Option, Group>>?
}

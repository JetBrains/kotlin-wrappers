package react.select

import kotlinx.js.JsPlainObject

@JsPlainObject
external interface StylesConfig<Option : Any, Group : GroupBase<Option>> {
    val clearIndicator: StylesConfigFunction<ClearIndicatorProps<Option, Group>>?
    val container: StylesConfigFunction<ContainerProps<Option, Group>>?
    val control: StylesConfigFunction<ControlProps<Option, Group>>
    val dropdownIndicator: StylesConfigFunction<DropdownIndicatorProps<Option, Group>>?
    val group: StylesConfigFunction<GroupProps<Option, Group>>?
    val groupHeading: StylesConfigFunction<GroupHeadingProps<Option, Group>>?
    val indicatorsContainer: StylesConfigFunction<IndicatorsContainerProps<Option, Group>>?
    val indicatorSeparator: StylesConfigFunction<IndicatorSeparatorProps<Option, Group>>?
    val input: StylesConfigFunction<InputSpecificProps<Option, Group>>?
    val loadingIndicator: StylesConfigFunction<LoadingIndicatorProps<Option, Group>>?
    val menu: StylesConfigFunction<MenuProps<Option, Group>>?
    val menuList: StylesConfigFunction<MenuListProps<Option, Group>>?
    val menuPortal: StylesConfigFunction<MenuPortalProps<Option, Group>>? /* PortalStyleArgs */
    val multiValue: StylesConfigFunction<MultiValueProps<Option, Group>>?
    val multiValueLabel: StylesConfigFunction<MultiValueProps<Option, Group>>?
    val multiValueRemove: StylesConfigFunction<MultiValueProps<Option, Group>>?
    val noOptionsMessage: StylesConfigFunction<NoOptionsMessageProps<Option, Group>>?
    val option: StylesConfigFunction<OptionProps<Option, Group>>?
    val placeholder: StylesConfigFunction<PlaceholderProps<Option, Group>>?
    val singleValue: StylesConfigFunction<SingleValueProps<Option, Group>>?
    val valueContainer: StylesConfigFunction<ValueContainerProps<Option, Group>>?
}

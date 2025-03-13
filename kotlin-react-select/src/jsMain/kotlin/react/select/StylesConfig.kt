package react.select

import csstype.PropertiesBuilder
import js.objects.Object
import js.objects.jso
import js.reflect.unsafeCast
import react.Props

typealias StylesConfigFunction<P /* Props */> = (
    base: CSSObjectWithLabel,
    props: P,
) -> CSSObjectWithLabel

fun <P : Props> Styles(
    block: /* CSSObjectWithLabel */ PropertiesBuilder.(props: P) -> Unit,
): StylesConfigFunction<P> {
    return { base, props ->
        val result = Object.assign(jso(), base)
        block(unsafeCast(result), props)
        result
    }
}

external interface StylesConfig<Option : Any, Group : GroupBase<Option>> {
    var clearIndicator: StylesConfigFunction<ClearIndicatorProps<Option, Group>>?
    var container: StylesConfigFunction<ContainerProps<Option, Group>>?
    var control: StylesConfigFunction<ControlProps<Option, Group>>
    var dropdownIndicator: StylesConfigFunction<DropdownIndicatorProps<Option, Group>>?
    var group: StylesConfigFunction<GroupProps<Option, Group>>?
    var groupHeading: StylesConfigFunction<GroupHeadingProps<Option, Group>>?
    var indicatorsContainer: StylesConfigFunction<IndicatorsContainerProps<Option, Group>>?
    var indicatorSeparator: StylesConfigFunction<IndicatorSeparatorProps<Option, Group>>?
    var input: StylesConfigFunction<InputSpecificProps<Option, Group>>?
    var loadingIndicator: StylesConfigFunction<LoadingIndicatorProps<Option, Group>>?
    var menu: StylesConfigFunction<MenuProps<Option, Group>>?
    var menuList: StylesConfigFunction<MenuListProps<Option, Group>>?
    var menuPortal: StylesConfigFunction<MenuPortalProps<Option, Group>>? /* PortalStyleArgs */
    var multiValue: StylesConfigFunction<MultiValueProps<Option, Group>>?
    var multiValueLabel: StylesConfigFunction<MultiValueProps<Option, Group>>?
    var multiValueRemove: StylesConfigFunction<MultiValueProps<Option, Group>>?
    var noOptionsMessage: StylesConfigFunction<NoOptionsMessageProps<Option, Group>>?
    var option: StylesConfigFunction<OptionProps<Option, Group>>?
    var placeholder: StylesConfigFunction<PlaceholderProps<Option, Group>>?
    var singleValue: StylesConfigFunction<SingleValueProps<Option, Group>>?
    var valueContainer: StylesConfigFunction<ValueContainerProps<Option, Group>>?
}

inline fun <Option : Any, Group : GroupBase<Option>> StylesConfig(
    block: StylesConfig<Option, Group>.() -> Unit,
): StylesConfig<Option, Group> =
    jso(block)

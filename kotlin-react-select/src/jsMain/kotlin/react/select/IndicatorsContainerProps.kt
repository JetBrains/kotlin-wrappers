package react.select

import react.Props
import react.PropsWithChildren

external interface IndicatorsContainerProps<Option : Any, Group : GroupBase<Option>> : PropsWithChildren {
    var innerProps: Props?
    var isDisabled: Boolean
    var selectProps: SelectProps<Option, Group>
}

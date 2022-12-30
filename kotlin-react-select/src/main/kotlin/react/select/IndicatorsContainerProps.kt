package react.select

import react.Props
import react.PropsWithChildren

external interface IndicatorsContainerProps : PropsWithChildren {
    var innerProps: Props?
    var isDisabled: Boolean
}

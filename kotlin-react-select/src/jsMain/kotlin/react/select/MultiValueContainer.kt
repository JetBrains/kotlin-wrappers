package react.select

import csstype.ClassName
import react.PropsWithChildren
import react.PropsWithClassName

external interface MultiValueGenericProps<Option : Any, Group : GroupBase<Option>> : PropsWithChildren {
    var data: Any
    var innerProps: InnerProps
    var selectProps: SelectProps<Option, Group>

    interface InnerProps : PropsWithClassName {
        override var className: ClassName?
    }
}

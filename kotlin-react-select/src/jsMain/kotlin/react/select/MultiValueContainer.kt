package react.select

import react.PropsWithChildren
import react.PropsWithClassName
import web.cssom.ClassName

external interface MultiValueGenericProps<Option : Any, Group : GroupBase<Option>> : PropsWithChildren {
    var data: Any
    var innerProps: InnerProps
    var selectProps: SelectProps<Option, Group>

    interface InnerProps : PropsWithClassName {
        override var className: ClassName?
    }
}

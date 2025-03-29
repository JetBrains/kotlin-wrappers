package react.select

import react.Props
import react.RefCallback
import web.cssom.ClassName
import web.html.HTMLInputElement

external interface InputSpecificProps<Option : Any, Group : GroupBase<Option>> :
    Props {

    /** Reference to the internal element */
    var innerRef: RefCallback<HTMLInputElement>?
    var isHidden: Boolean
    var isDisabled: Boolean?
    var form: String?
    var inputClassName: ClassName?
    var selectProps: SelectProps<Option, Group>
}

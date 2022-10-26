package react.select

import dom.html.HTMLInputElement
import react.Props
import react.RefCallback

external interface InputSpecificProps : Props {

    /** Reference to the internal element */
    var innerRef: RefCallback<HTMLInputElement>
    var isHidden: Boolean
    var isDisabled: Boolean?
    var form: String?
    var inputClassName: String?
}

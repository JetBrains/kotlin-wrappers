package muix.pickers

import mui.material.BaseSize
import react.PropsWithClassName
import react.PropsWithRef
import web.dom.Element

external interface TimeFieldProps<TValue : Any> :
    PropsWithClassName,
    PropsWithRef<Element> {
    var clearable: Boolean?
    var shouldRespectLeadingZeros: Boolean?
    var error: Boolean?

    var size: BaseSize?

    var label: String?
    var format: String?
    var defaultValue: TValue?
    var value: TValue?

    var onChange: ((TValue?, Any) -> Unit)?
    var onError: ((String?, TValue?) -> Unit)?
}

@file:JsModule("react-popper")
@file:JsNonModule

package react.popper

import react.ComponentClass
import react.FC
import react.Props
import react.Ref

external interface ReferenceChildrenProps : Props {
    var ref: Ref<*>
}

external interface ReferenceProps : Props {
    var children: FC<ReferenceChildrenProps>
    var innerRef: Ref<*>
}

external val Reference: ComponentClass<ReferenceProps>

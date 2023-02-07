@file:JsModule("react-popper")
@file:JsNonModule

package react.popper

import react.*

external interface ReferenceChildrenProps :
    PropsWithRef<Any>

external interface ReferenceProps : Props {
    var children: FC<ReferenceChildrenProps>
    var innerRef: Ref<*>
}

external val Reference: ComponentClass<ReferenceProps>

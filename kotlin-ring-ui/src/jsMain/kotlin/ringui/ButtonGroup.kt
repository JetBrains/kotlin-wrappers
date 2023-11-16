@file:JsModule("@jetbrains/ring-ui/components/button-group/button-group")

package ringui

import react.ComponentClass
import react.PropsWithChildren
import react.PropsWithClassName

external interface ButtonGroupProps : PropsWithChildren, PropsWithClassName

@JsName("default")
external val ButtonGroup: ComponentClass<ButtonGroupProps>

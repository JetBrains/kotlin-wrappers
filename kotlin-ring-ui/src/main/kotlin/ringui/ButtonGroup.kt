@file:JsModule("@jetbrains/ring-ui/components/button-group/button-group")
@file:JsNonModule

package ringui

import react.ComponentClass
import react.PropsWithClassName

external interface ButtonGroupProps : PropsWithClassName

@JsName("default")
external val ButtonGroup: ComponentClass<ButtonGroupProps>

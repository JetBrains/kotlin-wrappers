@file:JsModule("@jetbrains/ring-ui/components/button-group/button-group")
@file:JsNonModule

package ringui

import react.ComponentClass
import react.dom.WithClassName

external interface ButtonGroupProps : WithClassName

@JsName("default")
external val ButtonGroup: ComponentClass<ButtonGroupProps>
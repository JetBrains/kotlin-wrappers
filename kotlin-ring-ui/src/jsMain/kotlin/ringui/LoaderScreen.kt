@file:JsModule("@jetbrains/ring-ui/components/loader-screen/loader-screen")
@file:JsNonModule

package ringui

import react.ComponentClass

external interface LoaderScreenProps : LoaderProps {
    var containerClassName: String
}

@JsName("default")
external val LoaderScreen: ComponentClass<LoaderScreenProps>

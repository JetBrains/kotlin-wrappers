@file:JsModule("@jetbrains/ring-ui/components/loader/loader")
@file:JsNonModule

package ringui

import kotlinext.js.ReadonlyArray
import react.ComponentClass
import react.PropsWithClassName

external interface LoaderProps : PropsWithClassName {
    var size: Int
    var colors: ReadonlyArray<Color>
    var message: String
    var stop: Boolean
    var deterministic: Boolean
}

@JsName("default")
external val Loader: ComponentClass<LoaderProps>
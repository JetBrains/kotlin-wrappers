@file:JsModule("@jetbrains/ring-ui/components/loader/loader")
@file:JsNonModule

package ringui

import kotlinext.js.ReadonlyArray
import react.ComponentClass
import react.PropsWithClassName

external interface LoaderProps : PropsWithClassName{
    var size: Number
    var colors: ReadonlyArray<RGB>
    var message: String
    var stop: Boolean
    var deterministic: Boolean
}

external interface RGB {
    val r: Short
    val g: Short
    val b: Short
}

@JsName("default")
external val Loader: ComponentClass<LoaderProps>
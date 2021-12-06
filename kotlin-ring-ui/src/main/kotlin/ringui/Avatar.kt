@file:JsModule("@jetbrains/ring-ui/components/avatar/avatar")
@file:JsNonModule

package ringui

import react.ComponentClass
import react.PropsWithClassName
import react.PropsWithStyle

external interface AvatarProps : PropsWithClassName {
    var dpr: Double
    var size: Double
    var style: PropsWithStyle
    var url: String
    var round: Boolean?
    var subavatar: String
    var subavatarSize: Double
    var username: String
    var skipParams: Boolean?
}

@JsName("default")
external val Avatar: ComponentClass<AvatarProps>

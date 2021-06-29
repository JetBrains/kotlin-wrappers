@file:JsModule("@jetbrains/ring-ui/components/header/header")
@file:JsNonModule

package ringui

import react.RClass
import react.dom.WithClassName

// https://github.com/JetBrains/ring-ui/blob/master/components/header/header.js
external interface HeaderProps : WithClassName {
    var spaced: Boolean
    var theme: String
}

@JsName("default")
external val Header: RClass<HeaderProps>
external val RerenderableHeader: RClass<HeaderProps>

// Logo
external interface HeaderLogoProps : IconProps

external val Logo: RClass<HeaderLogoProps>

// Tray
// https://github.com/JetBrains/ring-ui/blob/master/components/header/tray.js
external interface TrayProps : WithClassName

external val Tray: RClass<TrayProps>

// TrayIcon
// https://github.com/JetBrains/ring-ui/blob/master/components/header/tray-icon.js
external interface TrayIconProps : ButtonProps {
    var rotatable: Boolean
}

external val TrayIcon: RClass<TrayIconProps>

external val Profile: RClass<WithClassName>
external val SmartProfile: RClass<WithClassName>
external val Services: RClass<WithClassName>
external val SmartServices: RClass<WithClassName>

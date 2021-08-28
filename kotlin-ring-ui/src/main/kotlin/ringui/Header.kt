@file:JsModule("@jetbrains/ring-ui/components/header/header")
@file:JsNonModule

package ringui

import react.ComponentClass
import react.dom.WithClassName

// https://github.com/JetBrains/ring-ui/blob/master/components/header/header.js
external interface HeaderProps : WithClassName {
    var spaced: Boolean
    var theme: String
}

@JsName("default")
external val Header: ComponentClass<HeaderProps>
external val RerenderableHeader: ComponentClass<HeaderProps>

// Logo
external interface HeaderLogoProps : IconProps

external val Logo: ComponentClass<HeaderLogoProps>

// Tray
// https://github.com/JetBrains/ring-ui/blob/master/components/header/tray.js
external interface TrayProps : WithClassName

external val Tray: ComponentClass<TrayProps>

// TrayIcon
// https://github.com/JetBrains/ring-ui/blob/master/components/header/tray-icon.js
external interface TrayIconProps : ButtonProps {
    var rotatable: Boolean
}

external val TrayIcon: ComponentClass<TrayIconProps>

external val Profile: ComponentClass<WithClassName>
external val SmartProfile: ComponentClass<WithClassName>
external val Services: ComponentClass<WithClassName>
external val SmartServices: ComponentClass<WithClassName>

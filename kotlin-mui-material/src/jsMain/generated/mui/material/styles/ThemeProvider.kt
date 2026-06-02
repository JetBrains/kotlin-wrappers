// Automatically generated - do not modify!

@file:JsModule("@mui/material/styles/ThemeProvider")

package mui.material.styles

import react.FC
import react.PropsWithChildren
import react.ReactNode

external interface ThemeProviderProps : PropsWithChildren {
    override var children: ReactNode?
    var theme: Any? /* Partial<Theme> | ((outerTheme: Theme) => Theme) */
}

@JsName("default")
external val ThemeProvider: FC<ThemeProviderProps>

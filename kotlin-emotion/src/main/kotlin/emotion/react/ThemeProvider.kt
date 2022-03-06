@file:JsModule("@emotion/react")
@file:JsNonModule

package emotion.react

import react.FC
import react.PropsWithChildren

external interface ThemeProviderProps : PropsWithChildren {
    var theme: (outerTheme: Theme) -> Theme
}

external val ThemeProvider: FC<ThemeProviderProps>

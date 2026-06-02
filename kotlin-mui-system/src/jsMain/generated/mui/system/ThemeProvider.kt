// Automatically generated - do not modify!

@file:JsModule("@mui/system/ThemeProvider")

package mui.system

import react.FC
import react.PropsWithChildren
import react.ReactNode

external interface ThemeProviderProps : PropsWithChildren {
    /**
     * Your component tree.
     */
    override var children: ReactNode?

    /**
     * The design system's unique id for getting the corresponded theme when there are multiple design systems.
     */
    var themeId: String?

    /**
     * A theme object. You can provide a function to extend the outer theme.
     */
    var theme: Any? /* Partial<Theme> | ((outerTheme: Theme) => Theme) */
}

/**
 * This component makes the `theme` available down the React tree.
 * It should preferably be used at **the root of your component tree**.
 * API:
 *
 * - [ThemeProvider API](https://mui.com/material-ui/customization/theming/#themeprovider)
 */
@JsName("default")
external val ThemeProvider: FC<ThemeProviderProps>

// Automatically generated - do not modify!

@file:JsModule("@mui/system/ThemeProvider")
@file:JsNonModule

package mui.system

external interface ThemeProviderProps : react.PropsWithChildren {
    /**
     * Your component tree.
     */
    override var children: react.ReactNode?

    /**
     * The design system's unique id for getting the corresponded theme when there are multiple design systems.
     */
    var themeId: String?

    /**
     * A theme object. You can provide a function to extend the outer theme.
     */
    var theme: dynamic
}

/**
 * This component makes the `theme` available down the React tree.
 * It should preferably be used at **the root of your component tree**.
 * API:
 *
 * - [ThemeProvider API](https://mui.com/material-ui/customization/theming/#themeprovider)
 */
@JsName("default")
external val ThemeProvider: react.FC<ThemeProviderProps>

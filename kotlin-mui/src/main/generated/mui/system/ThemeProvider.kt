// Automatically generated - do not modify!

@file:JsModule("@mui/system/ThemeProvider")
@file:JsNonModule

package mui.system

external interface ThemeProviderProps : react.PropsWithChildren {
    override var children: react.ReactNode?

    var theme: dynamic
}

/**
 * This component makes the `theme` available down the React tree.
 * It should preferably be used at **the root of your component tree**.
 * API:
 *
 * - [ThemeProvider API](/material-ui/customization/theming/#themeprovider)
 */
@JsName("default")
external val ThemeProvider: react.FC<ThemeProviderProps>

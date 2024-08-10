// Automatically generated - do not modify!

package mui.system

external interface InitColorSchemeScriptProps : react.Props {
    /**
     * The mode to be used for the first visit
     * @default 'light'
     */
    var defaultMode: Union? /* 'light' | 'dark' | 'system' */

    /**
     * The default color scheme to be used on the light mode
     * @default 'light'
     */
    var defaultLightColorScheme: String?

    /**
     * The default color scheme to be used on the dark mode
     * * @default 'dark'
     */
    var defaultDarkColorScheme: String?

    /**
     * The node (provided as string) used to attach the color-scheme attribute
     * @default 'document.documentElement'
     */
    var colorSchemeNode: String?

    /**
     * localStorage key used to store `mode`
     * @default 'mode'
     */
    var modeStorageKey: String?

    /**
     * localStorage key used to store `colorScheme`
     * @default 'color-scheme'
     */
    var colorSchemeStorageKey: String?

    /**
     * DOM attribute for applying color scheme
     * @default 'data-color-scheme'
     */
    var attribute: String?

    /**
     * Nonce string to pass to the inline script for CSP headers
     */
    var nonce: String?
}

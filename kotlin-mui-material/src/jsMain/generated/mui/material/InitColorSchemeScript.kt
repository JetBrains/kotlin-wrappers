// Automatically generated - do not modify!

package mui.material

import mui.system.Union
import react.Props

external interface InitColorSchemeScriptProps : Props {
    /**
     * The default mode when the storage is empty (user's first visit).
     * @default 'system'
     */
    var defaultMode: Union? /* 'system' | 'light' | 'dark' */

    /**
     * The default color scheme to be used in light mode.
     * @default 'light'
     */
    var defaultLightColorScheme: String?

    /**
     * The default color scheme to be used in dark mode.
     * @default 'dark'
     */
    var defaultDarkColorScheme: String?

    /**
     * The node (provided as string) used to attach the color-scheme attribute.
     * @default 'document.documentElement'
     */
    var colorSchemeNode: String?

    /**
     * localStorage key used to store `mode`.
     * @default 'mui-mode'
     */
    var modeStorageKey: String?

    /**
     * localStorage key used to store `colorScheme`.
     * @default 'mui-color-scheme'
     */
    var colorSchemeStorageKey: String?

    /**
     * DOM attribute for applying a color scheme.
     * @default 'data-mui-color-scheme'
     * @example '.mode-%s' // for class based color scheme
     * @example '[data-mode-%s]' // for data-attribute without '='
     */
    var attribute: Union? /* 'class' | 'data' | string */

    /**
     * Nonce string to pass to the inline script for CSP headers.
     */
    var nonce: String?
}

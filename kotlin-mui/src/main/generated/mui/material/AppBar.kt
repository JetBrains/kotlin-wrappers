// Automatically generated - do not modify!

@file:JsModule("@mui/material/AppBar")
@file:JsNonModule

package mui.material

external interface AppBarProps :
    react.dom.html.HTMLAttributes<org.w3c.dom.HTMLElement> {
    /**
     * Override or extend the styles applied to the component.
     */
    var classes: AppBarClasses?

    /**
     * The color of the component. It supports those theme colors that make sense for this component.
     * @default 'primary'
     */
    var color: csstype.Color?

    /**
     * If true, the `color` prop is applied in dark mode.
     * @default false
     */
    var enableColorOnDark: Boolean?

    /**
     * The positioning type. The behavior of the different options is described
     * [in the MDN web docs](https://developer.mozilla.org/en-US/docs/Learn/CSS/CSS_layout/Positioning).
     * Note: `sticky` is not universally supported and will fall back to `static` when unavailable.
     * @default 'fixed'
     */
    var position: mui.system.Union? /* 'fixed' | 'absolute' | 'sticky' | 'static' | 'relative' */

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    var sx: mui.system.SxProps<mui.system.Theme>?
}

/**
 *
 * Demos:
 *
 * - [App Bar](https://mui.com/components/app-bar/)
 *
 * API:
 *
 * - [AppBar API](https://mui.com/api/app-bar/)
 * - inherits [Paper API](https://mui.com/api/paper/)
 */

@JsName("default")
external val AppBar: react.FC<AppBarProps>

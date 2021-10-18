// Automatically generated - do not modify!

@file:JsModule("@mui/material/Icon")
@file:JsNonModule

package mui.material

import kotlinext.js.ReadonlyArray

external interface IconProps :
    react.dom.html.HTMLAttributes<org.w3c.dom.HTMLSpanElement>,
    react.PropsWithChildren {
    /**
     * The base class applied to the icon. Defaults to 'material-icons', but can be changed to any
     * other base class that suits the icon font you're using (e.g. material-icons-rounded, fas, etc).
     * @default 'material-icons'
     */
    var baseClassName: String?

    /**
     * The name of the icon font ligature.
     */
    override var children: ReadonlyArray<react.ReactNode>?

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: IconClasses?

    /**
     * The color of the component. It supports those theme colors that make sense for this component.
     * @default 'inherit'
     */
    var color: mui.system.Union? /* | 'inherit' | 'action' | 'disabled' | 'primary' | 'secondary' | 'error' | 'info' | 'success' | 'warning', IconPropsColorOverrides */

    /**
     * The fontSize applied to the icon. Defaults to 24px, but can be configure to inherit font size.
     * @default 'medium'
     */
    var fontSize: mui.system.Union? /* 'inherit' | 'large' | 'medium' | 'small', IconPropsSizeOverrides */

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    var sx: mui.system.SxProps<mui.system.Theme>?
}

/**
 *
 * Demos:
 *
 * - [Icons](https://mui.com/components/icons/)
 * - [Material Icons](https://mui.com/components/material-icons/)
 *
 * API:
 *
 * - [Icon API](https://mui.com/api/icon/)
 */
@JsName("default")
external val Icon: react.FC<IconProps>

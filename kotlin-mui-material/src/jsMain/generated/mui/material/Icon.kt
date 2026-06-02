// Automatically generated - do not modify!

@file:JsModule("@mui/material/Icon")

package mui.material

import mui.material.styles.Theme
import mui.system.PropsWithSx
import mui.system.SxProps
import mui.types.PropsWithComponent
import react.FC
import react.PropsWithChildren
import react.ReactNode
import react.dom.html.HTMLAttributes
import web.cssom.ClassName
import web.html.HTMLSpanElement

external interface IconProps :
    IconOwnProps,
    HTMLAttributes<HTMLSpanElement>,
    PropsWithComponent

external interface IconOwnProps :
    PropsWithChildren,
    PropsWithSx {
    /**
     * The base class applied to the icon. Defaults to 'material-icons', but can be changed to any
     * other base class that suits the icon font you're using (for example material-icons-rounded, fas, etc).
     * @default 'material-icons'
     */
    var baseClassName: ClassName?

    /**
     * The name of the icon font ligature.
     */
    override var children: ReactNode?

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: IconClasses?

    /**
     * The color of the component.
     * It supports both default and custom theme colors, which can be added as shown in the
     * [palette customization guide](https://mui.com/material-ui/customization/palette/#custom-colors).
     * @default 'inherit'
     */
    var color: IconColor?

    /**
     * The fontSize applied to the icon. Defaults to 24px, but can be configure to inherit font size.
     * @default 'medium'
     */
    var fontSize: IconSize?

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    override var sx: SxProps<Theme>?
}

/**
 *
 * Demos:
 *
 * - [Icons](https://v6.mui.com/material-ui/icons/)
 * - [Material Icons](https://v6.mui.com/material-ui/material-icons/)
 *
 * API:
 *
 * - [Icon API](https://v6.mui.com/material-ui/api/icon/)
 */
@JsName("default")
external val Icon: FC<IconProps>

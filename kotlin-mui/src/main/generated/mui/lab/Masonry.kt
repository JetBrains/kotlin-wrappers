// Automatically generated - do not modify!

@file:JsModule("@mui/lab/Masonry")
@file:JsNonModule

package mui.lab

import mui.material.styles.Theme
import mui.system.SxProps

external interface MasonryProps :
    react.dom.html.HTMLAttributes<org.w3c.dom.HTMLDivElement>,
    react.PropsWithChildren,
    mui.system.PropsWithSx,
    mui.types.PropsWithComponent {
    /**
     * The content of the component.
     */
    override var children: react.ReactNode?

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: MasonryClasses?

    /**
     * Number of columns.
     * @default 4
     */
    var columns: mui.system.ResponsiveStyleValue<dynamic>?

    /**
     * The default number of columns of the component. This is provided for server-side rendering.
     */
    var defaultColumns: Number?

    /**
     * The default height of the component in px. This is provided for server-side rendering.
     */
    var defaultHeight: Number?

    /**
     * The default spacing of the component. Like `spacing`, it is a factor of the theme's spacing. This is provided for server-side rendering.
     */
    var defaultSpacing: Number?

    /**
     * Defines the space between children. It is a factor of the theme's spacing.
     * @default 1
     */
    var spacing: mui.system.ResponsiveStyleValue<dynamic>?

    /**
     * Allows defining system overrides as well as additional CSS styles.
     */
    override var sx: SxProps<Theme>?
}

/**
 *
 * Demos:
 *
 * - [Masonry](https://mui.com/material-ui/react-masonry/)
 *
 * API:
 *
 * - [Masonry API](https://mui.com/material-ui/api/masonry/)
 */
@JsName("default")
external val Masonry: react.FC<MasonryProps>

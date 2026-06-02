// Automatically generated - do not modify!

@file:JsModule("@mui/lab/Masonry")

package mui.lab

import mui.material.styles.Theme
import mui.system.PropsWithSx
import mui.system.ResponsiveStyleValue
import mui.system.SxProps
import mui.types.PropsWithComponent
import react.FC
import react.PropsWithChildren
import react.ReactNode
import react.dom.html.HTMLAttributes
import web.html.HTMLDivElement

external interface MasonryProps :
    MasonryOwnProps,
    HTMLAttributes<HTMLDivElement>,
    PropsWithComponent

external interface MasonryOwnProps :
    PropsWithChildren,
    PropsWithSx {
    /**
     * The content of the component.
     */
    override var children: ReactNode?

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: MasonryClasses?

    /**
     * Number of columns.
     * @default 4
     */
    var columns: ResponsiveStyleValue<Any /* number | string */>?

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
    var spacing: ResponsiveStyleValue<Any /* number | string */>?

    /**
     * Allows using sequential order rather than adding to shortest column
     * @default false
     */
    var sequential: Boolean?

    /**
     * Allows defining system overrides as well as additional CSS styles.
     */
    override var sx: SxProps<Theme>?
}

/**
 *
 * Demos:
 *
 * - [Masonry](https://v6.mui.com/material-ui/react-masonry/)
 *
 * API:
 *
 * - [Masonry API](https://v6.mui.com/material-ui/api/masonry/)
 */
@JsName("default")
external val Masonry: FC<MasonryProps>

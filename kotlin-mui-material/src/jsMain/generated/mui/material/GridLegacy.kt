// Automatically generated - do not modify!

@file:JsModule("@mui/material/GridLegacy")

package mui.material

import mui.material.styles.Theme
import mui.system.*
import mui.types.PropsWithComponent
import react.FC
import react.PropsWithChildren
import react.ReactNode
import react.dom.html.HTMLAttributes
import web.html.HTMLDivElement

external interface GridLegacyProps :
    GridLegacyOwnProps,
    HTMLAttributes<HTMLDivElement>,
    PropsWithComponent

external interface RegularBreakpoints {
    /**
     * If a number, it sets the number of columns the grid item uses.
     * It can't be greater than the total number of columns of the container (12 by default).
     * If 'auto', the grid item's width matches its content.
     * If false, the prop is ignored.
     * If true, the grid item's width grows to use the space available in the grid container.
     * The value is applied for the `lg` breakpoint and wider screens if not overridden.
     * @default false
     */
    var lg: Any? /* boolean | GridLegacySize */

    /**
     * If a number, it sets the number of columns the grid item uses.
     * It can't be greater than the total number of columns of the container (12 by default).
     * If 'auto', the grid item's width matches its content.
     * If false, the prop is ignored.
     * If true, the grid item's width grows to use the space available in the grid container.
     * The value is applied for the `md` breakpoint and wider screens if not overridden.
     * @default false
     */
    var md: Any? /* boolean | GridLegacySize */

    /**
     * If a number, it sets the number of columns the grid item uses.
     * It can't be greater than the total number of columns of the container (12 by default).
     * If 'auto', the grid item's width matches its content.
     * If false, the prop is ignored.
     * If true, the grid item's width grows to use the space available in the grid container.
     * The value is applied for the `sm` breakpoint and wider screens if not overridden.
     * @default false
     */
    var sm: Any? /* boolean | GridLegacySize */

    /**
     * If a number, it sets the number of columns the grid item uses.
     * It can't be greater than the total number of columns of the container (12 by default).
     * If 'auto', the grid item's width matches its content.
     * If false, the prop is ignored.
     * If true, the grid item's width grows to use the space available in the grid container.
     * The value is applied for the `xl` breakpoint and wider screens if not overridden.
     * @default false
     */
    var xl: Any? /* boolean | GridLegacySize */

    /**
     * If a number, it sets the number of columns the grid item uses.
     * It can't be greater than the total number of columns of the container (12 by default).
     * If 'auto', the grid item's width matches its content.
     * If false, the prop is ignored.
     * If true, the grid item's width grows to use the space available in the grid container.
     * The value is applied for all the screen sizes with the lowest priority.
     * @default false
     */
    var xs: Any? /* boolean | GridLegacySize */
}

external interface GridLegacyOwnProps :
    SystemProps<Theme>,
    Breakpoints,
    PropsWithChildren,
    PropsWithSx {
    /**
     * The content of the component.
     */
    override var children: ReactNode?

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: GridLegacyClasses?

    /**
     * The number of columns.
     * @default 12
     */
    var columns: ResponsiveStyleValue<Number>?

    /**
     * Defines the horizontal space between the type `item` components.
     * It overrides the value of the `spacing` prop.
     */
    var columnSpacing: ResponsiveStyleValue<Any /* GridLegacySpacing */>?

    /**
     * If `true`, the component will have the flex *container* behavior.
     * You should be wrapping *items* with a *container*.
     * @default false
     */
    var container: Boolean?

    /**
     * Defines the `flex-direction` style property.
     * It is applied for all screen sizes.
     * @default 'row'
     */
    var direction: ResponsiveStyleValue<GridLegacyDirection>?

    /**
     * If `true`, the component will have the flex *item* behavior.
     * You should be wrapping *items* with a *container*.
     * @default false
     */
    var item: Boolean?

    /**
     * Defines the vertical space between the type `item` components.
     * It overrides the value of the `spacing` prop.
     */
    var rowSpacing: ResponsiveStyleValue<Any /* GridLegacySpacing */>?

    /**
     * Defines the space between the type `item` components.
     * It can only be used on a type `container` component.
     * @default 0
     */
    var spacing: ResponsiveStyleValue<Any /* GridLegacySpacing */>?

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    override var sx: SxProps<Theme>?

    /**
     * Defines the `flex-wrap` style property.
     * It's applied for all screen sizes.
     * @default 'wrap'
     */
    var wrap: Any? /* GridLegacyWrap */

    /**
     * If `true`, it sets `min-width: 0` on the item.
     * Refer to the limitations section of the documentation to better understand the use case.
     * @default false
     */
    var zeroMinWidth: Boolean?
}

/**
 *
 * Demos:
 *
 * - [GridLegacy](https://v7.mui.com/material-ui/react-grid-legacy/)
 *
 * API:
 *
 * - [GridLegacy API](https://v7.mui.com/material-ui/api/grid-legacy/)
 *
 * @deprecated Use the [`Grid`](https://mui.com/material-ui/react-grid/) component instead.
 */
@JsName("default")
external val GridLegacy: FC<GridLegacyProps>

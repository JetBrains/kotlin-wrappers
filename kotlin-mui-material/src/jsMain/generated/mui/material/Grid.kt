// Automatically generated - do not modify!

@file:JsModule("@mui/material/Grid")

package mui.material

import mui.material.styles.Theme
import mui.system.SxProps

external interface GridProps :
    GridOwnProps,
    react.dom.html.HTMLAttributes<web.html.HTMLDivElement>,
    mui.types.PropsWithComponent

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
    var lg: Any? /* boolean | 'auto' | number */

    /**
     * If a number, it sets the number of columns the grid item uses.
     * It can't be greater than the total number of columns of the container (12 by default).
     * If 'auto', the grid item's width matches its content.
     * If false, the prop is ignored.
     * If true, the grid item's width grows to use the space available in the grid container.
     * The value is applied for the `md` breakpoint and wider screens if not overridden.
     * @default false
     */
    var md: Any? /* boolean | 'auto' | number */

    /**
     * If a number, it sets the number of columns the grid item uses.
     * It can't be greater than the total number of columns of the container (12 by default).
     * If 'auto', the grid item's width matches its content.
     * If false, the prop is ignored.
     * If true, the grid item's width grows to use the space available in the grid container.
     * The value is applied for the `sm` breakpoint and wider screens if not overridden.
     * @default false
     */
    var sm: Any? /* boolean | 'auto' | number */

    /**
     * If a number, it sets the number of columns the grid item uses.
     * It can't be greater than the total number of columns of the container (12 by default).
     * If 'auto', the grid item's width matches its content.
     * If false, the prop is ignored.
     * If true, the grid item's width grows to use the space available in the grid container.
     * The value is applied for the `xl` breakpoint and wider screens if not overridden.
     * @default false
     */
    var xl: Any? /* boolean | 'auto' | number */

    /**
     * If a number, it sets the number of columns the grid item uses.
     * It can't be greater than the total number of columns of the container (12 by default).
     * If 'auto', the grid item's width matches its content.
     * If false, the prop is ignored.
     * If true, the grid item's width grows to use the space available in the grid container.
     * The value is applied for all the screen sizes with the lowest priority.
     * @default false
     */
    var xs: Any? /* boolean | 'auto' | number */
}

external interface GridOwnProps :
    react.PropsWithChildren,
    mui.system.PropsWithSx {
    /**
     * The content of the component.
     */
    override var children: react.ReactNode?

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: GridClasses?

    /**
     * The number of columns.
     * @default 12
     */
    var columns: mui.system.ResponsiveStyleValue<Number>?

    /**
     * Defines the horizontal space between the type `item` components.
     * It overrides the value of the `spacing` prop.
     */
    var columnSpacing: mui.system.ResponsiveStyleValue<dynamic>?

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
    var direction: mui.system.ResponsiveStyleValue<GridDirection>?

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
    var rowSpacing: mui.system.ResponsiveStyleValue<dynamic>?

    /**
     * Defines the space between the type `item` components.
     * It can only be used on a type `container` component.
     * @default 0
     */
    var spacing: mui.system.ResponsiveStyleValue<dynamic>?

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    override var sx: SxProps<Theme>?

    /**
     * Defines the `flex-wrap` style property.
     * It's applied for all screen sizes.
     * @default 'wrap'
     */
    var wrap: GridWrap?

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
 * - [Grid](https://mui.com/material-ui/react-grid/)
 *
 * API:
 *
 * - [Grid API](https://mui.com/material-ui/api/grid/)
 */
@JsName("default")
external val Grid: react.FC<GridProps>

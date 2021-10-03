// Automatically generated - do not modify!

@file:JsModule("@mui/material/Grid")
@file:JsNonModule

package mui.material

import kotlinext.js.ReadonlyArray

external interface GridProps : react.PropsWithChildren {
    /**
     * The content of the component.
     */
    override var children: ReadonlyArray<react.ReactNode>?

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: GridClasses

    /**
     * The number of columns.
     * @default 12
     */
    var columns: ResponsiveStyleValue<Number>

    /**
     * Defines the horizontal space between the type `item` components.
     * It overrides the value of the `spacing` prop.
     */
    var columnSpacing: ResponsiveStyleValue<dynamic>

    /**
     * If `true`, the component will have the flex *container* behavior.
     * You should be wrapping *items* with a *container*.
     * @default false
     */
    var container: Boolean

    /**
     * Defines the `flex-direction` style property.
     * It is applied for all screen sizes.
     * @default 'row'
     */
    var direction: ResponsiveStyleValue<GridDirection>

    /**
     * If `true`, the component will have the flex *item* behavior.
     * You should be wrapping *items* with a *container*.
     * @default false
     */
    var item: Boolean

    /**
     * Defines the number of grids the component is going to use.
     * It's applied for the `lg` breakpoint and wider screens if not overridden.
     * @default false
     */
    var lg: dynamic

    /**
     * Defines the number of grids the component is going to use.
     * It's applied for the `md` breakpoint and wider screens if not overridden.
     * @default false
     */
    var md: dynamic

    /**
     * Defines the vertical space between the type `item` components.
     * It overrides the value of the `spacing` prop.
     */
    var rowSpacing: ResponsiveStyleValue<dynamic>

    /**
     * Defines the number of grids the component is going to use.
     * It's applied for the `sm` breakpoint and wider screens if not overridden.
     * @default false
     */
    var sm: dynamic

    /**
     * Defines the space between the type `item` components.
     * It can only be used on a type `container` component.
     * @default 0
     */
    var spacing: ResponsiveStyleValue<dynamic>

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    var sx: SxProps<Theme>

    /**
     * Defines the `flex-wrap` style property.
     * It's applied for all screen sizes.
     * @default 'wrap'
     */
    var wrap: GridWrap

    /**
     * Defines the number of grids the component is going to use.
     * It's applied for the `xl` breakpoint and wider screens.
     * @default false
     */
    var xl: dynamic

    /**
     * Defines the number of grids the component is going to use.
     * It's applied for all the screen sizes with the lowest priority.
     * @default false
     */
    var xs: dynamic

    /**
     * If `true`, it sets `min-width: 0` on the item.
     * Refer to the limitations section of the documentation to better understand the use case.
     * @default false
     */
    var zeroMinWidth: Boolean
}

/**
 *
 * Demos:
 *
 * - [Grid](https://mui.com/components/grid/)
 *
 * API:
 *
 * - [Grid API](https://mui.com/api/grid/)
 */
@JsName("default")
external val Grid: react.FC<GridProps>

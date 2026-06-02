// Automatically generated - do not modify!

@file:JsModule("@mui/material/Grid2")

package mui.material

import mui.material.styles.Theme
import mui.system.PropsWithSx
import mui.system.ResponsiveStyleValue
import mui.system.SxProps
import mui.system.Union
import mui.types.PropsWithComponent
import react.FC
import react.PropsWithChildren
import react.ReactNode
import react.dom.html.HTMLAttributes
import web.html.HTMLDivElement

external interface Grid2Props :
    HTMLAttributes<HTMLDivElement>,
    PropsWithSx,
    PropsWithComponent {
    override var sx: SxProps<Theme>?
}

external interface GridBaseProps : PropsWithChildren {
    /**
     * The content of the component.
     */
    override var children: ReactNode?

    /**
     * The number of columns.
     * @default 12
     */
    var columns: ResponsiveStyleValue<Number>?

    /**
     * Defines the horizontal space between the type `item` components.
     * It overrides the value of the `spacing` prop.
     */
    var columnSpacing: ResponsiveStyleValue<Any /* GridSpacing */>?

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
    var direction: ResponsiveStyleValue<GridDirection>?

    /**
     * Defines the offset value for the type `item` components.
     */
    var offset: ResponsiveStyleValue<Any /* GridOffset */>?

    /**
     * @internal
     * The level of the grid starts from `0` and increases when the grid nests
     * inside another grid. Nesting is defined as a container Grid being a direct
     * child of a container Grid.
     *
     * ```js
     * <Grid container> // level 0
     *   <Grid container> // level 1
     *     <Grid container> // level 2
     * ```
     *
     * Only consecutive grid is considered nesting. A grid container will start at
     * `0` if there are non-Grid container element above it.
     *
     * ```js
     * <Grid container> // level 0
     *   <div>
     *     <Grid container> // level 0
     * ```
     *
     * ```js
     * <Grid container> // level 0
     *   <Grid>
     *     <Grid container> // level 0
     * ```
     */
    var unstable_level: Number?

    /**
     * Defines the vertical space between the type `item` components.
     * It overrides the value of the `spacing` prop.
     */
    var rowSpacing: ResponsiveStyleValue<Any /* GridSpacing */>?

    /**
     * Defines the size of the the type `item` components.
     */
    var size: ResponsiveStyleValue<Union /* 'auto' | 'grow' | number | false */>?

    /**
     * Defines the space between the type `item` components.
     * It can only be used on a type `container` component.
     * @default 0
     */
    var spacing: Any? /* ResponsiveStyleValue<GridSpacing> | undefined */

    /**
     * Defines the `flex-wrap` style property.
     * It's applied for all screen sizes.
     * @default 'wrap'
     */
    var wrap: GridWrap?
}

/**
 *
 * Demos:
 *
 * - [Grid version 2](https://v6.mui.com/material-ui/react-grid2/)
 *
 * API:
 *
 * - [Grid2 API](https://v6.mui.com/material-ui/api/grid-2/)
 */
@JsName("default")
external val Grid2: FC<Grid2Props>

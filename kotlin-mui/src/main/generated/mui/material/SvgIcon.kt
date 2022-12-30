// Automatically generated - do not modify!

@file:JsModule("@mui/material/SvgIcon")
@file:JsNonModule

@file:Suppress(
    "VIRTUAL_MEMBER_HIDDEN",
)

package mui.material

import mui.material.styles.Theme
import mui.system.SxProps

external interface SvgIconProps :
    react.dom.svg.SVGAttributes<web.svg.SVGSVGElement>,
    react.PropsWithChildren,
    mui.system.PropsWithSx,
    mui.types.PropsWithComponent {
    /**
     * Node passed into the SVG element.
     */
    override var children: react.ReactNode?

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: SvgIconClasses?

    /**
     * The color of the component.
     * It supports both default and custom theme colors, which can be added as shown in the
     * [palette customization guide](https://mui.com/material-ui/customization/palette/#adding-new-colors).
     * You can use the `htmlColor` prop to apply a color attribute to the SVG element.
     * @default 'inherit'
     */
    var color: SvgIconColor?

    /**
     * The fontSize applied to the icon. Defaults to 24px, but can be configure to inherit font size.
     * @default 'medium'
     */
    var fontSize: SvgIconSize?

    /**
     * Applies a color attribute to the SVG element.
     */
    var htmlColor: String?

    /**
     * If `true`, the root node will inherit the custom `component`'s viewBox and the `viewBox`
     * prop will be ignored.
     * Useful when you want to reference a custom `component` and have `SvgIcon` pass that
     * `component`'s viewBox to the root node.
     * @default false
     */
    var inheritViewBox: Boolean?

    /**
     * The shape-rendering attribute. The behavior of the different options is described on the
     * [MDN Web Docs](https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/shape-rendering).
     * If you are having issues with blurry icons you should investigate this prop.
     */
    var shapeRendering: String?

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    override var sx: SxProps<Theme>?

    /**
     * Provides a human-readable title for the element that contains it.
     * https://www.w3.org/TR/SVG-access/#Equivalent
     */
    var titleAccess: String?

    /**
     * Allows you to redefine what the coordinates without units mean inside an SVG element.
     * For example, if the SVG element is 500 (width) by 200 (height),
     * and you pass viewBox="0 0 50 20",
     * this means that the coordinates inside the SVG will go from the top left corner (0,0)
     * to bottom right (50,20) and each unit will be worth 10px.
     * @default '0 0 24 24'
     */
    var viewBox: String?
}

/**
 *
 * Demos:
 *
 * - [Icons](https://mui.com/material-ui/icons/)
 * - [Material icons](https://mui.com/material-ui/material-icons/)
 *
 * API:
 *
 * - [SvgIcon API](https://mui.com/material-ui/api/svg-icon/)
 */
@JsName("default")
external val SvgIcon: react.FC<SvgIconProps>

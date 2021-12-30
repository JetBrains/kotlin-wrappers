// Automatically generated - do not modify!

@file:JsModule("@mui/material/SvgIcon")
@file:JsNonModule

@file:Suppress(
    "VIRTUAL_MEMBER_HIDDEN",
)

package mui.material

external interface SvgIconProps :
    react.dom.svg.SVGAttributes<org.w3c.dom.svg.SVGSVGElement>,
    react.PropsWithChildren {
    /**
     * Node passed into the SVG element.
     */
    override var children: react.ReactNode?

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: SvgIconClasses?

    /**
     * The color of the component. It supports those theme colors that make sense for this component.
     * You can use the `htmlColor` prop to apply a color attribute to the SVG element.
     * @default 'inherit'
     */
    var color: SvgIconColor?

    /**
     * The fontSize applied to the icon. Defaults to 24px, but can be configure to inherit font size.
     * @default 'medium'
     */
    var fontSize: mui.system.Union? /* 'inherit' | 'large' | 'medium' | 'small', SvgIconPropsSizeOverrides */

    /**
     * Applies a color attribute to the SVG element.
     */
    var htmlColor: String?

    /**
     * The shape-rendering attribute. The behavior of the different options is described on the
     * [MDN Web Docs](https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/shape-rendering).
     * If you are having issues with blurry icons you should investigate this prop.
     */
    var shapeRendering: String?

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    var sx: mui.system.SxProps<mui.system.Theme>?

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
 * - [Icons](https://mui.com/components/icons/)
 * - [Material Icons](https://mui.com/components/material-icons/)
 *
 * API:
 *
 * - [SvgIcon API](https://mui.com/api/svg-icon/)
 */
@JsName("default")
external val SvgIcon: react.FC<SvgIconProps>

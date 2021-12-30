// Automatically generated - do not modify!

@file:JsModule("@mui/material/Divider")
@file:JsNonModule

package mui.material

external interface DividerProps : react.PropsWithChildren {
    /**
     * Absolutely position the element.
     * @default false
     */
    var absolute: Boolean?

    /**
     * The content of the component.
     */
    override var children: react.ReactNode?

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: DividerClasses?

    /**
     * If `true`, a vertical divider will have the correct height when used in flex container.
     * (By default, a vertical divider will have a calculated height of `0px` if it is the child of a flex container.)
     * @default false
     */
    var flexItem: Boolean?

    /**
     * If `true`, the divider will have a lighter color.
     * @default false
     */
    var light: Boolean?

    /**
     * The component orientation.
     * @default 'horizontal'
     */
    var orientation: Orientation?

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    var sx: mui.system.SxProps<mui.system.Theme>?

    /**
     * The text alignment.
     * @default 'center'
     */
    var textAlign: mui.system.Union? /* 'center' | 'right' | 'left' */

    /**
     * The variant to use.
     * @default 'fullWidth'
     */
    var variant: mui.system.Union? /* 'fullWidth' | 'inset' | 'middle', DividerPropsVariantOverrides */
}

/**
 *
 * Demos:
 *
 * - [Dividers](https://mui.com/components/dividers/)
 * - [Lists](https://mui.com/components/lists/)
 *
 * API:
 *
 * - [Divider API](https://mui.com/api/divider/)
 */
@JsName("default")
external val Divider: react.FC<DividerProps>

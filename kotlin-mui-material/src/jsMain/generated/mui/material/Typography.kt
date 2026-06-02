// Automatically generated - do not modify!

@file:JsModule("@mui/material/Typography")

package mui.material

import mui.material.styles.Theme
import mui.system.PropsWithSx
import mui.system.SxProps
import mui.system.SystemProps
import mui.types.PropsWithComponent
import react.FC
import react.PropsWithChildren
import react.ReactNode
import react.dom.html.HTMLAttributes
import web.html.HTMLSpanElement

external interface TypographyProps :
    TypographyOwnProps,
    HTMLAttributes<HTMLSpanElement>,
    PropsWithComponent

external interface TypographyOwnProps :
    SystemProps<Theme>,
    PropsWithChildren,
    PropsWithSx {
    /**
     * Set the text-align on the component.
     * @default 'inherit'
     */
    var align: TypographyAlign?

    /**
     * The content of the component.
     */
    override var children: ReactNode?

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: TypographyClasses?

    /**
     * The color of the component.
     * It supports both default and custom theme colors, which can be added as shown in the
     * [palette customization guide](https://mui.com/material-ui/customization/palette/#custom-colors).
     */
    var color: Any? /*
  | OverridableStringUnion<
      | 'primary'
      | 'secondary'
      | 'success'
      | 'error'
      | 'info'
      | 'warning'
      | `text${Capitalize<keyof TypeText>}`,
      TypographyPropsColorOverrides
    >
  | (string & {}) */

    /**
     * If `true`, the text will have a bottom margin.
     * @default false
     */
    var gutterBottom: Boolean?

    /**
     * If `true`, the text will not wrap, but instead will truncate with a text overflow ellipsis.
     *
     * Note that text overflow can only happen with block or inline-block level elements
     * (the element needs to have a width in order to overflow).
     * @default false
     */
    var noWrap: Boolean?

    /**
     * If `true`, the element will be a paragraph element.
     * @default false
     * @deprecated Use the `component` prop instead. This prop will be removed in v7. See [Migrating from deprecated APIs](https://mui.com/material-ui/migration/migrating-from-deprecated-apis/) for more details.
     */
    var paragraph: Boolean?

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    override var sx: SxProps<Theme>?

    /**
     * Applies the theme typography styles.
     * @default 'body1'
     */
    var variant: mui.material.styles.TypographyVariant?

    /**
     * The component maps the variant prop to a range of different HTML element types.
     * For instance, subtitle1 to `<h6>`.
     * If you wish to change that mapping, you can provide your own.
     * Alternatively, you can use the `component` prop.
     * @default {
     *   h1: 'h1',
     *   h2: 'h2',
     *   h3: 'h3',
     *   h4: 'h4',
     *   h5: 'h5',
     *   h6: 'h6',
     *   subtitle1: 'h6',
     *   subtitle2: 'h6',
     *   body1: 'p',
     *   body2: 'p',
     *   inherit: 'p',
     * }
     */
    var variantMapping: Any? /* Partial<
  Record<OverridableStringUnion<Variant | 'inherit', TypographyPropsVariantOverrides>, string>
> */
}

/**
 *
 * Demos:
 *
 * - [Breadcrumbs](https://v6.mui.com/material-ui/react-breadcrumbs/)
 * - [Typography](https://v6.mui.com/material-ui/react-typography/)
 *
 * API:
 *
 * - [Typography API](https://v6.mui.com/material-ui/api/typography/)
 */
@JsName("default")
external val Typography: FC<TypographyProps>

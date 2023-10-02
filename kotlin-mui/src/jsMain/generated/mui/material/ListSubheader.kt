// Automatically generated - do not modify!

@file:JsModule("@mui/material/ListSubheader")

package mui.material

import mui.material.styles.Theme
import mui.system.SxProps

external interface ListSubheaderProps :
    ListSubheaderOwnProps,
    react.dom.html.LiHTMLAttributes<web.html.HTMLLIElement>,
    mui.types.PropsWithComponent

external interface ListSubheaderOwnProps :
    react.PropsWithChildren,
    mui.system.PropsWithSx {
    /**
     * The content of the component.
     */
    override var children: react.ReactNode?

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: ListSubheaderClasses?

    /**
     * The color of the component. It supports those theme colors that make sense for this component.
     * @default 'default'
     */
    var color: ListSubheaderColor?

    /**
     * If `true`, the List Subheader will not have gutters.
     * @default false
     */
    var disableGutters: Boolean?

    /**
     * If `true`, the List Subheader will not stick to the top during scroll.
     * @default false
     */
    var disableSticky: Boolean?

    /**
     * If `true`, the List Subheader is indented.
     * @default false
     */
    var inset: Boolean?

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    override var sx: SxProps<Theme>?
}

/**
 *
 * Demos:
 *
 * - [Lists](https://mui.com/material-ui/react-list/)
 *
 * API:
 *
 * - [ListSubheader API](https://mui.com/material-ui/api/list-subheader/)
 */
@JsName("default")
external val ListSubheader: react.FC<ListSubheaderProps>

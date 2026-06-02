// Automatically generated - do not modify!

@file:JsModule("@mui/material/ListSubheader")

package mui.material

import mui.material.styles.Theme
import mui.system.PropsWithSx
import mui.system.SxProps
import mui.types.PropsWithComponent
import react.FC
import react.PropsWithChildren
import react.ReactNode
import react.dom.html.LiHTMLAttributes
import web.html.HTMLLIElement

external interface ListSubheaderProps :
    ListSubheaderOwnProps,
    LiHTMLAttributes<HTMLLIElement>,
    PropsWithComponent

external interface ListSubheaderOwnProps :
    PropsWithChildren,
    PropsWithSx {
    /**
     * The content of the component.
     */
    override var children: ReactNode?

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
 * - [Lists](https://v6.mui.com/material-ui/react-list/)
 *
 * API:
 *
 * - [ListSubheader API](https://v6.mui.com/material-ui/api/list-subheader/)
 */
@JsName("default")
external val ListSubheader: FC<ListSubheaderProps>

// Automatically generated - do not modify!

@file:JsModule("@mui/material/Breadcrumbs")
@file:JsNonModule

package mui.material

import mui.material.styles.Theme
import mui.system.SxProps

external interface BreadcrumbsProps :
    react.dom.html.HTMLAttributes<web.html.HTMLElement>,
    react.PropsWithChildren,
    mui.system.PropsWithSx,
    mui.types.PropsWithComponent {
    /**
     * The content of the component.
     */
    override var children: react.ReactNode?

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: BreadcrumbsClasses?

    /**
     * The components used for each slot inside the Breadcumb.
     * Either a string to use a HTML element or a component.
     * @default {}
     */
    var slots: Slots?

    interface Slots {
        var CollapsedIcon: react.ElementType<*>?
    }

    /**
     * The props used for each slot inside the Breadcumb.
     * @default {}
     */
    var slotProps: SlotProps?

    interface SlotProps {
        var collapsedIcon: react.Props? /* SlotComponentProps<
  typeof SvgIcon,
  BreadcrumbsCollapsedIconSlotPropsOverrides,
  BreadcrumbsOwnerState
> */
    }

    /**
     * Override the default label for the expand button.
     *
     * For localization purposes, you can use the provided [translations](/material-ui/guides/localization/).
     * @default 'Show path'
     */
    var expandText: String?

    /**
     * If max items is exceeded, the number of items to show after the ellipsis.
     * @default 1
     */
    var itemsAfterCollapse: Number?

    /**
     * If max items is exceeded, the number of items to show before the ellipsis.
     * @default 1
     */
    var itemsBeforeCollapse: Number?

    /**
     * Specifies the maximum number of breadcrumbs to display. When there are more
     * than the maximum number, only the first `itemsBeforeCollapse` and last `itemsAfterCollapse`
     * will be shown, with an ellipsis in between.
     * @default 8
     */
    var maxItems: Number?

    /**
     * Custom separator node.
     * @default '/'
     */
    var separator: react.ReactNode?

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    override var sx: SxProps<Theme>?
}

external interface BreadcrumbsOwnerState {
    var expanded: Boolean
}

/**
 *
 * Demos:
 *
 * - [Breadcrumbs](https://mui.com/material-ui/react-breadcrumbs/)
 *
 * API:
 *
 * - [Breadcrumbs API](https://mui.com/material-ui/api/breadcrumbs/)
 */
@JsName("default")
external val Breadcrumbs: react.FC<BreadcrumbsProps>

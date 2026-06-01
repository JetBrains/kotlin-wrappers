// Automatically generated - do not modify!

@file:JsModule("@mui/material/Tabs")

package mui.material

import mui.material.styles.Theme
import mui.system.PropsWithSx
import mui.system.SxProps
import mui.types.PropsWithComponent
import react.*
import react.dom.events.SyntheticEvent
import react.dom.html.HTMLAttributes
import web.html.HTMLDivElement

external interface TabsProps :
    TabsOwnProps,
    HTMLAttributes<HTMLDivElement>,
    PropsWithComponent

external interface TabsPropsIndicatorColorOverrides

external interface TabsRootSlotPropsOverrides

external interface TabsScrollerSlotPropsOverrides

external interface TabsListSlotPropsOverrides

external interface TabsScrollbarSlotPropsOverrides

external interface TabsIndicatorSlotPropsOverrides

external interface TabsScrollButtonsSlotPropsOverrides

external interface TabsStartScrollButtonIconSlotPropsOverrides

external interface TabsEndScrollButtonIconSlotPropsOverrides

external interface TabsSlots {
    /**
     * The component used for the popper.
     * @default div
     */
    var root: ElementType<*>

    /**
     * The component used for the scroller.
     * @default div
     */
    var scroller: ElementType<*>

    /**
     * The component used for the flex container.
     * @default div
     */
    var list: ElementType<*>

    /**
     * The component used for the scroller.
     * @default ScrollbarSize
     */
    var scrollbar: ElementType<*>

    /**
     * The component used for the tab indicator.
     * @default span
     */
    var indicator: ElementType<*>

    /**
     * The component used for the scroll button.
     * @default TabScrollButton
     */
    var scrollButtons: ElementType<*>

    /**
     * The component used for the start scroll button icon.
     * @default KeyboardArrowLeft
     */
    var startScrollButtonIcon: ElementType<*>

    /**
     * The component used for the end scroll button icon.
     * @default KeyboardArrowRight
     */
    var endScrollButtonIcon: ElementType<*>
}

external interface TabsSlotsAndSlotProps : Props {
    var slots: TabsSlots?

    var slotProps: Any?
}

external interface TabsOwnerState : TabsProps {
    var vertical: Boolean

    var fixed: Boolean

    var hideScrollbar: Boolean

    var scrollableX: Boolean

    var scrollableY: Boolean

    override var centered: Boolean?

    var scrollButtonsHideMobile: Boolean
}

external interface TabsOwnProps :
    TabsSlotsAndSlotProps,
    PropsWithChildren,
    PropsWithSx {
    /**
     * Callback fired when the component mounts.
     * This is useful when you want to trigger an action programmatically.
     * It supports two actions: `updateIndicator()` and `updateScrollButtons()`
     *
     * @param {object} actions This object contains all possible actions
     * that can be triggered programmatically.
     */
    var action: Ref<TabsActions>?

    /**
     * If `true`, the scroll buttons aren't forced hidden on mobile.
     * By default the scroll buttons are hidden on mobile and takes precedence over `scrollButtons`.
     * @default false
     */
    var allowScrollButtonsMobile: Boolean?

    /**
     * The label for the Tabs as a string.
     */
    // var `aria-label`: String?

    /**
     * An id or list of ids separated by a space that label the Tabs.
     */
    // var `aria-labelledby`: String?

    /**
     * If `true`, the tabs are centered.
     * This prop is intended for large views.
     * @default false
     */
    var centered: Boolean?

    /**
     * The content of the component.
     */
    override var children: ReactNode?

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: TabsClasses?

    /**
     * Determines the color of the indicator.
     * @default 'primary'
     */
    var indicatorColor: TabsIndicatorColor?

    /**
     * Callback fired when the value changes.
     *
     * @param {React.SyntheticEvent} event The event source of the callback. **Warning**: This is a generic event not a change event.
     * @param {any} value We default to the index of the child (number)
     */
    var onChange: ((event: SyntheticEvent<*, *>, value: Any) -> Unit)?

    /**
     * The component orientation (layout flow direction).
     * @default 'horizontal'
     */
    var orientation: Orientation?

    /**
     * The component used to render the scroll buttons.
     * @deprecated use the `slots.scrollButtons` prop instead. This prop will be removed in v7. See [Migrating from deprecated APIs](https://mui.com/material-ui/migration/migrating-from-deprecated-apis/) for more details.
     * @default TabScrollButton
     */
    var ScrollButtonComponent: ElementType<*>?

    /**
     * Determine behavior of scroll buttons when tabs are set to scroll:
     *
     * - `auto` will only present them when not all the items are visible.
     * - `true` will always present them.
     * - `false` will never present them.
     *
     * By default the scroll buttons are hidden on mobile.
     * This behavior can be disabled with `allowScrollButtonsMobile`.
     * @default 'auto'
     */
    var scrollButtons: TabsScrollButtons?

    /**
     * If `true` the selected tab changes on focus. Otherwise it only
     * changes on activation.
     */
    var selectionFollowsFocus: Boolean?

    /**
     * Props applied to the tab indicator element.
     * @deprecated use the `slotProps.indicator` prop instead. This prop will be removed in v7. See [Migrating from deprecated APIs](https://mui.com/material-ui/migration/migrating-from-deprecated-apis/) for more details.
     * @default  {}
     */
    var TabIndicatorProps: Props? /* React.HTMLAttributes<HTMLDivElement> & { sx?: SxProps<Theme>; } */

    /**
     * Props applied to the [`TabScrollButton`](https://mui.com/material-ui/api/tab-scroll-button/) element.
     * @deprecated use the `slotProps.scrollButtons` prop instead. This prop will be removed in v7. See [Migrating from deprecated APIs](https://mui.com/material-ui/migration/migrating-from-deprecated-apis/) for more details.
     * @default {}
     */
    var TabScrollButtonProps: TabScrollButtonProps?

    /**
     * Determines the color of the `Tab`.
     * @default 'primary'
     */
    var textColor: TabsTextColor?

    /**
     * The value of the currently selected `Tab`.
     * If you don't want any selected `Tab`, you can set this prop to `false`.
     */
    var value: Any?

    /**
     *  Determines additional display behavior of the tabs:
     *
     *  - `scrollable` will invoke scrolling properties and allow for horizontally
     *  scrolling (or swiping) of the tab bar.
     *  - `fullWidth` will make the tabs grow to use all the available space,
     *  which should be used for small views, like on mobile.
     *  - `standard` will render the default state.
     * @default 'standard'
     */
    var variant: TabsVariant?

    /**
     * If `true`, the scrollbar is visible. It can be useful when displaying
     * a long vertical list of tabs.
     * @default false
     */
    var visibleScrollbar: Boolean?

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    override var sx: SxProps<Theme>?
}

external interface TabsActions {
    fun updateIndicator()
    fun updateScrollButtons()
}

/**
 *
 * Demos:
 *
 * - [Tabs](https://v6.mui.com/material-ui/react-tabs/)
 *
 * API:
 *
 * - [Tabs API](https://v6.mui.com/material-ui/api/tabs/)
 */
@JsName("default")
external val Tabs: FC<TabsProps>

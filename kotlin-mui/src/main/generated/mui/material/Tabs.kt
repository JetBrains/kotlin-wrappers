// Automatically generated - do not modify!

@file:JsModule("@mui/material/Tabs")
@file:JsNonModule

package mui.material

external interface TabsProps :
    react.PropsWithChildren,
    mui.types.PropsWithComponent {
    /**
     * Callback fired when the component mounts.
     * This is useful when you want to trigger an action programmatically.
     * It supports two actions: `updateIndicator()` and `updateScrollButtons()`
     *
     * @param {object} actions This object contains all possible actions
     * that can be triggered programmatically.
     */
    var action: react.Ref<dynamic>?

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
    override var children: react.ReactNode?

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
    var onChange: ((event: react.dom.events.SyntheticEvent<*, *>, value: dynamic) -> Unit)?

    /**
     * The component orientation (layout flow direction).
     * @default 'horizontal'
     */
    var orientation: mui.material.Orientation?

    /**
     * The component used to render the scroll buttons.
     * @default TabScrollButton
     */
    var ScrollButtonComponent: react.ElementType<*>?

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
     * @default  {}
     */
    var TabIndicatorProps: react.dom.html.HTMLAttributes<org.w3c.dom.HTMLDivElement>?

    /**
     * Props applied to the [`TabScrollButton`](/api/tab-scroll-button/) element.
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
     *  -`fullWidth` will make the tabs grow to use all the available space,
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
    var sx: mui.system.SxProps<mui.system.Theme>?
}

/**
 *
 * Demos:
 *
 * - [Tabs](https://mui.com/components/tabs/)
 *
 * API:
 *
 * - [Tabs API](https://mui.com/api/tabs/)
 */
@JsName("default")
external val Tabs: react.FC<TabsProps>

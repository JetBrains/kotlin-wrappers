// Automatically generated - do not modify!

package mui.base

import react.Props
import react.Ref
import react.RefCallback
import react.StateSetter
import react.dom.events.MouseEventHandler
import react.dom.events.SyntheticEvent
import web.dom.Element
import web.dom.ElementId

external interface UseTabParameters {
    /**
     * The value of the tab.
     * It's used to associate the tab with a tab panel(s) with the same value.
     * If the value is not provided, it falls back to the position index.
     */
    var value: Any? /* number | string */

    /**
     * Callback invoked when new value is being set.
     */
    var onChange: ((event: SyntheticEvent<*, *>, value: Any /* Number | String */) -> Unit)?

    /**
     * Callback fired when the tab is clicked.
     */
    var onClick: MouseEventHandler<*>?

    /**
     * If `true`, the tab will be disabled.
     */
    var disabled: Boolean?

    /**
     * The id of the tab.
     * If not provided, it will be automatically generated.
     */
    var id: ElementId?

    /**
     * Ref to the root slot's DOM element.
     */
    var rootRef: Ref<Element>?
}

external interface UseTabReturnValue {
    /**
     * Resolver for the root slot's props.
     * @param externalProps props for the root slot
     * @returns props that should be spread on the root slot
     */
    var getRootProps: (externalProps: Props?) -> Props

    /**
     * If `true`, the tab is active (as in `:active` pseudo-class; in other words, pressed).
     */
    var active: Boolean

    /**
     * If `true`, the tab has visible focus.
     * This is a workaround for browsers that do not support this feature natively.
     */
    var focusVisible: Boolean

    /**
     * If `true`, the tab is highlighted.
     */
    var highlighted: Boolean

    /**
     * 0-based index of the tab in the list of tabs.
     */
    var index: Number

    /**
     * Ref to the root slot's DOM element.
     */
    var rootRef: RefCallback<Element>?

    /**
     * If `true`, the tab is selected.
     */
    var selected: Boolean

    /**
     * Sets the focus-visible state of the tab.
     * This is a workaround for browsers that do not support this feature natively.
     */
    var setFocusVisible: StateSetter<Boolean>

    /**
     * Total number of tabs in the nearest parent TabsList.
     * This can be used to determine if the tab is the last one to style it accordingly.
     */
    var totalTabsCount: Number
}

// Automatically generated - do not modify!

package mui.base

import js.array.ReadonlyArray
import web.html.HTMLElement

external interface ListState<ItemValue> {
    /**
     * The item that is currently highlighted.
     */
    var highlightedValue: ItemValue?

    /**
     * The item(s) that are currently selected.
     */
    var selectedValues: ReadonlyArray<ItemValue>
}

external interface UseListParameters<ItemValue, State, CustomAction, CustomActionContext> {
    /**
     * The externally controlled values (highlighted and selected item(s)) of the list.
     * If a custom state is used, this object can contain the added state fields as well.
     *
     * @default {}
     */
    var controlledProps: react.Props? /* Partial<State> */

    /**
     * If `true`, it will be possible to highlight disabled items.
     * @default false
     */
    var disabledItemsFocusable: Boolean?

    /**
     * If `true`, the highlight will not wrap around the list if arrow keys are used.
     * @default false
     */
    var disableListWrap: Boolean?

    /**
     * The focus management strategy used by the list.
     * Controls the attributes used to set focus on the list items.
     * @default 'activeDescendant'
     */
    var focusManagement: FocusManagementType?

    /**
     * A function that returns the DOM element associated with an item.
     * This is required when using the `DOM` focus management.
     *
     * @param item List item to get the DOM element for.
     */
    var getItemDomElement: ((itemValue: ItemValue) -> HTMLElement)?

    /**
     * A function that returns the id of an item.
     * This is required when using the `activeDescendant` focus management.
     *
     * @param itemValue List item to get the id for.
     */
    var getItemId: ((itemValue: ItemValue) -> String?)?

    /**
     * A function that intializes the state of the list.
     * It is required when using a custom state with mandatory fields.
     * If not provided, the state will be initialized with the default values (nothing highlighted or selected).
     *
     * @returns The initial state of the list.
     */
    var getInitialState: (() -> State)?

    /**
     * A function that determines if a particular item is disabled.
     * @default () => false
     */
    var isItemDisabled: ((itemValue: ItemValue, index: Number) -> Boolean)?

    /**
     * Ref to the list root DOM element.
     */
    var rootRef: react.Ref<web.dom.Element>?

    /**
     * Callback fired when the selected value changes.
     * This is a strongly typed convenience event that can be used instead of `onStateChange`.
     */
    var onChange: ((event: react.dom.events.SyntheticEvent<*, *>?, value: ReadonlyArray<ItemValue>, reason: String) -> Unit)?

    /**
     * Callback fired when the highlighted option changes.
     * This is a strongly typed convenience event that can be used instead of `onStateChange`.
     */
    var onHighlightChange: ((event: react.dom.events.SyntheticEvent<*, *>?, option: ItemValue?, reason: String) -> Unit)?

    /**
     * Callback fired when the items change.
     *
     * @param items The new items collection
     */
    var onItemsChange: ((items: ReadonlyArray<ItemValue>) -> Unit)?

    /**
     * Callback fired when the any of the state items change.
     * Note that in case of `selectedValues` and `highlightedValue` the strongly typed
     * `onChange` and `onHighlightChange` callbacks are also fired.
     */
    var onStateChange: Any? /* StateChangeCallback<State> */

    /**
     * The number of items skip when using the page up and page down keys.
     *
     * @default 5
     */
    var pageSize: Number?

    /**
     * A function that tests equality between two items' values.
     * @default (a, b) => a === b
     */
    var itemComparer: ((itemValue1: ItemValue, itemValue2: ItemValue) -> Boolean)?

    /**
     * A function that converts an object to its string representation
     * @default (o) => o
     */
    var getItemAsString: ((option: ItemValue) -> String?)?

    /**
     * Array of list items.
     */
    var items: ReadonlyArray<ItemValue>

    /**
     * Additional data to be passed to all the reducer actions.
     * It will be available in the `context` property of the action when dispatched.
     */
    var reducerActionContext: CustomActionContext?

    /**
     * Orientation of the items in the list.
     * Determines the actions that are performed when arrow keys are pressed.
     */
    var orientation: mui.system.Union? /* 'horizontal-ltr' | 'horizontal-rtl' | 'vertical' */

    /**
     * Controls how many items can be selected at once: none (the selection functionality is disabled in this case), one, or indefinitely many.
     * @default 'single'
     */
    var selectionMode: mui.system.Union? /* 'none' | 'single' | 'multiple' */

    /**
     * Custom state reducer function. It calculates the new state (highlighted and selected items + optional custom state)
     * based on the previous one and the performed action.
     */
    var stateReducer: Any? /* (state: State, action: ActionWithContext<ListAction<ItemValue> | CustomAction, ListActionContext<ItemValue> & CustomActionContext>) => State */

    /**
     * The name of the component using useList.
     * For debugging purposes.
     * @default 'useList'
     */
    var componentName: String?
}

external interface ListItemState {
    /**
     * Determines if the item is focusable (its focus is managed by the DOM).
     */
    var focusable: Boolean

    /**
     * If `true` the item is highlighted.
     */
    var highlighted: Boolean

    /**
     * If `true` the item is selected.
     */
    var selected: Boolean
}

external interface UseListReturnValue {
    var contextValue: dynamic

    var dispatch: (action: Any /* CustomAction | ListAction<ItemValue> */) -> Unit

    /**
     * Resolver for the root slot's props.
     * @param externalProps additional props for the root slot
     * @returns props that should be spread on the root slot
     */
    var getRootProps: react.Props /* <ExternalProps extends Record<string, unknown> = {}>(externalProps?: ExternalProps) => UseListRootSlotProps<ExternalProps> */

    var rootRef: react.RefCallback<web.dom.Element>?

    var state: dynamic
}

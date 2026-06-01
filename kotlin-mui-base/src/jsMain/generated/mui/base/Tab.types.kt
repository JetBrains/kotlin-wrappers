// Automatically generated - do not modify!

package mui.base

import react.ElementType
import react.Props
import react.dom.events.SyntheticEvent
import react.dom.html.ButtonHTMLAttributes
import web.html.HTMLButtonElement

external interface TabProps :
    TabOwnProps,
    ButtonHTMLAttributes<HTMLButtonElement>

external interface TabRootSlotPropsOverrides

external interface TabOwnProps :
    ButtonOwnProps,
    ButtonHTMLAttributes<HTMLButtonElement> {
    /**
     * You can provide your own value. Otherwise, it falls back to the child position index.
     */
    override var value: Any? /* number | string */

    /**
     * Callback invoked when new value is being set.
     */
    var onChange: ((event: SyntheticEvent<*, *>, value: Any /* Number | String */) -> Unit)?

    /**
     * The props used for each slot inside the Tab.
     * @default {}
     */
    override var slotProps: ButtonOwnProps.SlotProps?

    interface SlotProps {
        var root: Props? /* SlotComponentProps<'button', TabRootSlotPropsOverrides, TabOwnerState> */
    }

    /**
     * The components used for each slot inside the Tab.
     * Either a string to use a HTML element or a component.
     * @default {}
     */
    override var slots: ButtonSlots? /* TabSlots? */
}

external interface TabSlots {
    /**
     * The component that renders the root.
     * @default 'button'
     */
    var root: ElementType<*>?
}

// Automatically generated - do not modify!

package mui.base

import web.dom.Element
import web.dom.ElementId

external interface SelectOption<Value> {
    var value: Value

    var label: react.ReactNode

    var disabled: Boolean?

    var id: ElementId?
}

external interface UseOptionParameters<Value> {
    var disabled: Boolean

    var id: ElementId?

    var label: react.ReactNode

    var rootRef: react.Ref<Element>?

    var value: Value
}

external interface UseOptionReturnValue {
    /**
     * If `true`, the option is selected.
     */
    var selected: Boolean

    /**
     * If `true`, the option is highlighted.
     */
    var highlighted: Boolean

    var index: Number

    /**
     * Resolver for the root slot's props.
     * @param externalProps props for the root slot
     * @returns props that should be spread on the root slot
     */
    var getRootProps: react.Props /* <ExternalProps extends Record<string, unknown>>(externalProps?: ExternalProps) => UseOptionRootSlotProps<ExternalProps> */

    /**
     * Ref to the root slot DOM node.
     */
    var rootRef: react.RefCallback<Element>?
}

// Automatically generated - do not modify!

package mui.base

import react.Props
import react.ReactNode
import react.Ref
import react.RefCallback
import web.dom.Element
import web.dom.ElementId

external interface SelectOption<Value> {
    var value: Value

    var label: ReactNode

    var disabled: Boolean?

    var id: ElementId?
}

external interface UseOptionParameters<Value> {
    var disabled: Boolean

    var id: ElementId?

    var label: ReactNode

    var rootRef: Ref<Element>?

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
    var getRootProps: (externalProps: Props?) -> Props

    /**
     * Ref to the root slot DOM node.
     */
    var rootRef: RefCallback<Element>?
}

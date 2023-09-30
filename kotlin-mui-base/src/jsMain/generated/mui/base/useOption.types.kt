// Automatically generated - do not modify!

package mui.base

external interface SelectOption<Value> {
    var value: Value

    var label: react.ReactNode

    var disabled: Boolean?

    var id: String?
}

external interface UseOptionParameters<Value> {
    var disabled: Boolean

    var label: react.ReactNode

    var value: Value

    var rootRef: react.Ref<web.dom.Element>?

    var id: String?
}

external interface UseOptionReturnValue {
    var selected: Boolean

    var highlighted: Boolean

    var index: Number

    var getRootProps: react.Props /* <Other extends EventHandlers>(otherHandlers?: Other) => UseOptionRootSlotProps<Other> */

    var rootRef: react.RefCallback<web.dom.Element>?
}

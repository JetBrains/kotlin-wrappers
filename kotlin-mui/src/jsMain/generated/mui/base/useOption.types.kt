// Automatically generated - do not modify!

package mui.base

external interface SelectOption<TValue> {
    var value: Any

    var label: react.ReactNode

    var disabled: Boolean?

    var id: String?
}

external interface UseOptionParameters {
    var disabled: Boolean

    var label: react.ReactNode

    var value: Any

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

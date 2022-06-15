// Automatically generated - do not modify!

package mui.base

external interface MenuItemMetadata {
    var id: String

    var disabled: Boolean

    var label: String?
}

external interface MenuItemState {
    var disabled: Boolean

    var highlighted: Boolean
}

external interface UseMenuParameters {
    var open: Boolean?

    var onClose: (() -> Unit)?

    var listboxId: String?

    var listboxRef: react.Ref<*>?
}

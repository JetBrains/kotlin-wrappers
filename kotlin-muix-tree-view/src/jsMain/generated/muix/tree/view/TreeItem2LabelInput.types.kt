// Automatically generated - do not modify!

package muix.tree.view

external interface TreeItem2LabelInputProps : react.Props {
    var value: String?

    /**
     * Used to determine if the target of keydown or blur events is the input and prevent the event from propagating to the root.
     */
    // var `data-element`: mui.system.Union? /* 'labelInput' */

    var onChange: react.dom.events.ChangeEventHandler<web.html.HTMLInputElement>?

    var onKeyDown: react.dom.events.KeyboardEventHandler<web.html.HTMLInputElement>?

    var onBlur: react.dom.events.FocusEventHandler<web.html.HTMLInputElement>?

    var autoFocus: Boolean? /* true */

    var type: mui.system.Union? /* 'text' */
}

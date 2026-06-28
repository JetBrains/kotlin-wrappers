// Automatically generated - do not modify!

package muix.tree.view

import mui.system.Union
import react.Props
import react.dom.events.ChangeEventHandler
import react.dom.events.FocusEventHandler
import react.dom.events.KeyboardEventHandler
import web.html.HTMLInputElement

external interface TreeItem2LabelInputProps : Props {
    var value: String?

    /**
     * Used to determine if the target of keydown or blur events is the input and prevent the event from propagating to the root.
     */
    // var `data-element`: Union? /* 'labelInput' */

    var onChange: ChangeEventHandler<HTMLInputElement, *>?

    var onKeyDown: KeyboardEventHandler<HTMLInputElement>?

    var onBlur: FocusEventHandler<HTMLInputElement>?

    var autoFocus: Boolean? /* true */

    var type: Union? /* 'text' */
}

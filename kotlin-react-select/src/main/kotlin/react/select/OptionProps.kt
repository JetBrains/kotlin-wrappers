package react.select

import dom.html.HTMLDivElement
import react.PropsWithChildren
import react.RefCallback
import react.dom.html.HTMLAttributes

external interface OptionProps<Option, Group : GroupBase<Option>> : PropsWithChildren {
    /** Reference to the internal element, consumed by the MenuPlacer component */
    var innerRef: RefCallback<HTMLDivElement>
    var innerProps: HTMLAttributes<HTMLDivElement>?
    var label: String

    /** Type is used by the menu to determine whether this is an option or a group.
    In the case of option this is always `option`. **/
    var type: String
    var data: Option
    var isDisabled: Boolean
    var isFocused: Boolean
    var isSelected: Boolean
}

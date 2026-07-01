// Automatically generated - do not modify!

package muix.pickers

import js.array.ReadonlyArray
import mui.system.Union
import react.ElementType
import react.Props
import react.Ref
import react.dom.html.HTMLAttributes
import web.html.HTMLSpanElement

external interface PickersSectionListProps :
    ExportedPickersSectionListProps {
    /**
     * Overridable component slots.
     */
    var slots: PickersSectionListSlots?

    /**
     * The props used for each component slot.
     */
    var slotProps: PickersSectionListSlotProps?

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: PickersSectionListClasses?
}

external interface PickersSectionListSlots {
    var root: ElementType<*>

    var section: ElementType<*>

    var sectionSeparator: ElementType<*>

    var sectionContent: ElementType<*>
}

external interface PickerSectionSeparatorOwnerState : PickerOwnerState {
    /**
     * The position of the separator.
     * `before` if the separator is rendered before the section content.
     * `after` if the separator is rendered after the section content.
     */
    var separatorPosition: Union /* 'before' | 'after' */
}

external interface PickersSectionListSlotProps : Props {
    var root: Props?

    var section: Props?

    var sectionSeparator: Props?

    var sectionContent: Props?
}

external interface PickersSectionElement {
    var container: HTMLAttributes<HTMLSpanElement>

    var content: HTMLAttributes<HTMLSpanElement>

    var before: HTMLAttributes<HTMLSpanElement>

    var after: HTMLAttributes<HTMLSpanElement>
}

external interface PickersSectionListRef

external interface ExportedPickersSectionListProps : Props {
    /**
     * The elements to render.
     * Each element contains the prop to edit a section of the value.
     */
    var elements: ReadonlyArray<PickersSectionElement>

    var sectionListRef: Ref<PickersSectionListRef>

    /**
     * If true, the whole element is editable.
     * Useful when all the sections are selected.
     */
    var contentEditable: Boolean
}

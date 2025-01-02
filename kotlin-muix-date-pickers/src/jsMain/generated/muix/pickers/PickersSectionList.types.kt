// Automatically generated - do not modify!

package muix.pickers

import web.dom.Element
import web.html.HTMLElement

external interface PickersSectionListProps : react.Props {
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
    var root: react.ElementType<*>

    var section: react.ElementType<*>

    var sectionSeparator: react.ElementType<*>

    var sectionContent: react.ElementType<*>
}

external interface PickersSectionListSlotProps : react.Props {
    var root: react.Props?

    var section: react.Props?

    var sectionSeparator: react.Props?

    var sectionContent: react.Props?
}

external interface PickersSectionElement {
    var container: dynamic

    var content: dynamic

    var before: dynamic

    var after: dynamic
}

external interface PickersSectionListRef {
    var getRoot: () -> HTMLElement

    var getSectionContainer: (sectionIndex: Number) -> HTMLElement

    var getSectionContent: (sectionIndex: Number) -> HTMLElement

    var getSectionIndexFromDOMElement: (element: Element?) -> Number?
}

external interface ExportedPickersSectionListProps : react.Props {
    /**
     * The elements to render.
     * Each element contains the prop to edit a section of the value.
     */
    var elements: dynamic

    var sectionListRef: react.Ref<dynamic>

    /**
     * If true, the whole element is editable.
     * Useful when all the sections are selected.
     */
    var contentEditable: Boolean
}

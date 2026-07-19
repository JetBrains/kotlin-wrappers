// Automatically generated - do not modify!

package web.aria

import js.array.ReadonlyArray
import js.internal.InternalApi
import web.dom.Element

/* mixin */
@SubclassOptInRequired(InternalApi::class)
external interface ARIAMixin {
    /**
     * The **`ariaActiveDescendantElement`** property of the Element interface represents the current active element when focus is on a composite widget, combobox, textbox, group, or application.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaActiveDescendantElement)
     */
    var ariaActiveDescendantElement: Element?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * The **`ariaAtomic`** property of the Element interface reflects the value of the aria-atomic attribute, which indicates whether assistive technologies will present all, or only parts of, the changed region based on the change notifications defined by the aria-relevant attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaAtomic)
     */
    var ariaAtomic: String?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * The **`ariaAutoComplete`** property of the Element interface reflects the value of the aria-autocomplete attribute, which indicates whether inputting text could trigger display of one or more predictions of the user's intended value for a combobox, searchbox, or textbox and specifies how predictions would be presented if they were made.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaAutoComplete)
     */
    var ariaAutoComplete: String?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * The **`ariaBrailleLabel`** property of the Element interface reflects the value of the aria-braillelabel attribute, which defines the ARIA braille label of the element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaBrailleLabel)
     */
    var ariaBrailleLabel: String?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * The **`ariaBrailleRoleDescription`** property of the Element interface reflects the value of the aria-brailleroledescription attribute, which defines the ARIA braille role description of the element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaBrailleRoleDescription)
     */
    var ariaBrailleRoleDescription: String?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * The **`ariaBusy`** property of the Element interface reflects the value of the aria-busy attribute, which indicates whether an element is being modified, as assistive technologies may want to wait until the modifications are complete before exposing them to the user.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaBusy)
     */
    var ariaBusy: String?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * The **`ariaChecked`** property of the Element interface reflects the value of the aria-checked attribute, which indicates the current "checked" state of checkboxes, radio buttons, and other widgets that have a checked state.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaChecked)
     */
    var ariaChecked: String?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * The **`ariaColCount`** property of the Element interface reflects the value of the aria-colcount attribute, which defines the number of columns in a table, grid, or treegrid.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaColCount)
     */
    var ariaColCount: String?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * The **`ariaColIndex`** property of the Element interface reflects the value of the aria-colindex attribute, which defines an element's column index or position with respect to the total number of columns within a table, grid, or treegrid.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaColIndex)
     */
    var ariaColIndex: String?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * The **`ariaColIndexText`** property of the Element interface reflects the value of the aria-colindextext attribute, which defines a human readable text alternative of aria-colindex.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaColIndexText)
     */
    var ariaColIndexText: String?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * The **`ariaColSpan`** property of the Element interface reflects the value of the aria-colspan attribute, which defines the number of columns spanned by a cell or gridcell within a table, grid, or treegrid.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaColSpan)
     */
    var ariaColSpan: String?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * The **`ariaControlsElements`** property of the Element interface is an array containing the elements that are controlled by the element it is applied to. For example, this might be set on a combobox to indicate the element that it pops up, or on a scrollbar to indicate the ID of the element it controls.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaControlsElements)
     */
    var ariaControlsElements: ReadonlyArray<Element>?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * The **`ariaCurrent`** property of the Element interface reflects the value of the aria-current attribute, which indicates the element that represents the current item within a container or set of related elements.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaCurrent)
     */
    var ariaCurrent: String?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * The **`ariaDescribedByElements`** property of the Element interface is an array containing the element (or elements) that provide an accessible description for the element it is applied to. The accessible description is similar to the accessible label (see ariaLabelledByElements), but provides more verbose information.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaDescribedByElements)
     */
    var ariaDescribedByElements: ReadonlyArray<Element>?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * The **`ariaDescription`** property of the Element interface reflects the value of the aria-description attribute, which defines a string value that describes or annotates the current element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaDescription)
     */
    var ariaDescription: String?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * The **`ariaDetailsElements`** property of the Element interface is an array containing the element (or elements) that provide an accessible details for the element it is applied to. The accessible details are similar to the accessible description (see ariaDescribedByElements), but provides more verbose information.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaDetailsElements)
     */
    var ariaDetailsElements: ReadonlyArray<Element>?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * The **`ariaDisabled`** property of the Element interface reflects the value of the aria-disabled attribute, which indicates that the element is perceivable but disabled, so it is not editable or otherwise operable.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaDisabled)
     */
    var ariaDisabled: String?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * The **`ariaErrorMessageElements`** property of the Element interface is an array containing the element (or elements) that provide an error message for the element it is applied to.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaErrorMessageElements)
     */
    var ariaErrorMessageElements: ReadonlyArray<Element>?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * The **`ariaExpanded`** property of the Element interface reflects the value of the aria-expanded attribute, which indicates whether a grouping element owned or controlled by this element is expanded or collapsed.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaExpanded)
     */
    var ariaExpanded: String?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * The **`ariaFlowToElements`** property of the Element interface is an array containing the element (or elements) that provide an alternate reading order of content, overriding the general default reading order at the user's discretion. If just one element is provided this is the next element in the reading order. If multiple elements are provided, then each element represents a possible path that should be offered to the user for selection.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaFlowToElements)
     */
    var ariaFlowToElements: ReadonlyArray<Element>?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * The **`ariaHasPopup`** property of the Element interface reflects the value of the aria-haspopup attribute, which indicates the availability and type of interactive popup element, such as menu or dialog, that can be triggered by an element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaHasPopup)
     */
    var ariaHasPopup: String?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * The **`ariaHidden`** property of the Element interface reflects the value of the aria-hidden) attribute, which indicates whether the element is exposed to an accessibility API.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaHidden)
     */
    var ariaHidden: String?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * The **`ariaInvalid`** property of the Element interface reflects the value of the aria-invalid attribute. Relevant for the application, checkbox, combobox, gridcell, listbox, radiogroup, slider, spinbutton, textbox, and tree roles, it indicates to the accessibility API whether the entered value does not conform to the format expected by the application.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaInvalid)
     */
    var ariaInvalid: String?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * The **`ariaKeyShortcuts`** property of the Element interface reflects the value of the aria-keyshortcuts attribute, which indicates keyboard shortcuts that an author has implemented to activate or give focus to an element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaKeyShortcuts)
     */
    var ariaKeyShortcuts: String?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * The **`ariaLabel`** property of the Element interface reflects the value of the aria-label attribute, which defines a string value that labels the current element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaLabel)
     */
    var ariaLabel: String?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * The **`ariaLabelledByElements`** property of the Element interface is an array containing the element (or elements) that provide an accessible name for the element it is applied to.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaLabelledByElements)
     */
    var ariaLabelledByElements: ReadonlyArray<Element>?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * The **`ariaLevel`** property of the Element interface reflects the value of the aria-level attribute, which defines the hierarchical level of an element within a structure.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaLevel)
     */
    var ariaLevel: String?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * The **`ariaLive`** property of the Element interface reflects the value of the aria-live attribute, which indicates that an element will be updated, and describes the types of updates the user agents, assistive technologies, and user can expect from the live region.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaLive)
     */
    var ariaLive: String?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * The **`ariaModal`** property of the Element interface reflects the value of the aria-modal attribute, which indicates whether an element is modal when displayed. Applying the aria-modal property to an element with role="dialog" replaces the technique of using aria-hidden on the background for informing assistive technologies that content outside a dialog is inert.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaModal)
     */
    var ariaModal: String?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * The **`ariaMultiLine`** property of the Element interface reflects the value of the aria-multiline attribute, which indicates whether a text box accepts multiple lines of input or only a single line.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaMultiLine)
     */
    var ariaMultiLine: String?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * The **`ariaMultiSelectable`** property of the Element interface reflects the value of the aria-multiselectable attribute, which indicates that the user may select more than one item from the current selectable descendants.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaMultiSelectable)
     */
    var ariaMultiSelectable: String?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * The **`ariaOrientation`** property of the Element interface reflects the value of the aria-orientation attribute, which indicates whether the element's orientation is horizontal, vertical, or unknown/ambiguous.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaOrientation)
     */
    var ariaOrientation: String?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * The **`ariaOwnsElements`** property of the Element interface is an array containing the element (or elements) that define a visual, functional, or contextual relationship between a parent element that it is applied to, and its child elements. This is used when the DOM hierarchy cannot be used to represent the relationship, and it would not otherwise be available to assistive technology,
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaOwnsElements)
     */
    var ariaOwnsElements: ReadonlyArray<Element>?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * The **`ariaPlaceholder`** property of the Element interface reflects the value of the aria-placeholder attribute, which defines a short hint intended to aid the user with data entry when the control has no value.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaPlaceholder)
     */
    var ariaPlaceholder: String?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * The **`ariaPosInSet`** property of the Element interface reflects the value of the aria-posinset attribute, which defines an element's number or position in the current set of listitems or treeitems.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaPosInSet)
     */
    var ariaPosInSet: String?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * The **`ariaPressed`** property of the Element interface reflects the value of the aria-pressed attribute, which indicates the current "pressed" state of toggle buttons.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaPressed)
     */
    var ariaPressed: String?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * The **`ariaReadOnly`** property of the Element interface reflects the value of the aria-readonly attribute, which indicates that the element is not editable, but is otherwise operable.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaReadOnly)
     */
    var ariaReadOnly: String?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * The **`ariaRelevant`** property of the Element interface reflects the value of the aria-relevant attribute, which indicates what notifications the user agent will trigger when the accessibility tree within a live region is modified. This is used to describe what changes in an aria-live region are relevant and should be announced.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaRelevant)
     */
    var ariaRelevant: String?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * The **`ariaRequired`** property of the Element interface reflects the value of the aria-required attribute, which indicates that user input is required on the element before a form may be submitted.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaRequired)
     */
    var ariaRequired: String?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * The **`ariaRoleDescription`** property of the Element interface reflects the value of the aria-roledescription attribute, which defines a human-readable, author-localized description for the role of an element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaRoleDescription)
     */
    var ariaRoleDescription: String?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * The **`ariaRowCount`** property of the Element interface reflects the value of the aria-rowcount attribute, which defines the total number of rows in a table, grid, or treegrid.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaRowCount)
     */
    var ariaRowCount: String?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * The **`ariaRowIndex`** property of the Element interface reflects the value of the aria-rowindex attribute, which defines an element's row index or position with respect to the total number of rows within a table, grid, or treegrid.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaRowIndex)
     */
    var ariaRowIndex: String?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * The **`ariaRowIndexText`** property of the Element interface reflects the value of the aria-rowindextext attribute, which defines a human readable text alternative of aria-rowindex.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaRowIndexText)
     */
    var ariaRowIndexText: String?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * The **`ariaRowSpan`** property of the Element interface reflects the value of the aria-rowspan attribute, which defines the number of rows spanned by a cell or gridcell within a table, grid, or treegrid.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaRowSpan)
     */
    var ariaRowSpan: String?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * The **`ariaSelected`** property of the Element interface reflects the value of the aria-selected attribute, which indicates the current "selected" state of elements that have a selected state.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaSelected)
     */
    var ariaSelected: String?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * The **`ariaSetSize`** property of the Element interface reflects the value of the aria-setsize attribute, which defines the number of items in the current set of listitems or treeitems.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaSetSize)
     */
    var ariaSetSize: String?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * The **`ariaSort`** property of the Element interface reflects the value of the aria-sort attribute, which indicates if items in a table or grid are sorted in ascending or descending order.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaSort)
     */
    var ariaSort: String?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * The **`ariaValueMax`** property of the Element interface reflects the value of the aria-valuemax attribute, which defines the maximum allowed value for a range widget.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaValueMax)
     */
    var ariaValueMax: String?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * The **`ariaValueMin`** property of the Element interface reflects the value of the aria-valuemin attribute, which defines the minimum allowed value for a range widget.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaValueMin)
     */
    var ariaValueMin: String?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * The **`ariaValueNow`** property of the Element interface reflects the value of the aria-valuenow attribute, which defines the current value for a range widget.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaValueNow)
     */
    var ariaValueNow: String?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * The **`ariaValueText`** property of the Element interface reflects the value of the aria-valuetext attribute, which defines the human-readable text alternative of aria-valuenow for a range widget.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaValueText)
     */
    var ariaValueText: String?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * The **`role`** property of the Element interface returns the explicitly set WAI-ARIA role for the element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/role)
     */
    var role: String?
        get() = definedExternally
        set(value) = definedExternally
}

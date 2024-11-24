// Automatically generated - do not modify!

package react.dom.aria

external interface AriaAttributes {
    /** Identifies the currently active element when DOM focus is on a composite widget, textbox, group, or application. */
    @JsName("aria-activedescendant")
    var ariaActiveDescendant: String?

    /** Indicates whether assistive technologies will present all, or only parts of, the changed region based on the change notifications defined by the aria-relevant attribute. */
    @JsName("aria-atomic")
    var ariaAtomic: Boolean?

    /**
     * Indicates whether inputting text could trigger display of one or more predictions of the user's intended value for an input and specifies how predictions would be
     * presented if they are made.
     */
    @JsName("aria-autocomplete")
    var ariaAutoComplete: AriaAutoComplete?
    /** Indicates an element is being modified and that assistive technologies MAY want to wait until the modifications are complete before exposing them to the user. */
    /**
     * Defines a string value that labels the current element, which is intended to be converted into Braille.
     * @see aria-label.
     */
    @JsName("aria-braillelabel")
    var ariaBrailleLabel: String?

    /**
     * Defines a human-readable, author-localized abbreviated description for the role of an element, which is intended to be converted into Braille.
     * @see aria-roledescription.
     */
    @JsName("aria-brailleroledescription")
    var ariaBrailleRoleDescription: String?

    @JsName("aria-busy")
    var ariaBusy: Boolean?

    /**
     * Indicates the current "checked" state of checkboxes, radio buttons, and other widgets.
     * @see aria-pressed @see aria-selected.
     */
    @JsName("aria-checked")
    var ariaChecked: AriaChecked?

    /**
     * Defines the total number of columns in a table, grid, or treegrid.
     * @see aria-colindex.
     */
    @JsName("aria-colcount")
    var ariaColCount: Int?

    /**
     * Defines an element's column index or position with respect to the total number of columns within a table, grid, or treegrid.
     * @see aria-colcount @see aria-colspan.
     */
    @JsName("aria-colindex")
    var ariaColIndex: Int?

    /**
     * Defines a human readable text alternative of aria-colindex.
     * @see aria-rowindextext.
     */
    @JsName("aria-colindextext")
    var ariaColIndexText: String?

    /**
     * Defines the number of columns spanned by a cell or gridcell within a table, grid, or treegrid.
     * @see aria-colindex @see aria-rowspan.
     */
    @JsName("aria-colspan")
    var ariaColSpan: Int?

    /**
     * Identifies the element (or elements) whose contents or presence are controlled by the current element.
     * @see aria-owns.
     */
    @JsName("aria-controls")
    var ariaControls: String?

    /** Indicates the element that represents the current item within a container or set of related elements. */
    @JsName("aria-current")
    var ariaCurrent: AriaCurrent?

    /**
     * Identifies the element (or elements) that describes the object.
     * @see aria-labelledby
     */
    @JsName("aria-describedby")
    var ariaDescribedBy: String?

    /**
     * Defines a string value that describes or annotates the current element.
     * @see related aria-describedby.
     */
    @JsName("aria-description")
    var ariaDescription: String?

    /**
     * Identifies the element that provides a detailed, extended description for the object.
     * @see aria-describedby.
     */
    @JsName("aria-details")
    var ariaDetails: String?

    /**
     * Indicates that the element is perceivable but disabled, so it is not editable or otherwise operable.
     * @see aria-hidden @see aria-readonly.
     */
    @JsName("aria-disabled")
    var ariaDisabled: Boolean?

    /**
     * Indicates what functions can be performed when a dragged object is released on the drop target.
     * @deprecated in ARIA 1.1
     */
    @JsName("aria-dropeffect")
    var ariaDropEffect: AriaDropEffect?

    /**
     * Identifies the element that provides an error message for the object.
     * @see aria-invalid @see aria-describedby.
     */
    @JsName("aria-errormessage")
    var ariaErrorMessage: String?

    /** Indicates whether the element, or another grouping element it controls, is currently expanded or collapsed. */
    @JsName("aria-expanded")
    var ariaExpanded: Boolean?

    /**
     * Identifies the next element (or elements) in an alternate reading order of content which, at the user's discretion,
     * allows assistive technology to override the general default of reading in document source order.
     */
    @JsName("aria-flowto")
    var ariaFlowTo: String?

    /**
     * Indicates an element's "grabbed" state in a drag-and-drop operation.
     * @deprecated in ARIA 1.1
     */
    @JsName("aria-grabbed")
    var ariaGrabbed: Boolean?

    /** Indicates the availability and type of interactive popup element, such as menu or dialog, that can be triggered by an element. */
    @JsName("aria-haspopup")
    var ariaHasPopup: AriaHasPopup?

    /**
     * Indicates whether the element is exposed to an accessibility API.
     * @see aria-disabled.
     */
    @JsName("aria-hidden")
    var ariaHidden: Boolean?

    /**
     * Indicates the entered value does not conform to the format expected by the application.
     * @see aria-errormessage.
     */
    @JsName("aria-invalid")
    var ariaInvalid: AriaInvalid?

    /** Indicates keyboard shortcuts that an author has implemented to activate or give focus to an element. */
    @JsName("aria-keyshortcuts")
    var ariaKeyShortcuts: String?

    /**
     * Defines a string value that labels the current element.
     * @see aria-labelledby.
     */
    @JsName("aria-label")
    var ariaLabel: String?

    /**
     * Identifies the element (or elements) that labels the current element.
     * @see aria-describedby.
     */
    @JsName("aria-labelledby")
    var ariaLabelledBy: String?

    /** Defines the hierarchical level of an element within a structure. */
    @JsName("aria-level")
    var ariaLevel: Int?

    /** Indicates that an element will be updated, and describes the types of updates the user agents, assistive technologies, and user can expect from the live region. */
    @JsName("aria-live")
    var ariaLive: AriaLive?

    /** Indicates whether an element is modal when displayed. */
    @JsName("aria-modal")
    var ariaModal: Boolean?

    /** Indicates whether a text box accepts multiple lines of input or only a single line. */
    @JsName("aria-multiline")
    var ariaMultiline: Boolean?

    /** Indicates that the user may select more than one item from the current selectable descendants. */
    @JsName("aria-multiselectable")
    var ariaMultiSelectable: Boolean?

    /** Indicates whether the element's orientation is horizontal, vertical, or unknown/ambiguous. */
    @JsName("aria-orientation")
    var ariaOrientation: AriaOrientation?

    /**
     * Identifies an element (or elements) in order to define a visual, functional, or contextual parent/child relationship
     * between DOM elements where the DOM hierarchy cannot be used to represent the relationship.
     * @see aria-controls.
     */
    @JsName("aria-owns")
    var ariaOwns: String?

    /**
     * Defines a short hint (a word or short phrase) intended to aid the user with data entry when the control has no value.
     * A hint could be a sample value or a brief description of the expected format.
     */
    @JsName("aria-placeholder")
    var ariaPlaceholder: String?

    /**
     * Defines an element's number or position in the current set of listitems or treeitems. Not required if all elements in the set are present in the DOM.
     * @see aria-setsize.
     */
    @JsName("aria-posinset")
    var ariaPosInSet: Int?

    /**
     * Indicates the current "pressed" state of toggle buttons.
     * @see aria-checked @see aria-selected.
     */
    @JsName("aria-pressed")
    var ariaPressed: AriaPressed?

    /**
     * Indicates that the element is not editable, but is otherwise operable.
     * @see aria-disabled.
     */
    @JsName("aria-readonly")
    var ariaReadOnly: Boolean?

    /**
     * Indicates what notifications the user agent will trigger when the accessibility tree within a live region is modified.
     * @see aria-atomic.
     */
    @JsName("aria-relevant")
    var ariaRelevant: AriaRelevant?

    /** Indicates that user input is required on the element before a form may be submitted. */
    @JsName("aria-required")
    var ariaRequired: Boolean?

    /** Defines a human-readable, author-localized description for the role of an element. */
    @JsName("aria-roledescription")
    var ariaRoleDescription: String?

    /**
     * Defines the total number of rows in a table, grid, or treegrid.
     * @see aria-rowindex.
     */
    @JsName("aria-rowcount")
    var ariaRowCount: Int?

    /**
     * Defines an element's row index or position with respect to the total number of rows within a table, grid, or treegrid.
     * @see aria-rowcount @see aria-rowspan.
     */
    @JsName("aria-rowindex")
    var ariaRowIndex: Int?

    /**
     * Defines a human readable text alternative of aria-rowindex.
     * @see aria-colindextext.
     */
    @JsName("aria-rowindextext")
    var ariaRowIndexText: String?

    /**
     * Defines the number of rows spanned by a cell or gridcell within a table, grid, or treegrid.
     * @see aria-rowindex @see aria-colspan.
     */
    @JsName("aria-rowspan")
    var ariaRowSpan: Int?

    /**
     * Indicates the current "selected" state of various widgets.
     * @see aria-checked @see aria-pressed.
     */
    @JsName("aria-selected")
    var ariaSelected: Boolean?

    /**
     * Defines the number of items in the current set of listitems or treeitems. Not required if all elements in the set are present in the DOM.
     * @see aria-posinset.
     */
    @JsName("aria-setsize")
    var ariaSetSize: Int?

    /** Indicates if items in a table or grid are sorted in ascending or descending order. */
    @JsName("aria-sort")
    var ariaSort: AriaSort?

    /** Defines the maximum allowed value for a range widget. */
    @JsName("aria-valuemax")
    var ariaValueMax: Double?

    /** Defines the minimum allowed value for a range widget. */
    @JsName("aria-valuemin")
    var ariaValueMin: Double?

    /**
     * Defines the current value for a range widget.
     * @see aria-valuetext.
     */
    @JsName("aria-valuenow")
    var ariaValueNow: Double?

    /** Defines the human readable text alternative of aria-valuenow for a range widget. */
    @JsName("aria-valuetext")
    var ariaValueText: String?
}

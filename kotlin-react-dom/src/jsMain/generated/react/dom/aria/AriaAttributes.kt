// Automatically generated - do not modify!

package react.dom.aria

external interface AriaAttributes

/** Identifies the currently active element when DOM focus is on a composite widget, textbox, group, or application. */
inline var AriaAttributes.ariaActiveDescendant: String
    get() = asDynamic()["aria-activedescendant"]
    set(value) {
        asDynamic()["aria-activedescendant"] = value
    }

/** Indicates whether assistive technologies will present all, or only parts of, the changed region based on the change notifications defined by the aria-relevant attribute. */
inline var AriaAttributes.ariaAtomic: Boolean
    get() = asDynamic()["aria-atomic"]
    set(value) {
        asDynamic()["aria-atomic"] = value
    }

/**
 * Indicates whether inputting text could trigger display of one or more predictions of the user's intended value for an input and specifies how predictions would be
 * presented if they are made.
 */
inline var AriaAttributes.ariaAutoComplete: AriaAutoComplete
    get() = asDynamic()["aria-autocomplete"]
    set(value) {
        asDynamic()["aria-autocomplete"] = value
    }

/** Indicates an element is being modified and that assistive technologies MAY want to wait until the modifications are complete before exposing them to the user. */
/**
 * Defines a string value that labels the current element, which is intended to be converted into Braille.
 * @see aria-label.
 */
inline var AriaAttributes.ariaBrailleLabel: String
    get() = asDynamic()["aria-braillelabel"]
    set(value) {
        asDynamic()["aria-braillelabel"] = value
    }

/**
 * Defines a human-readable, author-localized abbreviated description for the role of an element, which is intended to be converted into Braille.
 * @see aria-roledescription.
 */
inline var AriaAttributes.ariaBrailleRoleDescription: String
    get() = asDynamic()["aria-brailleroledescription"]
    set(value) {
        asDynamic()["aria-brailleroledescription"] = value
    }

inline var AriaAttributes.ariaBusy: Boolean
    get() = asDynamic()["aria-busy"]
    set(value) {
        asDynamic()["aria-busy"] = value
    }

/**
 * Indicates the current "checked" state of checkboxes, radio buttons, and other widgets.
 * @see aria-pressed @see aria-selected.
 */
inline var AriaAttributes.ariaChecked: AriaChecked
    get() = asDynamic()["aria-checked"]
    set(value) {
        asDynamic()["aria-checked"] = value
    }

/**
 * Defines the total number of columns in a table, grid, or treegrid.
 * @see aria-colindex.
 */
inline var AriaAttributes.ariaColCount: Int
    get() = asDynamic()["aria-colcount"]
    set(value) {
        asDynamic()["aria-colcount"] = value
    }

/**
 * Defines an element's column index or position with respect to the total number of columns within a table, grid, or treegrid.
 * @see aria-colcount @see aria-colspan.
 */
inline var AriaAttributes.ariaColIndex: Int
    get() = asDynamic()["aria-colindex"]
    set(value) {
        asDynamic()["aria-colindex"] = value
    }

/**
 * Defines a human readable text alternative of aria-colindex.
 * @see aria-rowindextext.
 */
inline var AriaAttributes.ariaColIndexText: String
    get() = asDynamic()["aria-colindextext"]
    set(value) {
        asDynamic()["aria-colindextext"] = value
    }

/**
 * Defines the number of columns spanned by a cell or gridcell within a table, grid, or treegrid.
 * @see aria-colindex @see aria-rowspan.
 */
inline var AriaAttributes.ariaColSpan: Int
    get() = asDynamic()["aria-colspan"]
    set(value) {
        asDynamic()["aria-colspan"] = value
    }

/**
 * Identifies the element (or elements) whose contents or presence are controlled by the current element.
 * @see aria-owns.
 */
inline var AriaAttributes.ariaControls: String
    get() = asDynamic()["aria-controls"]
    set(value) {
        asDynamic()["aria-controls"] = value
    }

/** Indicates the element that represents the current item within a container or set of related elements. */
inline var AriaAttributes.ariaCurrent: AriaCurrent
    get() = asDynamic()["aria-current"]
    set(value) {
        asDynamic()["aria-current"] = value
    }

/**
 * Identifies the element (or elements) that describes the object.
 * @see aria-labelledby
 */
inline var AriaAttributes.ariaDescribedBy: String
    get() = asDynamic()["aria-describedby"]
    set(value) {
        asDynamic()["aria-describedby"] = value
    }

/**
 * Defines a string value that describes or annotates the current element.
 * @see related aria-describedby.
 */
inline var AriaAttributes.ariaDescription: String
    get() = asDynamic()["aria-description"]
    set(value) {
        asDynamic()["aria-description"] = value
    }

/**
 * Identifies the element that provides a detailed, extended description for the object.
 * @see aria-describedby.
 */
inline var AriaAttributes.ariaDetails: String
    get() = asDynamic()["aria-details"]
    set(value) {
        asDynamic()["aria-details"] = value
    }

/**
 * Indicates that the element is perceivable but disabled, so it is not editable or otherwise operable.
 * @see aria-hidden @see aria-readonly.
 */
inline var AriaAttributes.ariaDisabled: Boolean
    get() = asDynamic()["aria-disabled"]
    set(value) {
        asDynamic()["aria-disabled"] = value
    }

/**
 * Indicates what functions can be performed when a dragged object is released on the drop target.
 * @deprecated in ARIA 1.1
 */
inline var AriaAttributes.ariaDropEffect: AriaDropEffect
    get() = asDynamic()["aria-dropeffect"]
    set(value) {
        asDynamic()["aria-dropeffect"] = value
    }

/**
 * Identifies the element that provides an error message for the object.
 * @see aria-invalid @see aria-describedby.
 */
inline var AriaAttributes.ariaErrorMessage: String
    get() = asDynamic()["aria-errormessage"]
    set(value) {
        asDynamic()["aria-errormessage"] = value
    }

/** Indicates whether the element, or another grouping element it controls, is currently expanded or collapsed. */
inline var AriaAttributes.ariaExpanded: Boolean
    get() = asDynamic()["aria-expanded"]
    set(value) {
        asDynamic()["aria-expanded"] = value
    }

/**
 * Identifies the next element (or elements) in an alternate reading order of content which, at the user's discretion,
 * allows assistive technology to override the general default of reading in document source order.
 */
inline var AriaAttributes.ariaFlowTo: String
    get() = asDynamic()["aria-flowto"]
    set(value) {
        asDynamic()["aria-flowto"] = value
    }

/**
 * Indicates an element's "grabbed" state in a drag-and-drop operation.
 * @deprecated in ARIA 1.1
 */
inline var AriaAttributes.ariaGrabbed: Boolean
    get() = asDynamic()["aria-grabbed"]
    set(value) {
        asDynamic()["aria-grabbed"] = value
    }

/** Indicates the availability and type of interactive popup element, such as menu or dialog, that can be triggered by an element. */
inline var AriaAttributes.ariaHasPopup: AriaHasPopup
    get() = asDynamic()["aria-haspopup"]
    set(value) {
        asDynamic()["aria-haspopup"] = value
    }

/**
 * Indicates whether the element is exposed to an accessibility API.
 * @see aria-disabled.
 */
inline var AriaAttributes.ariaHidden: Boolean
    get() = asDynamic()["aria-hidden"]
    set(value) {
        asDynamic()["aria-hidden"] = value
    }

/**
 * Indicates the entered value does not conform to the format expected by the application.
 * @see aria-errormessage.
 */
inline var AriaAttributes.ariaInvalid: AriaInvalid
    get() = asDynamic()["aria-invalid"]
    set(value) {
        asDynamic()["aria-invalid"] = value
    }

/** Indicates keyboard shortcuts that an author has implemented to activate or give focus to an element. */
inline var AriaAttributes.ariaKeyShortcuts: String
    get() = asDynamic()["aria-keyshortcuts"]
    set(value) {
        asDynamic()["aria-keyshortcuts"] = value
    }

/**
 * Defines a string value that labels the current element.
 * @see aria-labelledby.
 */
inline var AriaAttributes.ariaLabel: String
    get() = asDynamic()["aria-label"]
    set(value) {
        asDynamic()["aria-label"] = value
    }

/**
 * Identifies the element (or elements) that labels the current element.
 * @see aria-describedby.
 */
inline var AriaAttributes.ariaLabelledBy: String
    get() = asDynamic()["aria-labelledby"]
    set(value) {
        asDynamic()["aria-labelledby"] = value
    }

/** Defines the hierarchical level of an element within a structure. */
inline var AriaAttributes.ariaLevel: Int
    get() = asDynamic()["aria-level"]
    set(value) {
        asDynamic()["aria-level"] = value
    }

/** Indicates that an element will be updated, and describes the types of updates the user agents, assistive technologies, and user can expect from the live region. */
inline var AriaAttributes.ariaLive: AriaLive
    get() = asDynamic()["aria-live"]
    set(value) {
        asDynamic()["aria-live"] = value
    }

/** Indicates whether an element is modal when displayed. */
inline var AriaAttributes.ariaModal: Boolean
    get() = asDynamic()["aria-modal"]
    set(value) {
        asDynamic()["aria-modal"] = value
    }

/** Indicates whether a text box accepts multiple lines of input or only a single line. */
inline var AriaAttributes.ariaMultiline: Boolean
    get() = asDynamic()["aria-multiline"]
    set(value) {
        asDynamic()["aria-multiline"] = value
    }

/** Indicates that the user may select more than one item from the current selectable descendants. */
inline var AriaAttributes.ariaMultiSelectable: Boolean
    get() = asDynamic()["aria-multiselectable"]
    set(value) {
        asDynamic()["aria-multiselectable"] = value
    }

/** Indicates whether the element's orientation is horizontal, vertical, or unknown/ambiguous. */
inline var AriaAttributes.ariaOrientation: AriaOrientation
    get() = asDynamic()["aria-orientation"]
    set(value) {
        asDynamic()["aria-orientation"] = value
    }

/**
 * Identifies an element (or elements) in order to define a visual, functional, or contextual parent/child relationship
 * between DOM elements where the DOM hierarchy cannot be used to represent the relationship.
 * @see aria-controls.
 */
inline var AriaAttributes.ariaOwns: String
    get() = asDynamic()["aria-owns"]
    set(value) {
        asDynamic()["aria-owns"] = value
    }

/**
 * Defines a short hint (a word or short phrase) intended to aid the user with data entry when the control has no value.
 * A hint could be a sample value or a brief description of the expected format.
 */
inline var AriaAttributes.ariaPlaceholder: String
    get() = asDynamic()["aria-placeholder"]
    set(value) {
        asDynamic()["aria-placeholder"] = value
    }

/**
 * Defines an element's number or position in the current set of listitems or treeitems. Not required if all elements in the set are present in the DOM.
 * @see aria-setsize.
 */
inline var AriaAttributes.ariaPosInSet: Int
    get() = asDynamic()["aria-posinset"]
    set(value) {
        asDynamic()["aria-posinset"] = value
    }

/**
 * Indicates the current "pressed" state of toggle buttons.
 * @see aria-checked @see aria-selected.
 */
inline var AriaAttributes.ariaPressed: AriaPressed
    get() = asDynamic()["aria-pressed"]
    set(value) {
        asDynamic()["aria-pressed"] = value
    }

/**
 * Indicates that the element is not editable, but is otherwise operable.
 * @see aria-disabled.
 */
inline var AriaAttributes.ariaReadOnly: Boolean
    get() = asDynamic()["aria-readonly"]
    set(value) {
        asDynamic()["aria-readonly"] = value
    }

/**
 * Indicates what notifications the user agent will trigger when the accessibility tree within a live region is modified.
 * @see aria-atomic.
 */
inline var AriaAttributes.ariaRelevant: AriaRelevant
    get() = asDynamic()["aria-relevant"]
    set(value) {
        asDynamic()["aria-relevant"] = value
    }

/** Indicates that user input is required on the element before a form may be submitted. */
inline var AriaAttributes.ariaRequired: Boolean
    get() = asDynamic()["aria-required"]
    set(value) {
        asDynamic()["aria-required"] = value
    }

/** Defines a human-readable, author-localized description for the role of an element. */
inline var AriaAttributes.ariaRoleDescription: String
    get() = asDynamic()["aria-roledescription"]
    set(value) {
        asDynamic()["aria-roledescription"] = value
    }

/**
 * Defines the total number of rows in a table, grid, or treegrid.
 * @see aria-rowindex.
 */
inline var AriaAttributes.ariaRowCount: Int
    get() = asDynamic()["aria-rowcount"]
    set(value) {
        asDynamic()["aria-rowcount"] = value
    }

/**
 * Defines an element's row index or position with respect to the total number of rows within a table, grid, or treegrid.
 * @see aria-rowcount @see aria-rowspan.
 */
inline var AriaAttributes.ariaRowIndex: Int
    get() = asDynamic()["aria-rowindex"]
    set(value) {
        asDynamic()["aria-rowindex"] = value
    }

/**
 * Defines a human readable text alternative of aria-rowindex.
 * @see aria-colindextext.
 */
inline var AriaAttributes.ariaRowIndexText: String
    get() = asDynamic()["aria-rowindextext"]
    set(value) {
        asDynamic()["aria-rowindextext"] = value
    }

/**
 * Defines the number of rows spanned by a cell or gridcell within a table, grid, or treegrid.
 * @see aria-rowindex @see aria-colspan.
 */
inline var AriaAttributes.ariaRowSpan: Int
    get() = asDynamic()["aria-rowspan"]
    set(value) {
        asDynamic()["aria-rowspan"] = value
    }

/**
 * Indicates the current "selected" state of various widgets.
 * @see aria-checked @see aria-pressed.
 */
inline var AriaAttributes.ariaSelected: Boolean
    get() = asDynamic()["aria-selected"]
    set(value) {
        asDynamic()["aria-selected"] = value
    }

/**
 * Defines the number of items in the current set of listitems or treeitems. Not required if all elements in the set are present in the DOM.
 * @see aria-posinset.
 */
inline var AriaAttributes.ariaSetSize: Int
    get() = asDynamic()["aria-setsize"]
    set(value) {
        asDynamic()["aria-setsize"] = value
    }

/** Indicates if items in a table or grid are sorted in ascending or descending order. */
inline var AriaAttributes.ariaSort: AriaSort
    get() = asDynamic()["aria-sort"]
    set(value) {
        asDynamic()["aria-sort"] = value
    }

/** Defines the maximum allowed value for a range widget. */
inline var AriaAttributes.ariaValueMax: Double
    get() = asDynamic()["aria-valuemax"]
    set(value) {
        asDynamic()["aria-valuemax"] = value
    }

/** Defines the minimum allowed value for a range widget. */
inline var AriaAttributes.ariaValueMin: Double
    get() = asDynamic()["aria-valuemin"]
    set(value) {
        asDynamic()["aria-valuemin"] = value
    }

/**
 * Defines the current value for a range widget.
 * @see aria-valuetext.
 */
inline var AriaAttributes.ariaValueNow: Double
    get() = asDynamic()["aria-valuenow"]
    set(value) {
        asDynamic()["aria-valuenow"] = value
    }

/** Defines the human readable text alternative of aria-valuenow for a range widget. */
inline var AriaAttributes.ariaValueText: String
    get() = asDynamic()["aria-valuetext"]
    set(value) {
        asDynamic()["aria-valuetext"] = value
    }

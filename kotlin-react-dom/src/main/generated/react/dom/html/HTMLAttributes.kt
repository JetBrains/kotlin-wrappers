// Automatically generated - do not modify!

package react.dom.html

import org.w3c.dom.Element

external interface HTMLAttributes<T : Element> : AriaAttributes, DOMAttributes<T> {
    // React-specific Attributes
    var defaultChecked: Boolean?
    var defaultValue: String?
    var suppressContentEditableWarning: Boolean?
    var suppressHydrationWarning: Boolean?

    // Standard HTML Attributes
    var accessKey: String?
    var contentEditable: dynamic // Booleanish | "inherit"
    var contextMenu: String?
    var dir: String?
    var draggable: Boolean?
    var hidden: Boolean?
    var id: String?
    var lang: String?
    var placeholder: String?
    var slot: String?
    var spellCheck: Boolean?
    var style: react.CSSProperties?
    var tabIndex: Int?
    var title: String?
    var translate: Translate?

    // Unknown
    var radioGroup: String? // <command>, <menuitem>

    // WAI-ARIA
    var role: AriaRole?

    // RDFa Attributes
    var about: String?
    var datatype: String?
    var inlist: Any?
    var prefix: String?
    var property: String?
    var resource: String?
    var `typeof`: String?
    var vocab: String?

    // Non-standard Attributes
    var autoCapitalize: String?
    var autoCorrect: String?
    var autoSave: String?
    var color: String?
    var itemProp: String?
    var itemScope: Boolean?
    var itemType: String?
    var itemID: String?
    var itemRef: String?
    var results: String?
    var security: String?
    var unselectable: Unselectable?
// Living Standard
    /**
     * Hints at the type of data that might be entered by the user while editing the element or its contents
     * @see https://html.spec.whatwg.org/multipage/interaction.html#input-modalities:-the-inputmode-attribute
     */
    var inputMode: InputMode?

    /**
     * Specify that a standard HTML element should behave like a defined custom built-in element
     * @see https://html.spec.whatwg.org/multipage/custom-elements.html#attr-is
     */
    var `is`: String?
}

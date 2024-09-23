// Automatically generated - do not modify!

package react.dom.html

import react.dom.DOMAttributes
import react.dom.aria.AriaAttributes
import react.dom.aria.AriaRole
import web.dom.Element
import web.html.EnterKeyHint
import web.html.InputMode

external interface HTMLAttributes<T : Element> :
    AriaAttributes,
    DOMAttributes<T>,
    react.PropsWithStyle {
    // React-specific Attributes
    var defaultChecked: Boolean?
    var defaultValue: Any? // string | number | readonly string[]
    var suppressContentEditableWarning: Boolean?
    var suppressHydrationWarning: Boolean?

    // Standard HTML Attributes
    var accessKey: String?
    var autoFocus: Boolean?
    var contentEditable: Any? // Booleanish | "inherit" | "plaintext-only"
    var contextMenu: String?
    var dir: String?
    var draggable: Boolean?
    var enterKeyHint: EnterKeyHint?
    var hidden: Boolean?
    var id: String?
    var lang: String?
    var nonce: String?
    var slot: String?
    var spellCheck: Boolean?
    override var style: react.CSSProperties?
    var tabIndex: Int?
    var title: String?
    var translate: Translate?

    // Unknown
    var radioGroup: String? // <command>, <menuitem>

    // WAI-ARIA
    var role: AriaRole?

    // RDFa Attributes
    var about: String?
    var content: String?
    var datatype: String?
    var inlist: Any?
    var prefix: String?
    var property: String?
    var rel: String?
    var resource: String?
    var rev: String?
    var `typeof`: String?
    var vocab: String?

    // Non-standard Attributes
    var autoCapitalize: String?
    var autoCorrect: String?
    var autoSave: String?
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
     * @see {@link https://html.spec.whatwg.org/multipage/interaction.html#input-modalities:-the-inputmode-attribute}
     */
    var inputMode: InputMode?

    /**
     * Specify that a standard HTML element should behave like a defined custom built-in element
     * @see {@link https://html.spec.whatwg.org/multipage/custom-elements.html#attr-is}
     */
    var `is`: String?
}

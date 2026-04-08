// Automatically generated - do not modify!

package web.html

import web.command.CommandEvent
import web.components.ElementInternals
import web.cssom.ElementCSSInlineStyle
import web.dom.Element
import web.dom.GlobalEventHandlers
import web.dom.HTMLOrSVGElement
import web.dom.Node
import web.editcontext.EditContext
import web.events.Event
import web.events.EventInstance
import web.experimental.ExperimentalWebApi
import web.focus.FocusEvent
import web.popover.Popover
import web.popover.ShowPopoverOptions
import web.popover.ToggleEvent
import web.popover.TogglePopoverOptions
import kotlin.js.definedExternally

/**
 * The **`HTMLElement`** interface represents any HTML element. Some elements directly implement this interface, while others implement it via an interface that inherits it.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement)
 */
open external class HTMLElement
protected constructor() :
    Element,
    ElementCSSInlineStyle,
    ElementContentEditable,
    GlobalEventHandlers,
    HTMLOrSVGElement {
    /**
     * The **`HTMLElement.accessKey`** property sets the keystroke which a user can press to jump to a given element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/accessKey)
     */
    var accessKey: String

    /**
     * The **`HTMLElement.accessKeyLabel`** read-only property returns a string containing the element's browser-assigned access key (if any); otherwise it returns an empty string.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/accessKeyLabel)
     */
    val accessKeyLabel: String

    /**
     * The **`autocapitalize`** property of the HTMLElement interface represents the element's capitalization behavior for user input. It is available on all HTML elements, though it doesn't affect all of them, including:
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/autocapitalize)
     */
    var autocapitalize: AutoCapitalize

    /**
     * The **`autocorrect`** property of the HTMLElement interface controls whether or not autocorrection of editable text is enabled for spelling and/or punctuation errors.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/autocorrect)
     */
    var autocorrect: Boolean

    /**
     * The **`HTMLElement.dir`** property indicates the text writing directionality of the content of the current element. It reflects the element's dir attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/dir)
     */
    var dir: String

    /**
     * The **`draggable`** property of the HTMLElement interface gets and sets a Boolean primitive indicating if the element is draggable.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/draggable)
     */
    var draggable: Boolean

    /**
     * The HTMLElement property **`hidden`** reflects the value of the element's hidden attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/hidden)
     */
    var hidden: Hidden

    /**
     * The HTMLElement property **`inert`** reflects the value of the element's inert attribute. It is a boolean value that, when present, makes the browser "ignore" user input events for the element, including focus events and events from assistive technologies. The browser may also ignore page search and text selection in the element. This can be useful when building UIs such as modals where you would want to "trap" the focus inside the modal when it's visible.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/inert)
     */
    var inert: Boolean

    /**
     * The **`innerText`** property of the HTMLElement interface represents the rendered text content of a node and its descendants.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/innerText)
     */
    var innerText: String

    /**
     * The **`lang`** property of the HTMLElement interface indicates the base language of an element's attribute values and text content, in the form of a BCP 47 language tag. It reflects the element's lang attribute; the xml:lang attribute does not affect this property.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/lang)
     */
    var lang: String

    /**
     * The **`offsetHeight`** read-only property of the HTMLElement interface returns the height of an element, including vertical padding and borders, as an integer.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/offsetHeight)
     */
    val offsetHeight: Int

    /**
     * The **`offsetLeft`** read-only property of the HTMLElement interface returns the number of pixels that the upper left corner of the current element is offset to the left within the HTMLElement.offsetParent node.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/offsetLeft)
     */
    val offsetLeft: Int

    /**
     * The **`HTMLElement.offsetParent`** read-only property returns a reference to the element which is the closest (nearest in the containment hierarchy) positioned ancestor element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/offsetParent)
     */
    val offsetParent: Element?

    /**
     * The **`offsetTop`** read-only property of the HTMLElement interface returns the distance from the outer border of the current element (including its margin) to the top padding edge of the offsetParent, the closest positioned ancestor element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/offsetTop)
     */
    val offsetTop: Int

    /**
     * The **`offsetWidth`** read-only property of the HTMLElement interface returns the layout width of an element as an integer.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/offsetWidth)
     */
    val offsetWidth: Int

    /**
     * The **`outerText`** property of the HTMLElement interface returns the same value as HTMLElement.innerText. When used as a setter it replaces the whole current node with the given text (this differs from innerText, which replaces the content inside the current node).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/outerText)
     */
    var outerText: String

    /**
     * The **`popover`** property of the HTMLElement interface gets and sets an element's popover state via JavaScript ("auto", "hint", or "manual"), and can be used for feature detection.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/popover)
     */
    var popover: Popover?

    /**
     * The **`spellcheck`** property of the HTMLElement interface represents a boolean value that controls the spell-checking hint. It is available on all HTML elements, though it doesn't affect all of them.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/spellcheck)
     */
    var spellcheck: Boolean

    /**
     * The **`HTMLElement.title`** property represents the title of the element: the text usually displayed in a 'tooltip' popup when the mouse is over the node.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/title)
     */
    var title: String

    /**
     * The **`translate`** property of the HTMLElement interface indicates whether an element's attribute values and the values of its Text node children are to be translated when the page is localized, or whether to leave them unchanged.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/translate)
     */
    var translate: Boolean

    /**
     * The **`writingSuggestions`** property of the HTMLElement interface is a string indicating if browser-provided writing suggestions should be enabled under the scope of the element or not.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/writingSuggestions)
     */
    var writingSuggestions: String

    /**
     * The **`HTMLElement.attachInternals()`** method returns an ElementInternals object. This method allows a custom element to participate in HTML forms. The ElementInternals interface provides utilities for working with these elements in the same way you would work with any standard HTML form element, and also exposes the Accessibility Object Model to the element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/attachInternals)
     */
    fun attachInternals(): ElementInternals

    /**
     * The **`HTMLElement.click()`** method simulates a mouse click on an element. When called on an element, the element's click event is fired (unless its disabled attribute is set).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/click)
     */
    fun click()

    /**
     * The **`hidePopover()`** method of the HTMLElement interface hides a popover element (i.e., one that has a valid popover attribute) by removing it from the top layer and styling it with display: none.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/hidePopover)
     */
    fun hidePopover()

    /**
     * The **`showPopover()`** method of the HTMLElement interface shows a popover element (i.e., one that has a valid popover attribute) by adding it to the top layer.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/showPopover)
     */
    fun showPopover(options: ShowPopoverOptions = definedExternally)

    /**
     * The **`togglePopover()`** method of the HTMLElement interface toggles a popover element (i.e., one that has a valid popover attribute) between the hidden and showing states.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/togglePopover)
     */
    fun togglePopover(options: TogglePopoverOptions = definedExternally): Boolean
    fun togglePopover(options: Boolean): Boolean

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/editContext)
     */
    @ExperimentalWebApi
    var editContext: EditContext?
}

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/beforematch_event)
 */
inline val <C : HTMLElement> C.beforeMatchEvent: EventInstance<Event, C, Node>
    get() = EventInstance(this, "beforematch")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/beforetoggle_event)
 */
inline val <C : HTMLElement> C.beforeToggleEvent: EventInstance<ToggleEvent, C, C>
    get() = EventInstance(this, "beforetoggle")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/blur_event)
 */
inline val <C : HTMLElement> C.blurEvent: EventInstance<FocusEvent, C, C>
    get() = EventInstance(this, "blur")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/command_event)
 */
inline val <C : HTMLElement> C.commandEvent: EventInstance<CommandEvent, C, C>
    get() = EventInstance(this, "command")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/error_event)
 */
inline val <C : HTMLElement> C.errorEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, "error")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/focus_event)
 */
inline val <C : HTMLElement> C.focusEvent: EventInstance<FocusEvent, C, C>
    get() = EventInstance(this, "focus")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/load_event)
 */
inline val <C : HTMLElement> C.loadEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, "load")

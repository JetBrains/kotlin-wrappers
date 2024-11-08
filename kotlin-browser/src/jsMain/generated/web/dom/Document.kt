// Automatically generated - do not modify!

package web.dom

import js.core.Void
import js.promise.Promise
import seskar.js.JsAsync
import web.animations.AnimationEvent
import web.animations.DocumentTimeline
import web.clipboard.ClipboardEvent
import web.cssom.TransitionEvent
import web.dom.*
import web.events.Event
import web.events.EventHandler
import web.events.EventInstance
import web.events.JsEvent
import web.fonts.FontFaceSource
import web.form.FormDataEvent
import web.form.SubmitEvent
import web.html.*
import web.location.Location
import web.mathml.MATHML_NAMESPACE
import web.mathml.MathMLElement
import web.mathml.MathMLTagName
import web.pip.PictureInPictureEvent
import web.ranges.Range
import web.selection.Selection
import web.svg.SVGElement
import web.svg.SVG_NAMESPACE
import web.svg.SvgTagName
import web.uievents.*
import web.url.FragmentDirective
import web.url.URL
import web.viewtransition.ViewTransition
import web.viewtransition.ViewTransitionUpdateCallback
import web.window.*
import web.xpath.XPathEvaluatorBase

/**
 * Any web page loaded in the browser and serves as an entry point into the web page's content, which is the DOM tree.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document)
 */
open external class Document :
    Node,
    DocumentOrShadowRoot,
    FontFaceSource,
    GlobalEventHandlers,
    NonElementParentNode,
    ParentNode,
    XPathEvaluatorBase {
    /**
     * Sets or gets the URL for the current document.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/URL)
     */
    val URL: String

    /**
     * Specifies the beginning and end of the document body.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/body)
     */
    var body: HTMLElement

    /**
     * Returns document's encoding.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/characterSet)
     */
    val characterSet: String

    /**
     * Gets a value that indicates whether standards-compliant mode is switched on for the object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/compatMode)
     */
    val compatMode: String

    /**
     * Returns document's content type.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/contentType)
     */
    val contentType: String

    /**
     * Returns the HTTP cookies that apply to the Document. If there are no cookies or cookies can't be applied to this resource, the empty string will be returned.
     *
     * Can be set, to add a new cookie to the element's set of HTTP cookies.
     *
     * If the contents are sandboxed into a unique origin (e.g. in an iframe with the sandbox attribute), a "SecurityError" DOMException will be thrown on getting and setting.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/cookie)
     */
    var cookie: String

    /**
     * Returns the script element, or the SVG script element, that is currently executing, as long as the element represents a classic script. In the case of reentrant script execution, returns the one that most recently started executing amongst those that have not yet finished executing.
     *
     * Returns null if the Document is not currently executing a script or SVG script element (e.g., because the running script is an event handler, or a timeout), or if the currently executing script or SVG script element represents a module script.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/currentScript)
     */
    val currentScript: HTMLOrSVGScriptElement?

    /**
     * Returns the Window object of the active document.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/defaultView)
     */
    val defaultView: WindowProxy?

    /**
     * Sets or gets a value that indicates whether the document can be edited.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/designMode)
     */
    var designMode: String

    /**
     * Sets or retrieves a value that indicates the reading order of the object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/dir)
     */
    var dir: String

    /**
     * Gets an object representing the document type declaration associated with the current document.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/doctype)
     */
    val doctype: DocumentType?

    /**
     * Gets a reference to the root node of the document.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/documentElement)
     */
    val documentElement: HTMLElement

    /**
     * Returns document's URL.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/documentURI)
     */
    val documentURI: String

    /**
     * Retrieves a collection of all embed objects in the document.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/embeds)
     */
    val embeds: HTMLCollectionOf<HTMLEmbedElement>

    /**
     * Retrieves a collection, in source order, of all form objects in the document.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/forms)
     */
    val forms: HTMLCollectionOf<HTMLFormElement>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/fragmentDirective)
     */
    val fragmentDirective: FragmentDirective

    /**
     * Returns true if document has the ability to display elements fullscreen and fullscreen is supported, or false otherwise.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/fullscreenEnabled)
     */
    val fullscreenEnabled: Boolean

    /**
     * Returns the head element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/head)
     */
    val head: HTMLHeadElement

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/hidden)
     */
    val hidden: Boolean

    /**
     * Retrieves a collection, in source order, of img objects in the document.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/images)
     */
    val images: HTMLCollectionOf<HTMLImageElement>

    /**
     * Gets the implementation object of the current document.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/implementation)
     */
    val implementation: DOMImplementation

    /**
     * Gets the date that the page was last modified, if the page supplies one.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/lastModified)
     */
    val lastModified: String

    /**
     * Retrieves a collection of all a objects that specify the href property and all area objects in the document.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/links)
     */
    val links: HTMLCollectionOf<HTMLElement /* HTMLAnchorElement | HTMLAreaElement */>

    /**
     * Contains information about the current URL.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/location)
     */
    val location: Location

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/fullscreenchange_event)
     */
    var onfullscreenchange: EventHandler<Event, Document, Node>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/fullscreenerror_event)
     */
    var onfullscreenerror: EventHandler<Event, Document, Node>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/pointerlockchange_event)
     */
    var onpointerlockchange: EventHandler<Event, Document, Document>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/pointerlockerror_event)
     */
    var onpointerlockerror: EventHandler<Event, Document, Document>?

    /**
     * Fires when the state of the object has changed.
     * @param ev The event
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/readystatechange_event)
     */
    var onreadystatechange: EventHandler<Event, Document, Document>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/visibilitychange_event)
     */
    var onvisibilitychange: EventHandler<Event, Document, Document>?
    override val ownerDocument: Void

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/pictureInPictureEnabled)
     */
    val pictureInPictureEnabled: Boolean

    /**
     * Return an HTMLCollection of the embed elements in the Document.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/plugins)
     */
    val plugins: HTMLCollectionOf<HTMLEmbedElement>

    /**
     * Retrieves a value that indicates the current state of the object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/readyState)
     */
    val readyState: DocumentReadyState

    /**
     * Gets the URL of the location that referred the user to the current page.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/referrer)
     */
    val referrer: String

    /**
     * Retrieves a collection of all script objects in the document.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/scripts)
     */
    val scripts: HTMLCollectionOf<HTMLScriptElement>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/scrollingElement)
     */
    val scrollingElement: Element?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/timeline)
     */
    val timeline: DocumentTimeline

    /**
     * Contains the title of the document.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/title)
     */
    var title: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/visibilityState)
     */
    val visibilityState: DocumentVisibilityState

    /**
     * Moves node from another document and returns it.
     *
     * If node is a document, throws a "NotSupportedError" DOMException or, if node is a shadow root, throws a "HierarchyRequestError" DOMException.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/adoptNode)
     */
    fun <T : Node> adoptNode(node: T): T

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/caretPositionFromPoint)
     */
    fun caretPositionFromPoint(
        x: Double,
        y: Double,
        options: CaretPositionFromPointOptions = definedExternally,
    ): CaretPosition?

    /**
     * Closes an output stream and forces the sent data to display.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/close)
     */
    fun close()

    /**
     * Creates an attribute object with a specified name.
     * @param name String that sets the attribute object's name.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/createAttribute)
     */
    fun createAttribute(localName: String): Attr

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/createAttributeNS)
     */
    fun createAttributeNS(
        namespace: String?,
        qualifiedName: String,
    ): Attr

    /**
     * Returns a CDATASection node whose data is data.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/createCDATASection)
     */
    fun createCDATASection(data: String): CDATASection

    /**
     * Creates a comment object with the specified data.
     * @param data Sets the comment object's data.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/createComment)
     */
    fun createComment(data: String): Comment

    /**
     * Creates a new document.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/createDocumentFragment)
     */
    fun createDocumentFragment(): DocumentFragment

    /**
     * Creates an instance of the element for the specified tag.
     * @param tagName The name of an element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/createElement)
     */
    fun <T : HTMLElement> createElement(
        tagName: HtmlTagName<T>,
        options: ElementCreationOptions = definedExternally,
    ): T

    fun createElement(
        tagName: String,
        options: ElementCreationOptions = definedExternally,
    ): HTMLElement

    fun <T : SVGElement> createElementNS(
        namespaceURI: SVG_NAMESPACE,
        qualifiedName: SvgTagName<T>,
    ): T

    fun <T : MathMLElement> createElementNS(
        namespaceURI: MATHML_NAMESPACE,
        qualifiedName: MathMLTagName<T>,
    ): T

    fun createElementNS(
        namespace: String?,
        qualifiedName: String,
        options: String = definedExternally,
    ): Element

    fun createElementNS(
        namespace: String?,
        qualifiedName: String,
        options: ElementCreationOptions,
    ): Element

    /**
     * Creates a NodeIterator object that you can use to traverse filtered lists of nodes or elements in a document.
     * @param root The root element or node to start traversing on.
     * @param whatToShow The type of nodes or elements to appear in the node list
     * @param filter A custom NodeFilter function to use. For more information, see filter. Use null for no filter.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/createNodeIterator)
     */
    fun createNodeIterator(
        root: Node,
        whatToShow: Int = definedExternally,
        filter: NodeFilter? = definedExternally,
    ): NodeIterator

    /**
     * Returns a ProcessingInstruction node whose target is target and data is data. If target does not match the Name production an "InvalidCharacterError" DOMException will be thrown. If data contains "?>" an "InvalidCharacterError" DOMException will be thrown.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/createProcessingInstruction)
     */
    fun createProcessingInstruction(
        target: String,
        data: String,
    ): ProcessingInstruction

    /**
     *  Returns an empty range object that has both of its boundary points positioned at the beginning of the document.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/createRange)
     */
    fun createRange(): Range

    /**
     * Creates a text string from the specified value.
     * @param data String that specifies the nodeValue property of the text node.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/createTextNode)
     */
    fun createTextNode(data: String): Text

    /**
     * Creates a TreeWalker object that you can use to traverse filtered lists of nodes or elements in a document.
     * @param root The root element or node to start traversing on.
     * @param whatToShow The type of nodes or elements to appear in the node list. For more information, see whatToShow.
     * @param filter A custom NodeFilter function to use.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/createTreeWalker)
     */
    fun createTreeWalker(
        root: Node,
        whatToShow: Int = definedExternally,
        filter: NodeFilter? = definedExternally,
    ): TreeWalker

    /**
     * Stops document's fullscreen element from being displayed fullscreen and resolves promise when done.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/exitFullscreen)
     */
    @JsAsync
    suspend fun exitFullscreen()

    @JsName("exitFullscreen")
    fun exitFullscreenAsync(): Promise<Void>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/exitPictureInPicture)
     */
    @JsAsync
    suspend fun exitPictureInPicture()

    @JsName("exitPictureInPicture")
    fun exitPictureInPictureAsync(): Promise<Void>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/exitPointerLock)
     */
    fun exitPointerLock()

    /**
     * Returns a reference to the first object with the specified value of the ID attribute.
     * @param elementId String that specifies the ID value.
     */
    override fun getElementById(elementId: String): HTMLElement?

    /**
     * Returns a HTMLCollection of the elements in the object on which the method was invoked (a document or an element) that have all the classes given by classNames. The classNames argument is interpreted as a space-separated list of classes.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/getElementsByClassName)
     */
    fun getElementsByClassName(classNames: String): HTMLCollectionOf<Element>

    /**
     * Gets a collection of objects based on the value of the NAME or ID attribute.
     * @param elementName Gets a collection of objects based on the value of the NAME or ID attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/getElementsByName)
     */
    fun getElementsByName(elementName: String): NodeListOf<HTMLElement>

    /**
     * Retrieves a collection of objects based on the specified element name.
     * @param name Specifies the name of an element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/getElementsByTagName)
     */
    fun <T : HTMLElement> getElementsByTagName(qualifiedName: HtmlTagName<T>): HTMLCollectionOf<T>
    fun <T : SVGElement> getElementsByTagName(qualifiedName: SvgTagName<T>): HTMLCollectionOf<T>
    fun <T : MathMLElement> getElementsByTagName(qualifiedName: MathMLTagName<T>): HTMLCollectionOf<T>
    fun getElementsByTagName(qualifiedName: String): HTMLCollectionOf<Element>
    fun <T : SVGElement> getElementsByTagNameNS(
        namespaceURI: SVG_NAMESPACE,
        localName: SvgTagName<T>,
    ): HTMLCollectionOf<T>

    fun <T : MathMLElement> getElementsByTagNameNS(
        namespaceURI: MATHML_NAMESPACE,
        localName: MathMLTagName<T>,
    ): HTMLCollectionOf<T>

    fun getElementsByTagNameNS(
        namespace: String?,
        localName: String,
    ): HTMLCollectionOf<Element>

    /**
     * Returns an object representing the current selection of the document that is loaded into the object displaying a webpage.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/getSelection)
     */
    fun getSelection(): Selection?

    /**
     * Gets a value indicating whether the object currently has focus.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/hasFocus)
     */
    fun hasFocus(): Boolean

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/hasStorageAccess)
     */
    @JsAsync
    suspend fun hasStorageAccess(): Boolean

    @JsName("hasStorageAccess")
    fun hasStorageAccessAsync(): Promise<Boolean>

    /**
     * Returns a copy of node. If deep is true, the copy also includes the node's descendants.
     *
     * If node is a document or a shadow root, throws a "NotSupportedError" DOMException.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/importNode)
     */
    fun <T : Node> importNode(
        node: T,
        deep: Boolean = definedExternally,
    ): T

    /**
     * Opens a new window and loads a document specified by a given URL. Also, opens a new window that uses the url parameter and the name parameter to collect the output of the write method and the writeln method.
     * @param url Specifies a MIME type for the document.
     * @param name Specifies the name of the window. This name is used as the value for the TARGET attribute on a form or an anchor element.
     * @param features Contains a list of items separated by commas. Each item consists of an option and a value, separated by an equals sign (for example, "fullscreen=yes, toolbar=yes"). The following values are supported.
     * @param replace Specifies whether the existing entry for the document is replaced in the history list.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/open)
     */
    fun open(
        unused1: String = definedExternally,
        unused2: String = definedExternally,
    ): Document

    fun open(
        url: String,
        name: String,
        features: String,
    ): WindowProxy?

    fun open(
        url: URL,
        name: String,
        features: String,
    ): WindowProxy?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/requestStorageAccess)
     */
    @JsAsync
    suspend fun requestStorageAccess()

    @JsName("requestStorageAccess")
    fun requestStorageAccessAsync(): Promise<Void>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/startViewTransition)
     */
    fun startViewTransition(callbackOptions: ViewTransitionUpdateCallback = definedExternally): ViewTransition

    /**
     * Writes one or more HTML expressions to a document in the specified window.
     * @param content Specifies the text and HTML tags to write.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/write)
     */
    fun write(vararg text: String)

    /**
     * Writes one or more HTML expressions, followed by a carriage return, to a document in the specified window.
     * @param content The text and HTML tags to write.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/writeln)
     */
    fun writeln(vararg text: String)

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/animationcancel_event)
     */
    @JsEvent("animationcancel")
    val animationCancelEvent: EventInstance<AnimationEvent, Document /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/animationend_event)
     */
    @JsEvent("animationend")
    val animationEndEvent: EventInstance<AnimationEvent, Document /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/animationiteration_event)
     */
    @JsEvent("animationiteration")
    val animationIterationEvent: EventInstance<AnimationEvent, Document /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/animationstart_event)
     */
    @JsEvent("animationstart")
    val animationStartEvent: EventInstance<AnimationEvent, Document /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/auxclick_event)
     */
    @JsEvent("auxclick")
    val auxClickEvent: EventInstance<MouseEvent, Document /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/beforeinput_event)
     */
    @JsEvent("beforeinput")
    val beforeInputEvent: EventInstance<InputEvent, Document /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/cancel_event)
     */
    @JsEvent("cancel")
    val cancelEvent: EventInstance<Event, Document /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/change_event)
     */
    @JsEvent("change")
    val changeEvent: EventInstance<Event, Document /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/click_event)
     */
    @JsEvent("click")
    val clickEvent: EventInstance<MouseEvent, Document /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/compositionend_event)
     */
    @JsEvent("compositionend")
    val compositionEndEvent: EventInstance<CompositionEvent, Document /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/compositionstart_event)
     */
    @JsEvent("compositionstart")
    val compositionStartEvent: EventInstance<CompositionEvent, Document /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/compositionupdate_event)
     */
    @JsEvent("compositionupdate")
    val compositionUpdateEvent: EventInstance<CompositionEvent, Document /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/contextmenu_event)
     */
    @JsEvent("contextmenu")
    val contextMenuEvent: EventInstance<MouseEvent, Document /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/copy_event)
     */
    @JsEvent("copy")
    val copyEvent: EventInstance<ClipboardEvent, Document /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/cut_event)
     */
    @JsEvent("cut")
    val cutEvent: EventInstance<ClipboardEvent, Document /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/dblclick_event)
     */
    @JsEvent("dblclick")
    val dblClickEvent: EventInstance<MouseEvent, Document /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/DOMContentLoaded_event)
     */
    @JsEvent("DOMContentLoaded")
    val domContentLoadedEvent: EventInstance<Event, Document /* this */, Window>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/drag_event)
     */
    @JsEvent("drag")
    val dragEvent: EventInstance<DragEvent, Document /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/dragend_event)
     */
    @JsEvent("dragend")
    val dragEndEvent: EventInstance<DragEvent, Document /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/dragenter_event)
     */
    @JsEvent("dragenter")
    val dragEnterEvent: EventInstance<DragEvent, Document /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/dragleave_event)
     */
    @JsEvent("dragleave")
    val dragLeaveEvent: EventInstance<DragEvent, Document /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/dragover_event)
     */
    @JsEvent("dragover")
    val dragOverEvent: EventInstance<DragEvent, Document /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/dragstart_event)
     */
    @JsEvent("dragstart")
    val dragStartEvent: EventInstance<DragEvent, Document /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/drop_event)
     */
    @JsEvent("drop")
    val dropEvent: EventInstance<DragEvent, Document /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/enterpictureinpicture_event)
     */
    @JsEvent("enterpictureinpicture")
    val enterPictureInPictureEvent: EventInstance<PictureInPictureEvent, Document /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/focusin_event)
     */
    @JsEvent("focusin")
    val focusInEvent: EventInstance<FocusEvent, Document /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/focusout_event)
     */
    @JsEvent("focusout")
    val focusOutEvent: EventInstance<FocusEvent, Document /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/formdata_event)
     */
    @JsEvent("formdata")
    val formDataEvent: EventInstance<FormDataEvent, Document /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/fullscreenchange_event)
     */
    @JsEvent("fullscreenchange")
    val fullscreenChangeEvent: EventInstance<Event, Document /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/fullscreenerror_event)
     */
    @JsEvent("fullscreenerror")
    val fullscreenErrorEvent: EventInstance<Event, Document /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/gotpointercapture_event)
     */
    @JsEvent("gotpointercapture")
    val gotPointerCaptureEvent: EventInstance<PointerEvent, Document /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/input_event)
     */
    @JsEvent("input")
    val inputEvent: EventInstance<InputEvent, Document /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/keydown_event)
     */
    @JsEvent("keydown")
    val keyDownEvent: EventInstance<KeyboardEvent, Document /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/keypress_event)
     */
    @JsEvent("keypress")
    val keyPressEvent: EventInstance<KeyboardEvent, Document /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/keyup_event)
     */
    @JsEvent("keyup")
    val keyUpEvent: EventInstance<KeyboardEvent, Document /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/leavepictureinpicture_event)
     */
    @JsEvent("leavepictureinpicture")
    val leavePictureInPictureEvent: EventInstance<PictureInPictureEvent, Document /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/load_event)
     */
    @JsEvent("load")
    val loadEvent: EventInstance<Event, Document /* this */, Document /* this */>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/lostpointercapture_event)
     */
    @JsEvent("lostpointercapture")
    val lostPointerCaptureEvent: EventInstance<PointerEvent, Document /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/mousedown_event)
     */
    @JsEvent("mousedown")
    val mouseDownEvent: EventInstance<MouseEvent, Document /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/mousemove_event)
     */
    @JsEvent("mousemove")
    val mouseMoveEvent: EventInstance<MouseEvent, Document /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/mouseout_event)
     */
    @JsEvent("mouseout")
    val mouseOutEvent: EventInstance<MouseEvent, Document /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/mouseover_event)
     */
    @JsEvent("mouseover")
    val mouseOverEvent: EventInstance<MouseEvent, Document /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/mouseup_event)
     */
    @JsEvent("mouseup")
    val mouseUpEvent: EventInstance<MouseEvent, Document /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/paste_event)
     */
    @JsEvent("paste")
    val pasteEvent: EventInstance<ClipboardEvent, Document /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/pointercancel_event)
     */
    @JsEvent("pointercancel")
    val pointerCancelEvent: EventInstance<PointerEvent, Document /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/pointerdown_event)
     */
    @JsEvent("pointerdown")
    val pointerDownEvent: EventInstance<PointerEvent, Document /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/pointerenter_event)
     */
    @JsEvent("pointerenter")
    val pointerEnterEvent: EventInstance<PointerEvent, Document /* this */, Document /* this */>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/pointerleave_event)
     */
    @JsEvent("pointerleave")
    val pointerLeaveEvent: EventInstance<PointerEvent, Document /* this */, Document /* this */>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/pointerlockchange_event)
     */
    @JsEvent("pointerlockchange")
    val pointerLockChangeEvent: EventInstance<Event, Document /* this */, Document /* this */>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/pointerlockerror_event)
     */
    @JsEvent("pointerlockerror")
    val pointerLockErrorEvent: EventInstance<Event, Document /* this */, Document /* this */>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/pointermove_event)
     */
    @JsEvent("pointermove")
    val pointerMoveEvent: EventInstance<PointerEvent, Document /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/pointerout_event)
     */
    @JsEvent("pointerout")
    val pointerOutEvent: EventInstance<PointerEvent, Document /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/pointerover_event)
     */
    @JsEvent("pointerover")
    val pointerOverEvent: EventInstance<PointerEvent, Document /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/pointerup_event)
     */
    @JsEvent("pointerup")
    val pointerUpEvent: EventInstance<PointerEvent, Document /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/readystatechange_event)
     */
    @JsEvent("readystatechange")
    val readyStateChangeEvent: EventInstance<Event, Document /* this */, Document /* this */>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/reset_event)
     */
    @JsEvent("reset")
    val resetEvent: EventInstance<Event, Document /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/resume_event)
     */
    @JsEvent("resume")
    val resumeEvent: EventInstance<Event, Document /* this */, Document /* this */>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/scroll_event)
     */
    @JsEvent("scroll")
    val scrollEvent: EventInstance<Event, Document /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/scrollend_event)
     */
    @JsEvent("scrollend")
    val scrollEndEvent: EventInstance<Event, Document /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/select_event)
     */
    @JsEvent("select")
    val selectEvent: EventInstance<Event, Document /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/selectionchange_event)
     */
    @JsEvent("selectionchange")
    val selectionChangeEvent: EventInstance<Event, Document /* this */, Document /* this */>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/selectstart_event)
     */
    @JsEvent("selectstart")
    val selectStartEvent: EventInstance<Event, Document /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/slotchange_event)
     */
    @JsEvent("slotchange")
    val slotChangeEvent: EventInstance<Event, Document /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/submit_event)
     */
    @JsEvent("submit")
    val submitEvent: EventInstance<SubmitEvent, Document /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/touchcancel_event)
     */
    @JsEvent("touchcancel")
    val touchCancelEvent: EventInstance<TouchEvent, Document /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/touchend_event)
     */
    @JsEvent("touchend")
    val touchEndEvent: EventInstance<TouchEvent, Document /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/touchmove_event)
     */
    @JsEvent("touchmove")
    val touchMoveEvent: EventInstance<TouchEvent, Document /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/touchstart_event)
     */
    @JsEvent("touchstart")
    val touchStartEvent: EventInstance<TouchEvent, Document /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/transitioncancel_event)
     */
    @JsEvent("transitioncancel")
    val transitionCancelEvent: EventInstance<TransitionEvent, Document /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/transitionend_event)
     */
    @JsEvent("transitionend")
    val transitionEndEvent: EventInstance<TransitionEvent, Document /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/transitionrun_event)
     */
    @JsEvent("transitionrun")
    val transitionRunEvent: EventInstance<TransitionEvent, Document /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/transitionstart_event)
     */
    @JsEvent("transitionstart")
    val transitionStartEvent: EventInstance<TransitionEvent, Document /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/unload_event)
     */
    @JsEvent("unload")
    val unloadEvent: EventInstance<Event, Document /* this */, Document /* this */>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/visibilitychange_event)
     */
    @JsEvent("visibilitychange")
    val visibilityChangeEvent: EventInstance<Event, Document /* this */, Document /* this */>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/wheel_event)
     */
    @JsEvent("wheel")
    val wheelEvent: EventInstance<WheelEvent, Document /* this */, Node>

    companion object {
        /**
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/parseHTMLUnsafe_static)
         */
        fun parseHTMLUnsafe(html: String): Document
    }
}

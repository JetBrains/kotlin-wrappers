// Automatically generated - do not modify!

package web.dom

import js.core.JsBoolean
import js.core.Void
import js.promise.Promise
import seskar.js.JsAsync
import web.animations.AnimationEvent
import web.animations.DocumentTimeline
import web.clipboard.ClipboardEvent
import web.cssom.ClassName
import web.cssom.TransitionEvent
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
import web.viewtransition.StartViewTransitionOptions
import web.viewtransition.ViewTransition
import web.viewtransition.ViewTransitionUpdateCallback
import web.window.Window
import web.window.WindowProxy
import web.xpath.XPathEvaluatorBase
import kotlin.js.JsName
import kotlin.js.definedExternally

/**
 * The **`Document`** interface represents any web page loaded in the browser and serves as an entry point into the web page's content, which is the DOM tree.
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
     * The **`URL`** read-only property of the Document interface returns the document location as a string.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/URL)
     */
    val URL: String

    /**
     * The **`Document.body`** property represents the `null` if no such element exists.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/body)
     */
    var body: HTMLElement

    /**
     * The **`Document.characterSet`** read-only property returns the character encoding of the document that it's currently rendered with.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/characterSet)
     */
    val characterSet: String

    /**
     * The **`Document.compatMode`** read-only property indicates whether the document is rendered in Quirks mode or Standards mode.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/compatMode)
     */
    val compatMode: String

    /**
     * The **`Document.contentType`** read-only property returns the MIME type that the document is being rendered as.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/contentType)
     */
    val contentType: String

    /**
     * The Document property `cookie` lets you read and write cookies associated with the document.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/cookie)
     */
    var cookie: String

    /**
     * The **`Document.currentScript`** property returns the script element whose script is currently being processed and isn't a JavaScript module.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/currentScript)
     */
    val currentScript: HTMLOrSVGScriptElement?

    /**
     * In browsers, **`document.defaultView`** returns the This property is read-only.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/defaultView)
     */
    val defaultView: WindowProxy?

    /**
     * **`document.designMode`** controls whether the entire document is editable.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/designMode)
     */
    var designMode: String

    /**
     * The **`Document.dir`** property is a string representing the directionality of the text of the document, whether left to right (default) or right to left.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/dir)
     */
    var dir: String

    /**
     * The **`doctype`** read-only property of the Document interface is a DocumentType object representing the Doctype associated with the current document.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/doctype)
     */
    val doctype: DocumentType?

    /**
     * The **`documentElement`** read-only property of the Document interface returns the example, the html element for HTML documents).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/documentElement)
     */
    val documentElement: HTMLElement

    /**
     * The **`documentURI`** read-only property of the A string.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/documentURI)
     */
    val documentURI: String

    /**
     * The **`embeds`** read-only property of the An HTMLCollection.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/embeds)
     */
    val embeds: HTMLCollection<HTMLEmbedElement>

    /**
     * The **`forms`** read-only property of the Document interface returns an HTMLCollection listing all the form elements contained in the document.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/forms)
     */
    val forms: HTMLCollection<HTMLFormElement>

    /**
     * The **`fragmentDirective`** read-only property of the Document interface returns the FragmentDirective for the current document.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/fragmentDirective)
     */
    val fragmentDirective: FragmentDirective

    /**
     * The read-only **`fullscreenEnabled`** property on the Document interface indicates whether or not fullscreen mode is available.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/fullscreenEnabled)
     */
    val fullscreenEnabled: Boolean

    /**
     * The **`head`** read-only property of the Document interface returns the head element of the current document.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/head)
     */
    val head: HTMLHeadElement

    /**
     * The **`Document.hidden`** read-only property returns a Boolean value indicating if the page is considered hidden or not.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/hidden)
     */
    val hidden: Boolean

    /**
     * The **`images`** read-only property of the Document interface returns a collection of the images in the current HTML document.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/images)
     */
    val images: HTMLCollection<HTMLImageElement>

    /**
     * The **`Document.implementation`** property returns a A DOMImplementation object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/implementation)
     */
    val implementation: DOMImplementation

    /**
     * The **`lastModified`** property of the Document interface returns a string containing the date and local time on which the current document was last modified.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/lastModified)
     */
    val lastModified: String

    /**
     * The **`links`** read-only property of the Document interface returns a collection of all area elements and a elements in a document with a value for the href attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/links)
     */
    val links: HTMLCollection<HTMLElement /* HTMLAnchorElement | HTMLAreaElement */>

    /**
     * The **`Document.location`** read-only property returns a and provides methods for changing that URL and loading another URL.
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
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/readystatechange_event)
     */
    var onreadystatechange: EventHandler<Event, Document, Document>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/visibilitychange_event)
     */
    var onvisibilitychange: EventHandler<Event, Document, Window>?

    @Suppress("WRONG_JS_INTEROP_TYPE")
    override val ownerDocument: Void

    /**
     * The read-only **`pictureInPictureEnabled`** property of the available.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/pictureInPictureEnabled)
     */
    val pictureInPictureEnabled: Boolean

    /**
     * The **`plugins`** read-only property of the containing one or more HTMLEmbedElements representing the An HTMLCollection.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/plugins)
     */
    val plugins: HTMLCollection<HTMLEmbedElement>

    /**
     * The **`Document.readyState`** property describes the loading state of the document.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/readyState)
     */
    val readyState: DocumentReadyState

    /**
     * The **`Document.referrer`** property returns the URI of the page that linked to this page.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/referrer)
     */
    val referrer: String

    /**
     * The **`scripts`** property of the Document interface returns a list of the script elements in the document.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/scripts)
     */
    val scripts: HTMLCollection<HTMLScriptElement>

    /**
     * The **`scrollingElement`** read-only property of the scrolls the document.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/scrollingElement)
     */
    val scrollingElement: Element?

    /**
     * The `timeline` readonly property of the Document interface represents the default timeline of the current document.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/timeline)
     */
    val timeline: DocumentTimeline

    /**
     * The **`document.title`** property gets or sets the current title of the document.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/title)
     */
    var title: String

    /**
     * The **`Document.visibilityState`** read-only property returns the visibility of the document.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/visibilityState)
     */
    val visibilityState: DocumentVisibilityState

    /**
     * **`Document.adoptNode()`** transfers a node/dom from another Document into the method's document.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/adoptNode)
     */
    fun <T : Node> adoptNode(node: T): T

    /**
     * The **`caretPositionFromPoint()`** method of the Document interface returns a CaretPosition object, containing the DOM node, along with the caret and caret's character offset within that node.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/caretPositionFromPoint)
     */
    fun caretPositionFromPoint(
        x: Double,
        y: Double,
        options: CaretPositionFromPointOptions = definedExternally,
    ): CaretPosition?

    /**
     * The **`Document.close()`** method finishes writing to a document, opened with Document.open().
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/close)
     */
    fun close()

    /**
     * The **`Document.createAttribute()`** method creates a new attribute node, and returns it.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/createAttribute)
     */
    fun createAttribute(localName: String): Attr

    /**
     * The **`Document.createAttributeNS()`** method creates a new attribute node with the specified namespace URI and qualified name, and returns it.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/createAttributeNS)
     */
    fun createAttributeNS(
        namespace: String?,
        qualifiedName: String,
    ): Attr

    /**
     * **`createCDATASection()`** creates a new CDATA section node, and returns it.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/createCDATASection)
     */
    fun createCDATASection(data: String): CDATASection

    /**
     * **`createComment()`** creates a new comment node, and returns it.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/createComment)
     */
    fun createComment(data: String): Comment

    /**
     * Creates a new empty DocumentFragment into which DOM nodes can be added to build an offscreen DOM tree.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/createDocumentFragment)
     */
    fun createDocumentFragment(): DocumentFragment

    /**
     * In an HTML document, the **`document.createElement()`** method creates the HTML element specified by `localName`, or an HTMLUnknownElement if `localName` isn't recognized.
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
     * The **`Document.createNodeIterator()`** method returns a new `NodeIterator` object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/createNodeIterator)
     */
    fun createNodeIterator(
        root: Node,
        whatToShow: Int = definedExternally,
        filter: NodeFilter? = definedExternally,
    ): NodeIterator

    /**
     * `createProcessingInstruction()` generates a new processing instruction node and returns it.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/createProcessingInstruction)
     */
    fun createProcessingInstruction(
        target: String,
        data: String,
    ): ProcessingInstruction

    /**
     * The **`Document.createRange()`** method returns a new ```js-nolint createRange() ``` None.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/createRange)
     */
    fun createRange(): Range

    /**
     * Creates a new Text node.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/createTextNode)
     */
    fun createTextNode(data: String): Text

    /**
     * The **`Document.createTreeWalker()`** creator method returns a newly created TreeWalker object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/createTreeWalker)
     */
    fun createTreeWalker(
        root: Node,
        whatToShow: Int = definedExternally,
        filter: NodeFilter? = definedExternally,
    ): TreeWalker

    /**
     * The Document method **`exitFullscreen()`** requests that the element on this document which is currently being presented in fullscreen mode be taken out of fullscreen mode, restoring the previous state of the screen.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/exitFullscreen)
     */
    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun exitFullscreen()

    @JsName("exitFullscreen")
    fun exitFullscreenAsync(): Promise<Void>

    /**
     * The **`exitPictureInPicture()`** method of the Document interface requests that a video contained in this document, which is currently floating, be taken out of picture-in-picture mode, restoring the previous state of the screen.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/exitPictureInPicture)
     */
    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun exitPictureInPicture()

    @JsName("exitPictureInPicture")
    fun exitPictureInPictureAsync(): Promise<Void>

    /**
     * The **`exitPointerLock()`** method of the Document interface asynchronously releases a pointer lock previously requested through Element.requestPointerLock.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/exitPointerLock)
     */
    fun exitPointerLock()
    override fun getElementById(elementId: ElementId): HTMLElement?

    /**
     * The **`getElementsByClassName`** method of of all child elements which have all of the given class name(s).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/getElementsByClassName)
     */
    fun getElementsByClassName(classNames: ClassName): HTMLCollection<Element>

    /**
     * The **`getElementsByName()`** method of the Document object returns a NodeList Collection of elements with a given `name` attribute in the document.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/getElementsByName)
     */
    fun getElementsByName(elementName: String): NodeList<HTMLElement>

    /**
     * The **`getElementsByTagName`** method of The complete document is searched, including the root node.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/getElementsByTagName)
     */
    fun <T : HTMLElement> getElementsByTagName(qualifiedName: HtmlTagName<T>): HTMLCollection<T>
    fun <T : SVGElement> getElementsByTagName(qualifiedName: SvgTagName<T>): HTMLCollection<T>
    fun <T : MathMLElement> getElementsByTagName(qualifiedName: MathMLTagName<T>): HTMLCollection<T>
    fun getElementsByTagName(qualifiedName: String): HTMLCollection<Element>
    fun <T : SVGElement> getElementsByTagNameNS(
        namespaceURI: SVG_NAMESPACE,
        localName: SvgTagName<T>,
    ): HTMLCollection<T>

    fun <T : MathMLElement> getElementsByTagNameNS(
        namespaceURI: MATHML_NAMESPACE,
        localName: MathMLTagName<T>,
    ): HTMLCollection<T>

    fun getElementsByTagNameNS(
        namespace: String?,
        localName: String,
    ): HTMLCollection<Element>

    /**
     * The **`getSelection()`** method of the Document interface returns the Selection object associated with this document, representing the range of text selected by the user, or the current position of the caret.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/getSelection)
     */
    fun getSelection(): Selection?

    /**
     * The **`hasFocus()`** method of the Document interface returns a boolean value indicating whether the document or any element inside the document has focus.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/hasFocus)
     */
    fun hasFocus(): Boolean

    /**
     * The **`hasStorageAccess()`** method of the Document interface returns a Promise that resolves with a boolean value indicating whether the document has access to third-party, unpartitioned cookies.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/hasStorageAccess)
     */
    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun hasStorageAccess(): Boolean

    @JsName("hasStorageAccess")
    fun hasStorageAccessAsync(): Promise<JsBoolean>

    /**
     * The Document object's **`importNode()`** method creates a copy of a inserted into the current document later.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/importNode)
     */
    fun <T : Node> importNode(
        node: T,
        subtree: Boolean = definedExternally,
    ): T

    fun <T : Node> importNode(
        node: T,
        options: ImportNodeOptions,
    ): T

    /**
     * The **`Document.open()`** method opens a document for This does come with some side effects.
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
     * The **`requestStorageAccess()`** method of the Document interface allows content loaded in a third-party context (i.e., embedded in an iframe) to request access to third-party cookies and unpartitioned state.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/requestStorageAccess)
     */
    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun requestStorageAccess()

    @JsName("requestStorageAccess")
    fun requestStorageAccessAsync(): Promise<Void>

    /**
     * The **`startViewTransition()`** method of the Document interface starts a new same-document (SPA) view transition and returns a ViewTransition object to represent it.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/startViewTransition)
     */
    fun startViewTransition(callbackOptions: ViewTransitionUpdateCallback = definedExternally): ViewTransition
    fun startViewTransition(callbackOptions: StartViewTransitionOptions): ViewTransition

    /**
     * Writes a string of text followed by a newline character to a document.
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
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/beforematch_event)
     */
    @JsEvent("beforematch")
    val beforeMatchEvent: EventInstance<Event, Document /* this */, Node>

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
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/pointerrawupdate_event)
     */
    @JsEvent("pointerrawupdate")
    val pointerRawUpdateEvent: EventInstance<PointerEvent, Document /* this */, Node>

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
    val visibilityChangeEvent: EventInstance<Event, Document /* this */, Window>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/wheel_event)
     */
    @JsEvent("wheel")
    val wheelEvent: EventInstance<WheelEvent, Document /* this */, Node>

    companion object {
        /**
         * The **`parseHTMLUnsafe()`** static method of the Document object is used to parse a string of HTML, which may contain declarative shadow roots, in order to create a new Document instance.
         *
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/parseHTMLUnsafe_static)
         */
        fun parseHTMLUnsafe(html: String): Document
    }
}

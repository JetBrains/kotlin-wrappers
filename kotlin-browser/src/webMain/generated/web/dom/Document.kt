// Automatically generated - do not modify!

package web.dom

import js.core.Void
import js.promise.Promise
import js.promise.await
import web.animations.AnimationEvent
import web.animations.DocumentTimeline
import web.clipboard.ClipboardEvent
import web.cssom.ClassName
import web.cssom.TransitionEvent
import web.dnd.DragEvent
import web.events.Event
import web.events.EventHandler
import web.events.EventInstance
import web.focus.FocusEvent
import web.fonts.FontFaceSource
import web.form.FormDataEvent
import web.form.SubmitEvent
import web.html.*
import web.input.CompositionEvent
import web.input.InputEvent
import web.keyboard.KeyboardEvent
import web.location.Location
import web.mouse.MouseEvent
import web.mouse.WheelEvent
import web.pip.PictureInPictureEvent
import web.pointer.PointerEvent
import web.ranges.Range
import web.selection.Selection
import web.touch.TouchEvent
import web.trustedtypes.TrustedHTML
import web.url.FragmentDirective
import web.url.URL
import web.viewtransition.StartViewTransitionOptions
import web.viewtransition.ViewTransition
import web.viewtransition.ViewTransitionUpdateCallback
import web.window.Window
import web.window.WindowProxy
import web.xpath.XPathEvaluatorBase
import kotlin.js.JsBoolean
import kotlin.js.JsName
import kotlin.js.definedExternally
import kotlin.js.toBoolean

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
     * The **`Document.body`** property represents the <body> or <frameset> node of the current document, or null if no such element exists.
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
     * The **`Document.contentType`** read-only property returns the MIME type that the document is being rendered as. This may come from HTTP headers or other sources of MIME information, and might be affected by automatic type conversions performed by either the browser or extensions.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/contentType)
     */
    val contentType: String

    /**
     * The Document property **`cookie`** lets you read and write cookies associated with the document. It serves as a getter and setter for the actual values of the cookies.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/cookie)
     */
    var cookie: String

    /**
     * The **`Document.currentScript`** property returns the <script> element whose script is currently being processed and isn't a JavaScript module. (For modules use import.meta instead.)
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/currentScript)
     */
    val currentScript: HTMLOrSVGScriptElement?

    /**
     * In browsers, **`document.defaultView`** returns the window object associated with a document, or null if none is available.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/defaultView)
     */
    val defaultView: WindowProxy?

    /**
     * **`document.designMode`** controls whether the entire document is editable. Valid values are "on" and "off". According to the specification, this property is meant to default to "off". Firefox follows this standard. The earlier versions of Chrome and IE default to "inherit". Starting in Chrome 43, the default is "off" and "inherit" is no longer supported. In IE6-10, the value is capitalized.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/designMode)
     */
    var designMode: String

    /**
     * The **`Document.dir`** property is a string representing the directionality of the text of the document, whether left to right (default) or right to left. Possible values are 'rtl', right to left, and 'ltr', left to right.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/dir)
     */
    var dir: String

    /**
     * The **`doctype`** read-only property of the Document interface is a DocumentType object representing the Document Type Declaration (DTD) associated with the current document.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/doctype)
     */
    val doctype: DocumentType?

    /**
     * The **`documentElement`** read-only property of the Document interface returns the Element that is the root element of the document (for example, the <html> element for HTML documents).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/documentElement)
     */
    val documentElement: HTMLElement

    /**
     * The **`documentURI`** read-only property of the Document interface returns the document location as a string.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/documentURI)
     */
    val documentURI: String

    /**
     * The **`embeds`** read-only property of the Document interface returns a list of the embedded <embed> elements within the current document.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/embeds)
     */
    val embeds: HTMLCollection<HTMLEmbedElement>

    /**
     * The **`forms`** read-only property of the Document interface returns an HTMLCollection listing all the <form> elements contained in the document.
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
     * The **`head`** read-only property of the Document interface returns the <head> element of the current document.
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
     * The **`Document.implementation`** property returns a DOMImplementation object associated with the current document.
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
     * The **`links`** read-only property of the Document interface returns a collection of all <area> elements and <a> elements in a document with a value for the href attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/links)
     */
    val links: HTMLCollection<HTMLElement /* HTMLAnchorElement | HTMLAreaElement */>

    /**
     * The **`Document.location`** read-only property returns a Location object, which contains information about the URL of the document and provides methods for changing that URL and loading another URL.
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
     * The read-only **`pictureInPictureEnabled`** property of the Document interface indicates whether or not picture-in-picture mode is available.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/pictureInPictureEnabled)
     */
    val pictureInPictureEnabled: Boolean

    /**
     * The **`plugins`** read-only property of the Document interface returns an HTMLCollection object containing one or more HTMLEmbedElements representing the <embed> elements in the current document.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/plugins)
     */
    val plugins: HTMLCollection<HTMLEmbedElement>

    /**
     * The **`Document.readyState`** property describes the loading state of the document. When the value of this property changes, a readystatechange event fires on the document object.
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
     * The **`scripts`** property of the Document interface returns a list of the <script> elements in the document. The returned object is an HTMLCollection.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/scripts)
     */
    val scripts: HTMLCollection<HTMLScriptElement>

    /**
     * The **`scrollingElement`** read-only property of the Document interface returns a reference to the Element that scrolls the document. In standards mode, this is the root element of the document, document.documentElement.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/scrollingElement)
     */
    val scrollingElement: Element?

    /**
     * The **`timeline`** readonly property of the Document interface represents the default timeline of the current document. This timeline is a special instance of DocumentTimeline.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/timeline)
     */
    val timeline: DocumentTimeline

    /**
     * The **`document.title`** property gets or sets the current title of the document. When present, it defaults to the value of the <title>.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/title)
     */
    var title: String

    /**
     * The **`Document.visibilityState`** read-only property returns the visibility of the document. It can be used to check whether the document is in the background or in a minimized window, or is otherwise not visible to the user.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/visibilityState)
     */
    val visibilityState: DocumentVisibilityState

    /**
     * **`Document.adoptNode()`** transfers a node from another document into the method's document. The adopted node and its subtree are removed from their original document (if any), and their ownerDocument is changed to the current document. The node can then be inserted into the current document.
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
     * The **`Document.createAttribute()`** method creates a new attribute node, and returns it. The object created is a node implementing the Attr interface. The DOM does not enforce what sort of attributes can be added to a particular element in this manner.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/createAttribute)
     */
    fun createAttribute(localName: String): Attr

    /**
     * The **`Document.createAttributeNS()`** method creates a new attribute node with the specified namespace URI and qualified name, and returns it. The object created is a node implementing the Attr interface. The DOM does not enforce what sort of attributes can be added to a particular element in this manner.
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
     * In an HTML document, the **`document.createElement()`** method creates the HTML element specified by localName, or an HTMLUnknownElement if localName isn't recognized.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/createElement)
     */
    fun <T : HTMLElement> createElement(
        tagName: TagName<T>,
        options: ElementCreationOptions = definedExternally,
    ): T

    fun createElement(
        tagName: String,
        options: ElementCreationOptions = definedExternally,
    ): HTMLElement

    fun <T : Element> createElementNS(
        namespaceURI: TagNamespace<T>,
        qualifiedName: TagName<T>,
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
     * The **`Document.createNodeIterator()`** method returns a new NodeIterator object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/createNodeIterator)
     */
    fun createNodeIterator(
        root: Node,
        whatToShow: Int = definedExternally,
        filter: NodeFilter? = definedExternally,
    ): NodeIterator

    /**
     * **`createProcessingInstruction()`** generates a new processing instruction node and returns it.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/createProcessingInstruction)
     */
    fun createProcessingInstruction(
        target: String,
        data: String,
    ): ProcessingInstruction

    /**
     * The **`Document.createRange()`** method returns a new Range object whose start and end are offset 0 of the Document object on which it was called.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/createRange)
     */
    fun createRange(): Range

    /**
     * Creates a new Text node. This method can be used to escape HTML characters.
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
     * The Document method **`exitFullscreen()`** requests that the element on this document which is currently being presented in fullscreen mode be taken out of fullscreen mode, restoring the previous state of the screen. This usually reverses the effects of a previous call to Element.requestFullscreen().
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/exitFullscreen)
     */
    @JsName("exitFullscreen")
    fun exitFullscreenAsync(): Promise<Void>

    /**
     * The **`exitPictureInPicture()`** method of the Document interface requests that a video contained in this document, which is currently floating, be taken out of picture-in-picture mode, restoring the previous state of the screen. This usually reverses the effects of a previous call to HTMLVideoElement.requestPictureInPicture().
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/exitPictureInPicture)
     */
    @JsName("exitPictureInPicture")
    fun exitPictureInPictureAsync(): Promise<Void>

    /**
     * The **`exitPointerLock()`** method of the Document interface asynchronously releases a pointer lock previously requested through Element.requestPointerLock.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/exitPointerLock)
     */
    fun exitPointerLock()

    /**
     * The **`getElementById()`** method of the Document interface returns an Element object representing the element whose id property matches the specified string. Since element IDs are required to be unique if specified, they're a useful way to get access to a specific element quickly.
     */
    override fun getElementById(elementId: ElementId): HTMLElement?

    /**
     * The **`getElementsByClassName`** method of Document interface returns an array-like object of all child elements which have all of the given class name(s).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/getElementsByClassName)
     */
    fun getElementsByClassName(classNames: ClassName): HTMLCollection<Element>

    /**
     * The **`getElementsByName()`** method of the Document object returns a NodeList Collection of elements with a given name attribute in the document.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/getElementsByName)
     */
    fun getElementsByName(elementName: String): NodeList<HTMLElement>

    /**
     * The **`getElementsByTagName`** method of Document interface returns an HTMLCollection of elements with the given tag name.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/getElementsByTagName)
     */
    fun <T : Element> getElementsByTagName(qualifiedName: TagName<T>): HTMLCollection<T>
    fun getElementsByTagName(qualifiedName: String): HTMLCollection<Element>
    fun <T : Element> getElementsByTagNameNS(
        namespaceURI: TagNamespace<T>,
        localName: TagName<T>,
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
     * The **`hasFocus()`** method of the Document interface returns a boolean value indicating whether the document or any element inside the document has focus. This method can be used to determine whether the active element in a document has focus.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/hasFocus)
     */
    fun hasFocus(): Boolean

    /**
     * The **`hasStorageAccess()`** method of the Document interface returns a Promise that resolves with a boolean value indicating whether the document has access to third-party, unpartitioned cookies.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/hasStorageAccess)
     */
    @JsName("hasStorageAccess")
    fun hasStorageAccessAsync(): Promise<JsBoolean>

    /**
     * The Document object's **`importNode()`** method creates a copy of a Node or DocumentFragment from another document, to be inserted into the current document later.
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
     * The **`Document.open()`** method opens a document for writing.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/open)
     */
    fun open(): Document
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
     * The **`requestStorageAccess()`** method of the Document interface allows content loaded in a third-party context (i.e., embedded in an <iframe>) to request access to third-party cookies and unpartitioned state. This is relevant to user agents that, by default, block access to third-party, unpartitioned cookies to improve privacy (e.g., to prevent tracking), and is part of the Storage Access API.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/requestStorageAccess)
     */
    @JsName("requestStorageAccess")
    fun requestStorageAccessAsync(): Promise<Void>

    /**
     * The **`startViewTransition()`** method of the Document interface starts a new same-document (SPA) view transition and returns a ViewTransition object to represent it.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/startViewTransition)
     */
    fun startViewTransition(callbackOptions: ViewTransitionUpdateCallback = definedExternally): ViewTransition
    fun startViewTransition(callbackOptions: StartViewTransitionOptions): ViewTransition

    companion object {
        /**
         * The **`parseHTMLUnsafe()`** static method of the Document object is used to parse HTML input, optionally filtering unwanted HTML elements and attributes, in order to create a new Document instance.
         *
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/parseHTMLUnsafe_static)
         */
        fun parseHTMLUnsafe(html: TrustedHTML): Document
        fun parseHTMLUnsafe(html: String): Document
    }
}

/**
 * The Document method **`exitFullscreen()`** requests that the element on this document which is currently being presented in fullscreen mode be taken out of fullscreen mode, restoring the previous state of the screen. This usually reverses the effects of a previous call to Element.requestFullscreen().
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/exitFullscreen)
 */
suspend inline fun Document.exitFullscreen() {
    exitFullscreenAsync().await()
}

/**
 * The **`exitPictureInPicture()`** method of the Document interface requests that a video contained in this document, which is currently floating, be taken out of picture-in-picture mode, restoring the previous state of the screen. This usually reverses the effects of a previous call to HTMLVideoElement.requestPictureInPicture().
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/exitPictureInPicture)
 */
suspend inline fun Document.exitPictureInPicture() {
    exitPictureInPictureAsync().await()
}

/**
 * The **`hasStorageAccess()`** method of the Document interface returns a Promise that resolves with a boolean value indicating whether the document has access to third-party, unpartitioned cookies.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/hasStorageAccess)
 */
suspend inline fun Document.hasStorageAccess(): Boolean {
    return hasStorageAccessAsync().await().toBoolean()
}

/**
 * The **`requestStorageAccess()`** method of the Document interface allows content loaded in a third-party context (i.e., embedded in an <iframe>) to request access to third-party cookies and unpartitioned state. This is relevant to user agents that, by default, block access to third-party, unpartitioned cookies to improve privacy (e.g., to prevent tracking), and is part of the Storage Access API.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/requestStorageAccess)
 */
suspend inline fun Document.requestStorageAccess() {
    requestStorageAccessAsync().await()
}

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/animationcancel_event)
 */
inline val <C : Document> C.animationCancelEvent: EventInstance<AnimationEvent, C, Node>
    get() = EventInstance(this, "animationcancel")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/animationend_event)
 */
inline val <C : Document> C.animationEndEvent: EventInstance<AnimationEvent, C, Node>
    get() = EventInstance(this, "animationend")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/animationiteration_event)
 */
inline val <C : Document> C.animationIterationEvent: EventInstance<AnimationEvent, C, Node>
    get() = EventInstance(this, "animationiteration")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/animationstart_event)
 */
inline val <C : Document> C.animationStartEvent: EventInstance<AnimationEvent, C, Node>
    get() = EventInstance(this, "animationstart")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/auxclick_event)
 */
inline val <C : Document> C.auxClickEvent: EventInstance<MouseEvent, C, Node>
    get() = EventInstance(this, "auxclick")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/beforeinput_event)
 */
inline val <C : Document> C.beforeInputEvent: EventInstance<InputEvent, C, Node>
    get() = EventInstance(this, "beforeinput")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/beforematch_event)
 */
inline val <C : Document> C.beforeMatchEvent: EventInstance<Event, C, Node>
    get() = EventInstance(this, "beforematch")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/cancel_event)
 */
inline val <C : Document> C.cancelEvent: EventInstance<Event, C, Node>
    get() = EventInstance(this, "cancel")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/change_event)
 */
inline val <C : Document> C.changeEvent: EventInstance<Event, C, Node>
    get() = EventInstance(this, "change")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/click_event)
 */
inline val <C : Document> C.clickEvent: EventInstance<MouseEvent, C, Node>
    get() = EventInstance(this, "click")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/compositionend_event)
 */
inline val <C : Document> C.compositionEndEvent: EventInstance<CompositionEvent, C, Node>
    get() = EventInstance(this, "compositionend")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/compositionstart_event)
 */
inline val <C : Document> C.compositionStartEvent: EventInstance<CompositionEvent, C, Node>
    get() = EventInstance(this, "compositionstart")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/compositionupdate_event)
 */
inline val <C : Document> C.compositionUpdateEvent: EventInstance<CompositionEvent, C, Node>
    get() = EventInstance(this, "compositionupdate")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/contextmenu_event)
 */
inline val <C : Document> C.contextMenuEvent: EventInstance<MouseEvent, C, Node>
    get() = EventInstance(this, "contextmenu")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/copy_event)
 */
inline val <C : Document> C.copyEvent: EventInstance<ClipboardEvent, C, Node>
    get() = EventInstance(this, "copy")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/cut_event)
 */
inline val <C : Document> C.cutEvent: EventInstance<ClipboardEvent, C, Node>
    get() = EventInstance(this, "cut")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/dblclick_event)
 */
inline val <C : Document> C.dblClickEvent: EventInstance<MouseEvent, C, Node>
    get() = EventInstance(this, "dblclick")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/DOMContentLoaded_event)
 */
inline val <C : Document> C.domContentLoadedEvent: EventInstance<Event, C, Window>
    get() = EventInstance(this, "DOMContentLoaded")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/drag_event)
 */
inline val <C : Document> C.dragEvent: EventInstance<DragEvent, C, Node>
    get() = EventInstance(this, "drag")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/dragend_event)
 */
inline val <C : Document> C.dragEndEvent: EventInstance<DragEvent, C, Node>
    get() = EventInstance(this, "dragend")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/dragenter_event)
 */
inline val <C : Document> C.dragEnterEvent: EventInstance<DragEvent, C, Node>
    get() = EventInstance(this, "dragenter")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/dragleave_event)
 */
inline val <C : Document> C.dragLeaveEvent: EventInstance<DragEvent, C, Node>
    get() = EventInstance(this, "dragleave")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/dragover_event)
 */
inline val <C : Document> C.dragOverEvent: EventInstance<DragEvent, C, Node>
    get() = EventInstance(this, "dragover")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/dragstart_event)
 */
inline val <C : Document> C.dragStartEvent: EventInstance<DragEvent, C, Node>
    get() = EventInstance(this, "dragstart")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/drop_event)
 */
inline val <C : Document> C.dropEvent: EventInstance<DragEvent, C, Node>
    get() = EventInstance(this, "drop")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/enterpictureinpicture_event)
 */
inline val <C : Document> C.enterPictureInPictureEvent: EventInstance<PictureInPictureEvent, C, Node>
    get() = EventInstance(this, "enterpictureinpicture")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/focusin_event)
 */
inline val <C : Document> C.focusInEvent: EventInstance<FocusEvent, C, Node>
    get() = EventInstance(this, "focusin")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/focusout_event)
 */
inline val <C : Document> C.focusOutEvent: EventInstance<FocusEvent, C, Node>
    get() = EventInstance(this, "focusout")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/formdata_event)
 */
inline val <C : Document> C.formDataEvent: EventInstance<FormDataEvent, C, Node>
    get() = EventInstance(this, "formdata")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/fullscreenchange_event)
 */
inline val <C : Document> C.fullscreenChangeEvent: EventInstance<Event, C, Node>
    get() = EventInstance(this, "fullscreenchange")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/fullscreenerror_event)
 */
inline val <C : Document> C.fullscreenErrorEvent: EventInstance<Event, C, Node>
    get() = EventInstance(this, "fullscreenerror")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/gotpointercapture_event)
 */
inline val <C : Document> C.gotPointerCaptureEvent: EventInstance<PointerEvent, C, Node>
    get() = EventInstance(this, "gotpointercapture")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/input_event)
 */
inline val <C : Document> C.inputEvent: EventInstance<InputEvent, C, Node>
    get() = EventInstance(this, "input")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/keydown_event)
 */
inline val <C : Document> C.keyDownEvent: EventInstance<KeyboardEvent, C, Node>
    get() = EventInstance(this, "keydown")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/keypress_event)
 */
inline val <C : Document> C.keyPressEvent: EventInstance<KeyboardEvent, C, Node>
    get() = EventInstance(this, "keypress")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/keyup_event)
 */
inline val <C : Document> C.keyUpEvent: EventInstance<KeyboardEvent, C, Node>
    get() = EventInstance(this, "keyup")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/leavepictureinpicture_event)
 */
inline val <C : Document> C.leavePictureInPictureEvent: EventInstance<PictureInPictureEvent, C, Node>
    get() = EventInstance(this, "leavepictureinpicture")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/load_event)
 */
inline val <C : Document> C.loadEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, "load")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/lostpointercapture_event)
 */
inline val <C : Document> C.lostPointerCaptureEvent: EventInstance<PointerEvent, C, Node>
    get() = EventInstance(this, "lostpointercapture")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/mousedown_event)
 */
inline val <C : Document> C.mouseDownEvent: EventInstance<MouseEvent, C, Node>
    get() = EventInstance(this, "mousedown")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/mousemove_event)
 */
inline val <C : Document> C.mouseMoveEvent: EventInstance<MouseEvent, C, Node>
    get() = EventInstance(this, "mousemove")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/mouseout_event)
 */
inline val <C : Document> C.mouseOutEvent: EventInstance<MouseEvent, C, Node>
    get() = EventInstance(this, "mouseout")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/mouseover_event)
 */
inline val <C : Document> C.mouseOverEvent: EventInstance<MouseEvent, C, Node>
    get() = EventInstance(this, "mouseover")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/mouseup_event)
 */
inline val <C : Document> C.mouseUpEvent: EventInstance<MouseEvent, C, Node>
    get() = EventInstance(this, "mouseup")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/paste_event)
 */
inline val <C : Document> C.pasteEvent: EventInstance<ClipboardEvent, C, Node>
    get() = EventInstance(this, "paste")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/pointercancel_event)
 */
inline val <C : Document> C.pointerCancelEvent: EventInstance<PointerEvent, C, Node>
    get() = EventInstance(this, "pointercancel")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/pointerdown_event)
 */
inline val <C : Document> C.pointerDownEvent: EventInstance<PointerEvent, C, Node>
    get() = EventInstance(this, "pointerdown")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/pointerenter_event)
 */
inline val <C : Document> C.pointerEnterEvent: EventInstance<PointerEvent, C, C>
    get() = EventInstance(this, "pointerenter")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/pointerleave_event)
 */
inline val <C : Document> C.pointerLeaveEvent: EventInstance<PointerEvent, C, C>
    get() = EventInstance(this, "pointerleave")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/pointerlockchange_event)
 */
inline val <C : Document> C.pointerLockChangeEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, "pointerlockchange")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/pointerlockerror_event)
 */
inline val <C : Document> C.pointerLockErrorEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, "pointerlockerror")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/pointermove_event)
 */
inline val <C : Document> C.pointerMoveEvent: EventInstance<PointerEvent, C, Node>
    get() = EventInstance(this, "pointermove")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/pointerout_event)
 */
inline val <C : Document> C.pointerOutEvent: EventInstance<PointerEvent, C, Node>
    get() = EventInstance(this, "pointerout")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/pointerover_event)
 */
inline val <C : Document> C.pointerOverEvent: EventInstance<PointerEvent, C, Node>
    get() = EventInstance(this, "pointerover")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/pointerrawupdate_event)
 */
inline val <C : Document> C.pointerRawUpdateEvent: EventInstance<PointerEvent, C, Node>
    get() = EventInstance(this, "pointerrawupdate")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/pointerup_event)
 */
inline val <C : Document> C.pointerUpEvent: EventInstance<PointerEvent, C, Node>
    get() = EventInstance(this, "pointerup")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/readystatechange_event)
 */
inline val <C : Document> C.readyStateChangeEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, "readystatechange")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/reset_event)
 */
inline val <C : Document> C.resetEvent: EventInstance<Event, C, Node>
    get() = EventInstance(this, "reset")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/resume_event)
 */
inline val <C : Document> C.resumeEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, "resume")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/scroll_event)
 */
inline val <C : Document> C.scrollEvent: EventInstance<Event, C, Window>
    get() = EventInstance(this, "scroll")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/scrollend_event)
 */
inline val <C : Document> C.scrollEndEvent: EventInstance<Event, C, Window>
    get() = EventInstance(this, "scrollend")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/select_event)
 */
inline val <C : Document> C.selectEvent: EventInstance<Event, C, Node>
    get() = EventInstance(this, "select")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/selectionchange_event)
 */
inline val <C : Document> C.selectionChangeEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, "selectionchange")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/selectstart_event)
 */
inline val <C : Document> C.selectStartEvent: EventInstance<Event, C, Node>
    get() = EventInstance(this, "selectstart")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/slotchange_event)
 */
inline val <C : Document> C.slotChangeEvent: EventInstance<Event, C, Node>
    get() = EventInstance(this, "slotchange")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/submit_event)
 */
inline val <C : Document> C.submitEvent: EventInstance<SubmitEvent, C, Node>
    get() = EventInstance(this, "submit")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/touchcancel_event)
 */
inline val <C : Document> C.touchCancelEvent: EventInstance<TouchEvent, C, Node>
    get() = EventInstance(this, "touchcancel")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/touchend_event)
 */
inline val <C : Document> C.touchEndEvent: EventInstance<TouchEvent, C, Node>
    get() = EventInstance(this, "touchend")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/touchmove_event)
 */
inline val <C : Document> C.touchMoveEvent: EventInstance<TouchEvent, C, Node>
    get() = EventInstance(this, "touchmove")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/touchstart_event)
 */
inline val <C : Document> C.touchStartEvent: EventInstance<TouchEvent, C, Node>
    get() = EventInstance(this, "touchstart")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/transitioncancel_event)
 */
inline val <C : Document> C.transitionCancelEvent: EventInstance<TransitionEvent, C, Node>
    get() = EventInstance(this, "transitioncancel")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/transitionend_event)
 */
inline val <C : Document> C.transitionEndEvent: EventInstance<TransitionEvent, C, Node>
    get() = EventInstance(this, "transitionend")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/transitionrun_event)
 */
inline val <C : Document> C.transitionRunEvent: EventInstance<TransitionEvent, C, Node>
    get() = EventInstance(this, "transitionrun")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/transitionstart_event)
 */
inline val <C : Document> C.transitionStartEvent: EventInstance<TransitionEvent, C, Node>
    get() = EventInstance(this, "transitionstart")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/unload_event)
 */
inline val <C : Document> C.unloadEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, "unload")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/visibilitychange_event)
 */
inline val <C : Document> C.visibilityChangeEvent: EventInstance<Event, C, Window>
    get() = EventInstance(this, "visibilitychange")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/wheel_event)
 */
inline val <C : Document> C.wheelEvent: EventInstance<WheelEvent, C, Node>
    get() = EventInstance(this, "wheel")

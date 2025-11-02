// Automatically generated - do not modify!

package web.html

import web.cssom.MediaQuery
import web.events.Event
import web.events.EventInstance

/**
 * The **`HTMLSourceElement`** interface provides special properties (beyond the regular HTMLElement object interface it also has available to it by inheritance) for manipulating <source> elements.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLSourceElement)
 */
open external class HTMLSourceElement
protected constructor() :
    HTMLElement {
    /**
     * The **`height`** property of the HTMLSourceElement interface is a non-negative number indicating the height of the image resource in CSS pixels.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLSourceElement/height)
     */
    var height: Int

    /**
     * The **`media`** property of the HTMLSourceElement interface is a string representing the intended destination medium for the resource. The value is a media query, which is a comma separated list of media-types, media-features, and logical operators.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLSourceElement/media)
     */
    var media: MediaQuery

    /**
     * The **`sizes`** property of the HTMLSourceElement interface is a string representing a list of one or more sizes, representing sizes between breakpoints, to which the resource applies.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLSourceElement/sizes)
     */
    var sizes: String

    /**
     * The **`src`** property of the HTMLSourceElement interface is a string indicating the URL of a media resource to use as the source for the element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLSourceElement/src)
     */
    var src: String

    /**
     * The **`srcset`** property of the HTMLSourceElement interface is a string containing a comma-separated list of candidate images.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLSourceElement/srcset)
     */
    var srcset: String

    /**
     * The **`type`** property of the HTMLSourceElement interface is a string representing the MIME type of the media resource.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLSourceElement/type)
     */
    var type: String

    /**
     * The **`width`** property of the HTMLSourceElement interface is a non-negative number indicating the width of the image resource in CSS pixels.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLSourceElement/width)
     */
    var width: Int
}

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLSourceElement/error_event)
 */
inline val <C : HTMLSourceElement> C.errorEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, "error")

// Automatically generated - do not modify!

package web.animations

import web.cssom.CSSNumericValue
import web.dom.Element
import kotlin.js.definedExternally

/**
 * The **`ViewTimeline`** interface of the Web Animations API represents a view progress timeline (see CSS scroll-driven animations for more details).
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ViewTimeline)
 */
open external class ViewTimeline(
    options: ViewTimelineOptions = definedExternally,
) : ScrollTimeline {
    /**
     * The **`endOffset`** read-only property of the ViewTimeline interface returns a CSSNumericValue representing the ending (100% progress) scroll position of the timeline as an offset from the start of the overflowing section of content in the scroller.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ViewTimeline/endOffset)
     */
    val endOffset: CSSNumericValue

    /**
     * The **`startOffset`** read-only property of the ViewTimeline interface returns a CSSNumericValue representing the starting (0% progress) scroll position of the timeline as an offset from the start of the overflowing section of content in the scroller.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ViewTimeline/startOffset)
     */
    val startOffset: CSSNumericValue

    /**
     * The **`subject`** read-only property of the ViewTimeline interface returns a reference to the subject element whose visibility within its nearest ancestor scrollable element (scroller) is driving the progress of the timeline.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ViewTimeline/subject)
     */
    val subject: Element
}

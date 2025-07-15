// Automatically generated - do not modify!

package web.animations

import web.dom.Element
import kotlin.js.definedExternally

/**
 * The **`ScrollTimeline`** interface of the Web Animations API represents a scroll progress timeline (see CSS scroll-driven animations for more details).
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ScrollTimeline)
 */
open external class ScrollTimeline(
    options: ScrollTimelineOptions = definedExternally,
) : AnimationTimeline {
    /**
     * The **`axis`** read-only property of the An enumerated value.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ScrollTimeline/axis)
     */
    val axis: ScrollAxis

    /**
     * The **`source`** read-only property of the An Element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ScrollTimeline/source)
     */
    val source: Element?
}

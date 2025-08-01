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
     * The **`axis`** read-only property of the ScrollTimeline interface returns an enumerated value representing the scroll axis that is driving the progress of the timeline.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ScrollTimeline/axis)
     */
    val axis: ScrollAxis

    /**
     * The **`source`** read-only property of the ScrollTimeline interface returns a reference to the scrollable element (_scroller_) whose scroll position is driving the progress of the timeline and therefore the animation.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ScrollTimeline/source)
     */
    val source: Element?
}

@file:JsModule("react-dom/test-utils")
@file:JsNonModule

package react.dom.test.utils

import web.events.EventInit

/**
 * Simulate an event dispatch on a DOM node with optional `eventData` event data.
 * `Simulate` has a method for every event that React understands.
 */
external object Simulate {
    val abort: EventSimulator<EventInit>
    val animationEnd: EventSimulator<EventInit>
    val animationIteration: EventSimulator<EventInit>
    val animationStart: EventSimulator<EventInit>
    val blur: EventSimulator<EventInit>
    val canPlay: EventSimulator<EventInit>
    val canPlayThrough: EventSimulator<EventInit>
    val change: EventSimulator<EventInit>
    val click: EventSimulator<EventInit>
    val compositionEnd: EventSimulator<EventInit>
    val compositionStart: EventSimulator<EventInit>
    val compositionUpdate: EventSimulator<EventInit>
    val contextMenu: EventSimulator<EventInit>
    val copy: EventSimulator<EventInit>
    val cut: EventSimulator<EventInit>
    val doubleClick: EventSimulator<EventInit>
    val drag: EventSimulator<EventInit>
    val dragEnd: EventSimulator<EventInit>
    val dragEnter: EventSimulator<EventInit>
    val dragExit: EventSimulator<EventInit>
    val dragLeave: EventSimulator<EventInit>
    val dragOver: EventSimulator<EventInit>
    val dragStart: EventSimulator<EventInit>
    val drop: EventSimulator<EventInit>
    val durationChange: EventSimulator<EventInit>
    val emptied: EventSimulator<EventInit>
    val encrypted: EventSimulator<EventInit>
    val ended: EventSimulator<EventInit>
    val error: EventSimulator<EventInit>
    val focus: EventSimulator<EventInit>
    val input: EventSimulator<EventInit>
    val invalid: EventSimulator<EventInit>
    val keyDown: EventSimulator<EventInit>
    val keyPress: EventSimulator<EventInit>
    val keyUp: EventSimulator<EventInit>
    val load: EventSimulator<EventInit>
    val loadStart: EventSimulator<EventInit>
    val loadedData: EventSimulator<EventInit>
    val loadedMetadata: EventSimulator<EventInit>
    val mouseDown: EventSimulator<EventInit>
    val mouseEnter: EventSimulator<EventInit>
    val mouseLeave: EventSimulator<EventInit>
    val mouseMove: EventSimulator<EventInit>
    val mouseOut: EventSimulator<EventInit>
    val mouseOver: EventSimulator<EventInit>
    val mouseUp: EventSimulator<EventInit>
    val paste: EventSimulator<EventInit>
    val pause: EventSimulator<EventInit>
    val play: EventSimulator<EventInit>
    val playing: EventSimulator<EventInit>
    val progress: EventSimulator<EventInit>
    val rateChange: EventSimulator<EventInit>
    val scroll: EventSimulator<EventInit>
    val seeked: EventSimulator<EventInit>
    val seeking: EventSimulator<EventInit>
    val select: EventSimulator<EventInit>
    val stalled: EventSimulator<EventInit>
    val submit: EventSimulator<EventInit>
    val suspend: EventSimulator<EventInit>
    val timeUpdate: EventSimulator<EventInit>
    val touchCancel: EventSimulator<EventInit>
    val touchEnd: EventSimulator<EventInit>
    val touchMove: EventSimulator<EventInit>
    val touchStart: EventSimulator<EventInit>
    val transitionEnd: EventSimulator<EventInit>
    val volumeChange: EventSimulator<EventInit>
    val waiting: EventSimulator<EventInit>
    val wheel: EventSimulator<EventInit>
}

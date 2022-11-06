// Automatically generated - do not modify!

package dom

import dom.events.*
import web.animations.AnimationEvent
import web.csp.SecurityPolicyViolationEvent
import web.events.Event
import web.events.ProgressEvent

external interface GlobalEventHandlers {
    /**
     * Fires when the user aborts the download.
     * @param ev The event.
     */
    var onabort: ((event: UIEvent) -> Unit)?
    var onanimationcancel: ((event: AnimationEvent) -> Unit)?
    var onanimationend: ((event: AnimationEvent) -> Unit)?
    var onanimationiteration: ((event: AnimationEvent) -> Unit)?
    var onanimationstart: ((event: AnimationEvent) -> Unit)?
    var onauxclick: ((event: MouseEvent) -> Unit)?

    /**
     * Fires when the object loses the input focus.
     * @param ev The focus event.
     */
    var onblur: ((event: FocusEvent) -> Unit)?

    /**
     * Occurs when playback is possible, but would require further buffering.
     * @param ev The event.
     */
    var oncanplay: ((event: Event) -> Unit)?
    var oncanplaythrough: ((event: Event) -> Unit)?

    /**
     * Fires when the contents of the object or selection have changed.
     * @param ev The event.
     */
    var onchange: ((event: Event) -> Unit)?

    /**
     * Fires when the user clicks the left mouse button on the object
     * @param ev The mouse event.
     */
    var onclick: ((event: MouseEvent) -> Unit)?
    var onclose: ((event: Event) -> Unit)?

    /**
     * Fires when the user clicks the right mouse button in the client area, opening the context menu.
     * @param ev The mouse event.
     */
    var oncontextmenu: ((event: MouseEvent) -> Unit)?
    var oncuechange: ((event: Event) -> Unit)?

    /**
     * Fires when the user double-clicks the object.
     * @param ev The mouse event.
     */
    var ondblclick: ((event: MouseEvent) -> Unit)?

    /**
     * Fires on the source object continuously during a drag operation.
     * @param ev The event.
     */
    var ondrag: ((event: DragEvent) -> Unit)?

    /**
     * Fires on the source object when the user releases the mouse at the close of a drag operation.
     * @param ev The event.
     */
    var ondragend: ((event: DragEvent) -> Unit)?

    /**
     * Fires on the target element when the user drags the object to a valid drop target.
     * @param ev The drag event.
     */
    var ondragenter: ((event: DragEvent) -> Unit)?

    /**
     * Fires on the target object when the user moves the mouse out of a valid drop target during a drag operation.
     * @param ev The drag event.
     */
    var ondragleave: ((event: DragEvent) -> Unit)?

    /**
     * Fires on the target element continuously while the user drags the object over a valid drop target.
     * @param ev The event.
     */
    var ondragover: ((event: DragEvent) -> Unit)?

    /**
     * Fires on the source object when the user starts to drag a text selection or selected object.
     * @param ev The event.
     */
    var ondragstart: ((event: DragEvent) -> Unit)?
    var ondrop: ((event: DragEvent) -> Unit)?

    /**
     * Occurs when the duration attribute is updated.
     * @param ev The event.
     */
    var ondurationchange: ((event: Event) -> Unit)?

    /**
     * Occurs when the media element is reset to its initial state.
     * @param ev The event.
     */
    var onemptied: ((event: Event) -> Unit)?

    /**
     * Occurs when the end of playback is reached.
     * @param ev The event
     */
    var onended: ((event: Event) -> Unit)?

    /**
     * Fires when an error occurs during object loading.
     * @param ev The event.
     */
    var onerror: Any? /* OnErrorEventHandler */

    /**
     * Fires when the object receives focus.
     * @param ev The event.
     */
    var onfocus: ((event: FocusEvent) -> Unit)?
    var onformdata: ((event: FormDataEvent) -> Unit)?
    var ongotpointercapture: ((event: PointerEvent) -> Unit)?
    var oninput: ((event: Event) -> Unit)?
    var oninvalid: ((event: Event) -> Unit)?

    /**
     * Fires when the user presses a key.
     * @param ev The keyboard event
     */
    var onkeydown: ((event: KeyboardEvent) -> Unit)?

    /**
     * Fires when the user releases a key.
     * @param ev The keyboard event
     */
    var onkeyup: ((event: KeyboardEvent) -> Unit)?

    /**
     * Fires immediately after the browser loads the object.
     * @param ev The event.
     */
    var onload: ((event: Event) -> Unit)?

    /**
     * Occurs when media data is loaded at the current playback position.
     * @param ev The event.
     */
    var onloadeddata: ((event: Event) -> Unit)?

    /**
     * Occurs when the duration and dimensions of the media have been determined.
     * @param ev The event.
     */
    var onloadedmetadata: ((event: Event) -> Unit)?

    /**
     * Occurs when Internet Explorer begins looking for media data.
     * @param ev The event.
     */
    var onloadstart: ((event: Event) -> Unit)?
    var onlostpointercapture: ((event: PointerEvent) -> Unit)?

    /**
     * Fires when the user clicks the object with either mouse button.
     * @param ev The mouse event.
     */
    var onmousedown: ((event: MouseEvent) -> Unit)?
    var onmouseenter: ((event: MouseEvent) -> Unit)?
    var onmouseleave: ((event: MouseEvent) -> Unit)?

    /**
     * Fires when the user moves the mouse over the object.
     * @param ev The mouse event.
     */
    var onmousemove: ((event: MouseEvent) -> Unit)?

    /**
     * Fires when the user moves the mouse pointer outside the boundaries of the object.
     * @param ev The mouse event.
     */
    var onmouseout: ((event: MouseEvent) -> Unit)?

    /**
     * Fires when the user moves the mouse pointer into the object.
     * @param ev The mouse event.
     */
    var onmouseover: ((event: MouseEvent) -> Unit)?

    /**
     * Fires when the user releases a mouse button while the mouse is over the object.
     * @param ev The mouse event.
     */
    var onmouseup: ((event: MouseEvent) -> Unit)?

    /**
     * Occurs when playback is paused.
     * @param ev The event.
     */
    var onpause: ((event: Event) -> Unit)?

    /**
     * Occurs when the play method is requested.
     * @param ev The event.
     */
    var onplay: ((event: Event) -> Unit)?

    /**
     * Occurs when the audio or video has started playing.
     * @param ev The event.
     */
    var onplaying: ((event: Event) -> Unit)?
    var onpointercancel: ((event: PointerEvent) -> Unit)?
    var onpointerdown: ((event: PointerEvent) -> Unit)?
    var onpointerenter: ((event: PointerEvent) -> Unit)?
    var onpointerleave: ((event: PointerEvent) -> Unit)?
    var onpointermove: ((event: PointerEvent) -> Unit)?
    var onpointerout: ((event: PointerEvent) -> Unit)?
    var onpointerover: ((event: PointerEvent) -> Unit)?
    var onpointerup: ((event: PointerEvent) -> Unit)?

    /**
     * Occurs to indicate progress while downloading media data.
     * @param ev The event.
     */
    var onprogress: ((event: ProgressEvent) -> Unit)?

    /**
     * Occurs when the playback rate is increased or decreased.
     * @param ev The event.
     */
    var onratechange: ((event: Event) -> Unit)?

    /**
     * Fires when the user resets a form.
     * @param ev The event.
     */
    var onreset: ((event: Event) -> Unit)?
    var onresize: ((event: UIEvent) -> Unit)?

    /**
     * Fires when the user repositions the scroll box in the scroll bar on the object.
     * @param ev The event.
     */
    var onscroll: ((event: Event) -> Unit)?
    var onsecuritypolicyviolation: ((event: SecurityPolicyViolationEvent) -> Unit)?

    /**
     * Occurs when the seek operation ends.
     * @param ev The event.
     */
    var onseeked: ((event: Event) -> Unit)?

    /**
     * Occurs when the current playback position is moved.
     * @param ev The event.
     */
    var onseeking: ((event: Event) -> Unit)?

    /**
     * Fires when the current selection changes.
     * @param ev The event.
     */
    var onselect: ((event: Event) -> Unit)?
    var onselectionchange: ((event: Event) -> Unit)?
    var onselectstart: ((event: Event) -> Unit)?
    var onslotchange: ((event: Event) -> Unit)?

    /**
     * Occurs when the download has stopped.
     * @param ev The event.
     */
    var onstalled: ((event: Event) -> Unit)?
    var onsubmit: ((event: SubmitEvent) -> Unit)?

    /**
     * Occurs if the load operation has been intentionally halted.
     * @param ev The event.
     */
    var onsuspend: ((event: Event) -> Unit)?

    /**
     * Occurs to indicate the current playback position.
     * @param ev The event.
     */
    var ontimeupdate: ((event: Event) -> Unit)?
    var ontoggle: ((event: Event) -> Unit)?
    var ontouchcancel: ((event: TouchEvent) -> Unit)?
    var ontouchend: ((event: TouchEvent) -> Unit)?
    var ontouchmove: ((event: TouchEvent) -> Unit)?
    var ontouchstart: ((event: TouchEvent) -> Unit)?
    var ontransitioncancel: ((event: TransitionEvent) -> Unit)?
    var ontransitionend: ((event: TransitionEvent) -> Unit)?
    var ontransitionrun: ((event: TransitionEvent) -> Unit)?
    var ontransitionstart: ((event: TransitionEvent) -> Unit)?

    /**
     * Occurs when the volume is changed, or playback is muted or unmuted.
     * @param ev The event.
     */
    var onvolumechange: ((event: Event) -> Unit)?

    /**
     * Occurs when playback stops because the next frame of a video resource is not available.
     * @param ev The event.
     */
    var onwaiting: ((event: Event) -> Unit)?
    var onwheel: ((event: WheelEvent) -> Unit)?
}

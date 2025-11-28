// Automatically generated - do not modify!

@file:Suppress(
    "INTERFACE_WITH_SUPERCLASS",
)

package web.dom

import js.function.JsFunction
import web.animations.AnimationEvent
import web.clipboard.ClipboardEvent
import web.csp.SecurityPolicyViolationEvent
import web.cssom.TransitionEvent
import web.dnd.DragEvent
import web.events.Event
import web.events.EventHandler
import web.events.EventTarget
import web.events.ProgressEvent
import web.focus.FocusEvent
import web.form.FormDataEvent
import web.form.SubmitEvent
import web.input.InputEvent
import web.keyboard.KeyboardEvent
import web.mouse.MouseEvent
import web.mouse.WheelEvent
import web.pointer.PointerEvent
import web.popover.ToggleEvent
import web.touch.TouchEvent
import web.uievents.UIEvent
import kotlin.js.definedExternally

/* mixin */
external interface GlobalEventHandlers :
    EventTarget {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/abort_event)
     */
    var onabort: EventHandler<UIEvent, GlobalEventHandlers, GlobalEventHandlers>?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/animationcancel_event)
     */
    var onanimationcancel: EventHandler<AnimationEvent, GlobalEventHandlers, Node>?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/animationend_event)
     */
    var onanimationend: EventHandler<AnimationEvent, GlobalEventHandlers, Node>?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/animationiteration_event)
     */
    var onanimationiteration: EventHandler<AnimationEvent, GlobalEventHandlers, Node>?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/animationstart_event)
     */
    var onanimationstart: EventHandler<AnimationEvent, GlobalEventHandlers, Node>?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/auxclick_event)
     */
    var onauxclick: EventHandler<PointerEvent, GlobalEventHandlers, Node>?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/beforeinput_event)
     */
    var onbeforeinput: EventHandler<InputEvent, GlobalEventHandlers, Node>?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/beforematch_event)
     */
    var onbeforematch: EventHandler<Event, GlobalEventHandlers, Node>?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/beforetoggle_event)
     */
    var onbeforetoggle: EventHandler<ToggleEvent, GlobalEventHandlers, GlobalEventHandlers>?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/blur_event)
     */
    var onblur: EventHandler<FocusEvent, GlobalEventHandlers, GlobalEventHandlers>?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLDialogElement/cancel_event)
     */
    var oncancel: EventHandler<Event, GlobalEventHandlers, GlobalEventHandlers>?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/canplay_event)
     */
    var oncanplay: EventHandler<Event, GlobalEventHandlers, GlobalEventHandlers>?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/canplaythrough_event)
     */
    var oncanplaythrough: EventHandler<Event, GlobalEventHandlers, GlobalEventHandlers>?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/change_event)
     */
    var onchange: EventHandler<Event, GlobalEventHandlers, Node>?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/click_event)
     */
    var onclick: EventHandler<PointerEvent, GlobalEventHandlers, Node>?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLDialogElement/close_event)
     */
    var onclose: EventHandler<Event, GlobalEventHandlers, GlobalEventHandlers>?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/command_event)
     */
    var oncommand: EventHandler<Event, GlobalEventHandlers, GlobalEventHandlers>?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLCanvasElement/contextlost_event)
     */
    var oncontextlost: EventHandler<Event, GlobalEventHandlers, GlobalEventHandlers>?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/contextmenu_event)
     */
    var oncontextmenu: EventHandler<PointerEvent, GlobalEventHandlers, Node>?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLCanvasElement/contextrestored_event)
     */
    var oncontextrestored: EventHandler<Event, GlobalEventHandlers, GlobalEventHandlers>?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/copy_event)
     */
    var oncopy: EventHandler<ClipboardEvent, GlobalEventHandlers, Node>?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTrackElement/cuechange_event)
     */
    var oncuechange: EventHandler<Event, GlobalEventHandlers, GlobalEventHandlers>?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/cut_event)
     */
    var oncut: EventHandler<ClipboardEvent, GlobalEventHandlers, Node>?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/dblclick_event)
     */
    var ondblclick: EventHandler<MouseEvent, GlobalEventHandlers, Node>?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/drag_event)
     */
    var ondrag: EventHandler<DragEvent, GlobalEventHandlers, Node>?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/dragend_event)
     */
    var ondragend: EventHandler<DragEvent, GlobalEventHandlers, Node>?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/dragenter_event)
     */
    var ondragenter: EventHandler<DragEvent, GlobalEventHandlers, Node>?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/dragleave_event)
     */
    var ondragleave: EventHandler<DragEvent, GlobalEventHandlers, Node>?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/dragover_event)
     */
    var ondragover: EventHandler<DragEvent, GlobalEventHandlers, Node>?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/dragstart_event)
     */
    var ondragstart: EventHandler<DragEvent, GlobalEventHandlers, Node>?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/drop_event)
     */
    var ondrop: EventHandler<DragEvent, GlobalEventHandlers, Node>?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/durationchange_event)
     */
    var ondurationchange: EventHandler<Event, GlobalEventHandlers, GlobalEventHandlers>?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/emptied_event)
     */
    var onemptied: EventHandler<Event, GlobalEventHandlers, GlobalEventHandlers>?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/ended_event)
     */
    var onended: EventHandler<Event, GlobalEventHandlers, GlobalEventHandlers>?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/error_event)
     */
    var onerror: JsFunction<*, *>? /* OnErrorEventHandler */
        get() = definedExternally
        set(value) = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/focus_event)
     */
    var onfocus: EventHandler<FocusEvent, GlobalEventHandlers, GlobalEventHandlers>?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLFormElement/formdata_event)
     */
    var onformdata: EventHandler<FormDataEvent, GlobalEventHandlers, Node>?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/gotpointercapture_event)
     */
    var ongotpointercapture: EventHandler<PointerEvent, GlobalEventHandlers, Node>?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/input_event)
     */
    var oninput: EventHandler<InputEvent, GlobalEventHandlers, Node>?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLInputElement/invalid_event)
     */
    var oninvalid: EventHandler<Event, GlobalEventHandlers, GlobalEventHandlers>?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/keydown_event)
     */
    var onkeydown: EventHandler<KeyboardEvent, GlobalEventHandlers, Node>?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/keyup_event)
     */
    var onkeyup: EventHandler<KeyboardEvent, GlobalEventHandlers, Node>?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/load_event)
     */
    var onload: EventHandler<Event, GlobalEventHandlers, GlobalEventHandlers>?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/loadeddata_event)
     */
    var onloadeddata: EventHandler<Event, GlobalEventHandlers, GlobalEventHandlers>?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/loadedmetadata_event)
     */
    var onloadedmetadata: EventHandler<Event, GlobalEventHandlers, GlobalEventHandlers>?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/loadstart_event)
     */
    var onloadstart: EventHandler<Event, GlobalEventHandlers, GlobalEventHandlers>?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/lostpointercapture_event)
     */
    var onlostpointercapture: EventHandler<PointerEvent, GlobalEventHandlers, Node>?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/mousedown_event)
     */
    var onmousedown: EventHandler<MouseEvent, GlobalEventHandlers, Node>?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/mouseenter_event)
     */
    var onmouseenter: EventHandler<MouseEvent, GlobalEventHandlers, GlobalEventHandlers>?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/mouseleave_event)
     */
    var onmouseleave: EventHandler<MouseEvent, GlobalEventHandlers, GlobalEventHandlers>?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/mousemove_event)
     */
    var onmousemove: EventHandler<MouseEvent, GlobalEventHandlers, Node>?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/mouseout_event)
     */
    var onmouseout: EventHandler<MouseEvent, GlobalEventHandlers, Node>?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/mouseover_event)
     */
    var onmouseover: EventHandler<MouseEvent, GlobalEventHandlers, Node>?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/mouseup_event)
     */
    var onmouseup: EventHandler<MouseEvent, GlobalEventHandlers, Node>?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/paste_event)
     */
    var onpaste: EventHandler<ClipboardEvent, GlobalEventHandlers, Node>?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/pause_event)
     */
    var onpause: EventHandler<Event, GlobalEventHandlers, GlobalEventHandlers>?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/play_event)
     */
    var onplay: EventHandler<Event, GlobalEventHandlers, GlobalEventHandlers>?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/playing_event)
     */
    var onplaying: EventHandler<Event, GlobalEventHandlers, GlobalEventHandlers>?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/pointercancel_event)
     */
    var onpointercancel: EventHandler<PointerEvent, GlobalEventHandlers, Node>?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/pointerdown_event)
     */
    var onpointerdown: EventHandler<PointerEvent, GlobalEventHandlers, Node>?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/pointerenter_event)
     */
    var onpointerenter: EventHandler<PointerEvent, GlobalEventHandlers, GlobalEventHandlers>?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/pointerleave_event)
     */
    var onpointerleave: EventHandler<PointerEvent, GlobalEventHandlers, GlobalEventHandlers>?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/pointermove_event)
     */
    var onpointermove: EventHandler<PointerEvent, GlobalEventHandlers, Node>?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/pointerout_event)
     */
    var onpointerout: EventHandler<PointerEvent, GlobalEventHandlers, Node>?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/pointerover_event)
     */
    var onpointerover: EventHandler<PointerEvent, GlobalEventHandlers, Node>?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * Available only in secure contexts.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/pointerrawupdate_event)
     */
    var onpointerrawupdate: EventHandler<Event, GlobalEventHandlers, Node>?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/pointerup_event)
     */
    var onpointerup: EventHandler<PointerEvent, GlobalEventHandlers, Node>?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/progress_event)
     */
    var onprogress: EventHandler<ProgressEvent, GlobalEventHandlers, GlobalEventHandlers>?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/ratechange_event)
     */
    var onratechange: EventHandler<Event, GlobalEventHandlers, GlobalEventHandlers>?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLFormElement/reset_event)
     */
    var onreset: EventHandler<Event, GlobalEventHandlers, Node>?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLVideoElement/resize_event)
     */
    var onresize: EventHandler<UIEvent, GlobalEventHandlers, GlobalEventHandlers>?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/scroll_event)
     */
    var onscroll: EventHandler<Event, GlobalEventHandlers, GlobalEventHandlers>?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/scrollend_event)
     */
    var onscrollend: EventHandler<Event, GlobalEventHandlers, GlobalEventHandlers>?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/securitypolicyviolation_event)
     */
    var onsecuritypolicyviolation: EventHandler<SecurityPolicyViolationEvent, GlobalEventHandlers, Node>?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/seeked_event)
     */
    var onseeked: EventHandler<Event, GlobalEventHandlers, GlobalEventHandlers>?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/seeking_event)
     */
    var onseeking: EventHandler<Event, GlobalEventHandlers, GlobalEventHandlers>?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLInputElement/select_event)
     */
    var onselect: EventHandler<Event, GlobalEventHandlers, Node>?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/selectionchange_event)
     */
    var onselectionchange: EventHandler<Event, GlobalEventHandlers, GlobalEventHandlers>?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Node/selectstart_event)
     */
    var onselectstart: EventHandler<Event, GlobalEventHandlers, Node>?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLSlotElement/slotchange_event)
     */
    var onslotchange: EventHandler<Event, GlobalEventHandlers, Node>?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/stalled_event)
     */
    var onstalled: EventHandler<Event, GlobalEventHandlers, GlobalEventHandlers>?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLFormElement/submit_event)
     */
    var onsubmit: EventHandler<SubmitEvent, GlobalEventHandlers, Node>?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/suspend_event)
     */
    var onsuspend: EventHandler<Event, GlobalEventHandlers, GlobalEventHandlers>?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/timeupdate_event)
     */
    var ontimeupdate: EventHandler<Event, GlobalEventHandlers, GlobalEventHandlers>?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/toggle_event)
     */
    var ontoggle: EventHandler<ToggleEvent, GlobalEventHandlers, GlobalEventHandlers>?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/touchcancel_event)
     */
    var ontouchcancel: EventHandler<TouchEvent, GlobalEventHandlers, Node>?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/touchend_event)
     */
    var ontouchend: EventHandler<TouchEvent, GlobalEventHandlers, Node>?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/touchmove_event)
     */
    var ontouchmove: EventHandler<TouchEvent, GlobalEventHandlers, Node>?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/touchstart_event)
     */
    var ontouchstart: EventHandler<TouchEvent, GlobalEventHandlers, Node>?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/transitioncancel_event)
     */
    var ontransitioncancel: EventHandler<TransitionEvent, GlobalEventHandlers, Node>?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/transitionend_event)
     */
    var ontransitionend: EventHandler<TransitionEvent, GlobalEventHandlers, Node>?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/transitionrun_event)
     */
    var ontransitionrun: EventHandler<TransitionEvent, GlobalEventHandlers, Node>?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/transitionstart_event)
     */
    var ontransitionstart: EventHandler<TransitionEvent, GlobalEventHandlers, Node>?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/volumechange_event)
     */
    var onvolumechange: EventHandler<Event, GlobalEventHandlers, GlobalEventHandlers>?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/waiting_event)
     */
    var onwaiting: EventHandler<Event, GlobalEventHandlers, GlobalEventHandlers>?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/wheel_event)
     */
    var onwheel: EventHandler<WheelEvent, GlobalEventHandlers, Node>?
        get() = definedExternally
        set(value) = definedExternally
}

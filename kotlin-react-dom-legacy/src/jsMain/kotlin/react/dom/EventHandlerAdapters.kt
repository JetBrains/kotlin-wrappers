package react.dom

import js.reflect.unsafeCast
import kotlinx.html.CommonAttributeGroupFacade
import react.dom.events.*

// Clipboard Events

var CommonAttributeGroupFacade.onCopy: ClipboardEventHandler<*>
    @Deprecated("Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")
    set(value) {
        onEvent("oncopy", value)
    }

var CommonAttributeGroupFacade.onCopyCapture: ClipboardEventHandler<*>
    @Deprecated("Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")
    set(value) {
        onEvent("oncopycapture", value)
    }

var CommonAttributeGroupFacade.onCut: ClipboardEventHandler<*>
    @Deprecated("Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")
    set(value) {
        onEvent("oncut", value)
    }

var CommonAttributeGroupFacade.onCutCapture: ClipboardEventHandler<*>
    @Deprecated("Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")
    set(value) {
        onEvent("oncutcapture", value)
    }

var CommonAttributeGroupFacade.onPaste: ClipboardEventHandler<*>
    @Deprecated("Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")
    set(value) {
        onEvent("onpaste", value)
    }

var CommonAttributeGroupFacade.onPasteCapture: ClipboardEventHandler<*>
    @Deprecated("Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")
    set(value) {
        onEvent("onpastecapture", value)
    }

// Composition Events

var CommonAttributeGroupFacade.onCompositionEnd: CompositionEventHandler<*>
    @Deprecated("Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")
    set(value) {
        onEvent("oncompositionend", value)
    }

var CommonAttributeGroupFacade.onCompositionEndCapture: CompositionEventHandler<*>
    @Deprecated("Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")
    set(value) {
        onEvent("oncompositionendcapture", value)
    }

var CommonAttributeGroupFacade.onCompositionStart: CompositionEventHandler<*>
    @Deprecated("Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")
    set(value) {
        onEvent("oncompositionstart", value)
    }

var CommonAttributeGroupFacade.onCompositionStartCapture: CompositionEventHandler<*>
    @Deprecated("Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")
    set(value) {
        onEvent("oncompositionstartcapture", value)
    }

var CommonAttributeGroupFacade.onCompositionUpdate: CompositionEventHandler<*>
    @Deprecated("Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")
    set(value) {
        onEvent("oncompositionupdate", value)
    }

var CommonAttributeGroupFacade.onCompositionUpdateCapture: CompositionEventHandler<*>
    @Deprecated("Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")
    set(value) {
        onEvent("oncompositionupdatecapture", value)
    }

// Focus Events

var CommonAttributeGroupFacade.onFocus: FocusEventHandler<*>
    @Deprecated("Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")
    set(value) {
        onEvent("onfocus", value)
    }

var CommonAttributeGroupFacade.onFocusCapture: FocusEventHandler<*>
    @Deprecated("Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")
    set(value) {
        onEvent("onfocuscapture", value)
    }

var CommonAttributeGroupFacade.onBlur: FocusEventHandler<*>
    @Deprecated("Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")
    set(value) {
        onEvent("onblur", value)
    }

var CommonAttributeGroupFacade.onBlurCapture: FocusEventHandler<*>
    @Deprecated("Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")
    set(value) {
        onEvent("onblurcapture", value)
    }

// form related Events

var CommonAttributeGroupFacade.onChange: ChangeEventHandler<*, *>
    @Deprecated("Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")
    set(value) {
        onEvent("onchange", value)
    }

var CommonAttributeGroupFacade.onChangeCapture: ChangeEventHandler<*, *>
    @Deprecated("Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")
    set(value) {
        onEvent("onchangecapture", value)
    }

var CommonAttributeGroupFacade.onBeforeInput: InputEventHandler<*>
    @Deprecated("Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")
    set(value) {
        onEvent("onbeforeinput", value)
    }

var CommonAttributeGroupFacade.onBeforeInputCapture: InputEventHandler<*>
    @Deprecated("Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")
    set(value) {
        onEvent("onbeforeinputcapture", value)
    }

var CommonAttributeGroupFacade.onInput: InputEventHandler<*>
    @Deprecated("Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")
    set(value) {
        onEvent("oninput", value)
    }

var CommonAttributeGroupFacade.onInputCapture: InputEventHandler<*>
    @Deprecated("Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")
    set(value) {
        onEvent("oninputcapture", value)
    }

var CommonAttributeGroupFacade.onReset: ReactEventHandler<*>
    @Deprecated("Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")
    set(value) {
        onEvent("onreset", value)
    }

var CommonAttributeGroupFacade.onResetCapture: ReactEventHandler<*>
    @Deprecated("Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")
    set(value) {
        onEvent("onresetcapture", value)
    }

var CommonAttributeGroupFacade.onSubmit: SubmitEventHandler<*>
    @Deprecated("Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")
    set(value) {
        onEvent("onsubmit", value)
    }

var CommonAttributeGroupFacade.onSubmitCapture: SubmitEventHandler<*>
    @Deprecated("Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")
    set(value) {
        onEvent("onsubmitcapture", value)
    }

var CommonAttributeGroupFacade.onInvalid: ReactEventHandler<*>
    @Deprecated("Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")
    set(value) {
        onEvent("oninvalid", value)
    }

var CommonAttributeGroupFacade.onInvalidCapture: ReactEventHandler<*>
    @Deprecated("Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")
    set(value) {
        onEvent("oninvalidcapture", value)
    }

// Image Events

var CommonAttributeGroupFacade.onLoad: ReactEventHandler<*>
    @Deprecated("Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")
    set(value) {
        onEvent("onload", value)
    }

var CommonAttributeGroupFacade.onLoadCapture: ReactEventHandler<*>
    @Deprecated("Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")
    set(value) {
        onEvent("onloadcapture", value)
    }

var CommonAttributeGroupFacade.onError: ReactEventHandler<*> // also a Media Event

    @Deprecated("Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")
    set(value) {
        onEvent("onerror", value)
    }

var CommonAttributeGroupFacade.onErrorCapture: ReactEventHandler<*> // also a Media Event

    @Deprecated("Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")
    set(value) {
        onEvent("onerrorcapture", value)
    }

// Keyboard Events

var CommonAttributeGroupFacade.onKeyDown: KeyboardEventHandler<*>
    @Deprecated("Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")
    set(value) {
        onEvent("onkeydown", value)
    }

var CommonAttributeGroupFacade.onKeyDownCapture: KeyboardEventHandler<*>
    @Deprecated("Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")
    set(value) {
        onEvent("onkeydowncapture", value)
    }

var CommonAttributeGroupFacade.onKeyUp: KeyboardEventHandler<*>
    @Deprecated("Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")
    set(value) {
        onEvent("onkeyup", value)
    }

var CommonAttributeGroupFacade.onKeyUpCapture: KeyboardEventHandler<*>
    @Deprecated("Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")
    set(value) {
        onEvent("onkeyupcapture", value)
    }

// Media Events

var CommonAttributeGroupFacade.onAbort: ReactEventHandler<*>
    @Deprecated("Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")
    set(value) {
        onEvent("onabort", value)
    }

var CommonAttributeGroupFacade.onAbortCapture: ReactEventHandler<*>
    @Deprecated("Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")
    set(value) {
        onEvent("onabortcapture", value)
    }

var CommonAttributeGroupFacade.onCanPlay: ReactEventHandler<*>
    @Deprecated("Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")
    set(value) {
        onEvent("oncanplay", value)
    }

var CommonAttributeGroupFacade.onCanPlayCapture: ReactEventHandler<*>
    @Deprecated("Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")
    set(value) {
        onEvent("oncanplaycapture", value)
    }

var CommonAttributeGroupFacade.onCanPlayThrough: ReactEventHandler<*>
    @Deprecated("Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")
    set(value) {
        onEvent("oncanplaythrough", value)
    }

var CommonAttributeGroupFacade.onCanPlayThroughCapture: ReactEventHandler<*>
    @Deprecated("Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")
    set(value) {
        onEvent("oncanplaythroughcapture", value)
    }

var CommonAttributeGroupFacade.onDurationChange: ReactEventHandler<*>
    @Deprecated("Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")
    set(value) {
        onEvent("ondurationchange", value)
    }

var CommonAttributeGroupFacade.onDurationChangeCapture: ReactEventHandler<*>
    @Deprecated("Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")
    set(value) {
        onEvent("ondurationchangecapture", value)
    }

var CommonAttributeGroupFacade.onEmptied: ReactEventHandler<*>
    @Deprecated("Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")
    set(value) {
        onEvent("onemptied", value)
    }

var CommonAttributeGroupFacade.onEmptiedCapture: ReactEventHandler<*>
    @Deprecated("Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")
    set(value) {
        onEvent("onemptiedcapture", value)
    }

var CommonAttributeGroupFacade.onEncrypted: ReactEventHandler<*>
    @Deprecated("Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")
    set(value) {
        onEvent("onencrypted", value)
    }

var CommonAttributeGroupFacade.onEncryptedCapture: ReactEventHandler<*>
    @Deprecated("Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")
    set(value) {
        onEvent("onencryptedcapture", value)
    }

var CommonAttributeGroupFacade.onEnded: ReactEventHandler<*>
    @Deprecated("Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")
    set(value) {
        onEvent("onended", value)
    }

var CommonAttributeGroupFacade.onEndedCapture: ReactEventHandler<*>
    @Deprecated("Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")
    set(value) {
        onEvent("onendedcapture", value)
    }

var CommonAttributeGroupFacade.onLoadedData: ReactEventHandler<*>
    @Deprecated("Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")
    set(value) {
        onEvent("onloadeddata", value)
    }

var CommonAttributeGroupFacade.onLoadedDataCapture: ReactEventHandler<*>
    @Deprecated("Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")
    set(value) {
        onEvent("onloadeddatacapture", value)
    }

var CommonAttributeGroupFacade.onLoadedMetadata: ReactEventHandler<*>
    @Deprecated("Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")
    set(value) {
        onEvent("onloadedmetadata", value)
    }

var CommonAttributeGroupFacade.onLoadedMetadataCapture: ReactEventHandler<*>
    @Deprecated("Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")
    set(value) {
        onEvent("onloadedmetadatacapture", value)
    }

var CommonAttributeGroupFacade.onLoadStart: ReactEventHandler<*>
    @Deprecated("Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")
    set(value) {
        onEvent("onloadstart", value)
    }

var CommonAttributeGroupFacade.onLoadStartCapture: ReactEventHandler<*>
    @Deprecated("Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")
    set(value) {
        onEvent("onloadstartcapture", value)
    }

var CommonAttributeGroupFacade.onPause: ReactEventHandler<*>
    @Deprecated("Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")
    set(value) {
        onEvent("onpause", value)
    }

var CommonAttributeGroupFacade.onPauseCapture: ReactEventHandler<*>
    @Deprecated("Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")
    set(value) {
        onEvent("onpausecapture", value)
    }

var CommonAttributeGroupFacade.onPlay: ReactEventHandler<*>
    @Deprecated("Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")
    set(value) {
        onEvent("onplay", value)
    }

var CommonAttributeGroupFacade.onPlayCapture: ReactEventHandler<*>
    @Deprecated("Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")
    set(value) {
        onEvent("onplaycapture", value)
    }

var CommonAttributeGroupFacade.onPlaying: ReactEventHandler<*>
    @Deprecated("Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")
    set(value) {
        onEvent("onplaying", value)
    }

var CommonAttributeGroupFacade.onPlayingCapture: ReactEventHandler<*>
    @Deprecated("Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")
    set(value) {
        onEvent("onplayingcapture", value)
    }

var CommonAttributeGroupFacade.onProgress: ReactEventHandler<*>
    @Deprecated("Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")
    set(value) {
        onEvent("onprogress", value)
    }

var CommonAttributeGroupFacade.onProgressCapture: ReactEventHandler<*>
    @Deprecated("Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")
    set(value) {
        onEvent("onprogresscapture", value)
    }

var CommonAttributeGroupFacade.onRateChange: ReactEventHandler<*>
    @Deprecated("Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")
    set(value) {
        onEvent("onratechange", value)
    }

var CommonAttributeGroupFacade.onRateChangeCapture: ReactEventHandler<*>
    @Deprecated("Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")
    set(value) {
        onEvent("onratechangecapture", value)
    }

var CommonAttributeGroupFacade.onSeeked: ReactEventHandler<*>
    @Deprecated("Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")
    set(value) {
        onEvent("onseeked", value)
    }

var CommonAttributeGroupFacade.onSeekedCapture: ReactEventHandler<*>
    @Deprecated("Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")
    set(value) {
        onEvent("onseekedcapture", value)
    }

var CommonAttributeGroupFacade.onSeeking: ReactEventHandler<*>
    @Deprecated("Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")
    set(value) {
        onEvent("onseeking", value)
    }

var CommonAttributeGroupFacade.onSeekingCapture: ReactEventHandler<*>
    @Deprecated("Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")
    set(value) {
        onEvent("onseekingcapture", value)
    }

var CommonAttributeGroupFacade.onStalled: ReactEventHandler<*>
    @Deprecated("Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")
    set(value) {
        onEvent("onstalled", value)
    }

var CommonAttributeGroupFacade.onStalledCapture: ReactEventHandler<*>
    @Deprecated("Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")
    set(value) {
        onEvent("onstalledcapture", value)
    }

var CommonAttributeGroupFacade.onSuspend: ReactEventHandler<*>
    @Deprecated("Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")
    set(value) {
        onEvent("onsuspend", value)
    }

var CommonAttributeGroupFacade.onSuspendCapture: ReactEventHandler<*>
    @Deprecated("Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")
    set(value) {
        onEvent("onsuspendcapture", value)
    }

var CommonAttributeGroupFacade.onTimeUpdate: ReactEventHandler<*>
    @Deprecated("Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")
    set(value) {
        onEvent("ontimeupdate", value)
    }

var CommonAttributeGroupFacade.onTimeUpdateCapture: ReactEventHandler<*>
    @Deprecated("Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")
    set(value) {
        onEvent("ontimeupdatecapture", value)
    }

var CommonAttributeGroupFacade.onVolumeChange: ReactEventHandler<*>
    @Deprecated("Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")
    set(value) {
        onEvent("onvolumechange", value)
    }

var CommonAttributeGroupFacade.onVolumeChangeCapture: ReactEventHandler<*>
    @Deprecated("Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")
    set(value) {
        onEvent("onvolumechangecapture", value)
    }

var CommonAttributeGroupFacade.onWaiting: ReactEventHandler<*>
    @Deprecated("Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")
    set(value) {
        onEvent("onwaiting", value)
    }

var CommonAttributeGroupFacade.onWaitingCapture: ReactEventHandler<*>
    @Deprecated("Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")
    set(value) {
        onEvent("onwaitingcapture", value)
    }

// MouseEvents

var CommonAttributeGroupFacade.onAuxClick: MouseEventHandler<*>
    @Deprecated("Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")
    set(value) {
        onEvent("onauxclick", value)
    }

var CommonAttributeGroupFacade.onAuxClickCapture: MouseEventHandler<*>
    @Deprecated("Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")
    set(value) {
        onEvent("onauxclickcapture", value)
    }

var CommonAttributeGroupFacade.onClick: MouseEventHandler<*>
    @Deprecated("Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")
    set(value) {
        onEvent("onclick", value)
    }

var CommonAttributeGroupFacade.onClickCapture: MouseEventHandler<*>
    @Deprecated("Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")
    set(value) {
        onEvent("onclickcapture", value)
    }

var CommonAttributeGroupFacade.onContextMenu: MouseEventHandler<*>
    @Deprecated("Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")
    set(value) {
        onEvent("oncontextmenu", value)
    }

var CommonAttributeGroupFacade.onContextMenuCapture: MouseEventHandler<*>
    @Deprecated("Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")
    set(value) {
        onEvent("oncontextmenucapture", value)
    }

var CommonAttributeGroupFacade.onDoubleClick: MouseEventHandler<*>
    @Deprecated("Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")
    set(value) {
        onEvent("ondoubleclick", value)
    }

var CommonAttributeGroupFacade.onDoubleClickCapture: MouseEventHandler<*>
    @Deprecated("Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")
    set(value) {
        onEvent("ondoubleclickcapture", value)
    }

var CommonAttributeGroupFacade.onDrag: DragEventHandler<*>
    @Deprecated("Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")
    set(value) {
        onEvent("ondrag", value)
    }

var CommonAttributeGroupFacade.onDragCapture: DragEventHandler<*>
    @Deprecated("Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")
    set(value) {
        onEvent("ondragcapture", value)
    }

var CommonAttributeGroupFacade.onDragEnd: DragEventHandler<*>
    @Deprecated("Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")
    set(value) {
        onEvent("ondragend", value)
    }

var CommonAttributeGroupFacade.onDragEndCapture: DragEventHandler<*>
    @Deprecated("Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")
    set(value) {
        onEvent("ondragendcapture", value)
    }

var CommonAttributeGroupFacade.onDragEnter: DragEventHandler<*>
    @Deprecated("Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")
    set(value) {
        onEvent("ondragenter", value)
    }

var CommonAttributeGroupFacade.onDragEnterCapture: DragEventHandler<*>
    @Deprecated("Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")
    set(value) {
        onEvent("ondragentercapture", value)
    }

var CommonAttributeGroupFacade.onDragExit: DragEventHandler<*>
    @Deprecated("Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")
    set(value) {
        onEvent("ondragexit", value)
    }

var CommonAttributeGroupFacade.onDragExitCapture: DragEventHandler<*>
    @Deprecated("Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")
    set(value) {
        onEvent("ondragexitcapture", value)
    }

var CommonAttributeGroupFacade.onDragLeave: DragEventHandler<*>
    @Deprecated("Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")
    set(value) {
        onEvent("ondragleave", value)
    }

var CommonAttributeGroupFacade.onDragLeaveCapture: DragEventHandler<*>
    @Deprecated("Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")
    set(value) {
        onEvent("ondragleavecapture", value)
    }

var CommonAttributeGroupFacade.onDragOver: DragEventHandler<*>
    @Deprecated("Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")
    set(value) {
        onEvent("ondragover", value)
    }

var CommonAttributeGroupFacade.onDragOverCapture: DragEventHandler<*>
    @Deprecated("Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")
    set(value) {
        onEvent("ondragovercapture", value)
    }

var CommonAttributeGroupFacade.onDragStart: DragEventHandler<*>
    @Deprecated("Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")
    set(value) {
        onEvent("ondragstart", value)
    }

var CommonAttributeGroupFacade.onDragStartCapture: DragEventHandler<*>
    @Deprecated("Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")
    set(value) {
        onEvent("ondragstartcapture", value)
    }

var CommonAttributeGroupFacade.onDrop: DragEventHandler<*>
    @Deprecated("Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")
    set(value) {
        onEvent("ondrop", value)
    }

var CommonAttributeGroupFacade.onDropCapture: DragEventHandler<*>
    @Deprecated("Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")
    set(value) {
        onEvent("ondropcapture", value)
    }

var CommonAttributeGroupFacade.onMouseDown: MouseEventHandler<*>
    @Deprecated("Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")
    set(value) {
        onEvent("onmousedown", value)
    }

var CommonAttributeGroupFacade.onMouseDownCapture: MouseEventHandler<*>
    @Deprecated("Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")
    set(value) {
        onEvent("onmousedowncapture", value)
    }

var CommonAttributeGroupFacade.onMouseEnter: MouseEventHandler<*>
    @Deprecated("Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")
    set(value) {
        onEvent("onmouseenter", value)
    }

var CommonAttributeGroupFacade.onMouseLeave: MouseEventHandler<*>
    @Deprecated("Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")
    set(value) {
        onEvent("onmouseleave", value)
    }

var CommonAttributeGroupFacade.onMouseMove: MouseEventHandler<*>
    @Deprecated("Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")
    set(value) {
        onEvent("onmousemove", value)
    }

var CommonAttributeGroupFacade.onMouseMoveCapture: MouseEventHandler<*>
    @Deprecated("Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")
    set(value) {
        onEvent("onmousemovecapture", value)
    }

var CommonAttributeGroupFacade.onMouseOut: MouseEventHandler<*>
    @Deprecated("Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")
    set(value) {
        onEvent("onmouseout", value)
    }

var CommonAttributeGroupFacade.onMouseOutCapture: MouseEventHandler<*>
    @Deprecated("Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")
    set(value) {
        onEvent("onmouseoutcapture", value)
    }

var CommonAttributeGroupFacade.onMouseOver: MouseEventHandler<*>
    @Deprecated("Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")
    set(value) {
        onEvent("onmouseover", value)
    }

var CommonAttributeGroupFacade.onMouseOverCapture: MouseEventHandler<*>
    @Deprecated("Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")
    set(value) {
        onEvent("onmouseovercapture", value)
    }

var CommonAttributeGroupFacade.onMouseUp: MouseEventHandler<*>
    @Deprecated("Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")
    set(value) {
        onEvent("onmouseup", value)
    }

var CommonAttributeGroupFacade.onMouseUpCapture: MouseEventHandler<*>
    @Deprecated("Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")
    set(value) {
        onEvent("onmouseupcapture", value)
    }

// Selection Events

var CommonAttributeGroupFacade.onSelect: ReactEventHandler<*>
    @Deprecated("Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")
    set(value) {
        onEvent("onselect", value)
    }

var CommonAttributeGroupFacade.onSelectCapture: ReactEventHandler<*>
    @Deprecated("Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")
    set(value) {
        onEvent("onselectcapture", value)
    }

// Touch Events

var CommonAttributeGroupFacade.onTouchCancel: TouchEventHandler<*>
    @Deprecated("Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")
    set(value) {
        onEvent("ontouchcancel", value)
    }

var CommonAttributeGroupFacade.onTouchCancelCapture: TouchEventHandler<*>
    @Deprecated("Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")
    set(value) {
        onEvent("ontouchcancelcapture", value)
    }

var CommonAttributeGroupFacade.onTouchEnd: TouchEventHandler<*>
    @Deprecated("Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")
    set(value) {
        onEvent("ontouchend", value)
    }

var CommonAttributeGroupFacade.onTouchEndCapture: TouchEventHandler<*>
    @Deprecated("Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")
    set(value) {
        onEvent("ontouchendcapture", value)
    }

var CommonAttributeGroupFacade.onTouchMove: TouchEventHandler<*>
    @Deprecated("Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")
    set(value) {
        onEvent("ontouchmove", value)
    }

var CommonAttributeGroupFacade.onTouchMoveCapture: TouchEventHandler<*>
    @Deprecated("Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")
    set(value) {
        onEvent("ontouchmovecapture", value)
    }

var CommonAttributeGroupFacade.onTouchStart: TouchEventHandler<*>
    @Deprecated("Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")
    set(value) {
        onEvent("ontouchstart", value)
    }

var CommonAttributeGroupFacade.onTouchStartCapture: TouchEventHandler<*>
    @Deprecated("Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")
    set(value) {
        onEvent("ontouchstartcapture", value)
    }

// Pointer Events

var CommonAttributeGroupFacade.onPointerDown: PointerEventHandler<*>
    @Deprecated("Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")
    set(value) {
        onEvent("onpointerdown", value)
    }

var CommonAttributeGroupFacade.onPointerDownCapture: PointerEventHandler<*>
    @Deprecated("Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")
    set(value) {
        onEvent("onpointerdowncapture", value)
    }

var CommonAttributeGroupFacade.onPointerMove: PointerEventHandler<*>
    @Deprecated("Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")
    set(value) {
        onEvent("onpointermove", value)
    }

var CommonAttributeGroupFacade.onPointerMoveCapture: PointerEventHandler<*>
    @Deprecated("Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")
    set(value) {
        onEvent("onpointermovecapture", value)
    }

var CommonAttributeGroupFacade.onPointerUp: PointerEventHandler<*>
    @Deprecated("Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")
    set(value) {
        onEvent("onpointerup", value)
    }

var CommonAttributeGroupFacade.onPointerUpCapture: PointerEventHandler<*>
    @Deprecated("Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")
    set(value) {
        onEvent("onpointerupcapture", value)
    }

var CommonAttributeGroupFacade.onPointerCancel: PointerEventHandler<*>
    @Deprecated("Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")
    set(value) {
        onEvent("onpointercancel", value)
    }

var CommonAttributeGroupFacade.onPointerCancelCapture: PointerEventHandler<*>
    @Deprecated("Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")
    set(value) {
        onEvent("onpointercancelcapture", value)
    }

var CommonAttributeGroupFacade.onPointerEnter: PointerEventHandler<*>
    @Deprecated("Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")
    set(value) {
        onEvent("onpointerenter", value)
    }

var CommonAttributeGroupFacade.onPointerLeave: PointerEventHandler<*>
    @Deprecated("Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")
    set(value) {
        onEvent("onpointerleave", value)
    }

var CommonAttributeGroupFacade.onPointerOver: PointerEventHandler<*>
    @Deprecated("Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")
    set(value) {
        onEvent("onpointerover", value)
    }

var CommonAttributeGroupFacade.onPointerOverCapture: PointerEventHandler<*>
    @Deprecated("Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")
    set(value) {
        onEvent("onpointerovercapture", value)
    }

var CommonAttributeGroupFacade.onPointerOut: PointerEventHandler<*>
    @Deprecated("Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")
    set(value) {
        onEvent("onpointerout", value)
    }

var CommonAttributeGroupFacade.onPointerOutCapture: PointerEventHandler<*>
    @Deprecated("Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")
    set(value) {
        onEvent("onpointeroutcapture", value)
    }

var CommonAttributeGroupFacade.onGotPointerCapture: PointerEventHandler<*>
    @Deprecated("Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")
    set(value) {
        onEvent("ongotpointercapture", value)
    }

var CommonAttributeGroupFacade.onGotPointerCaptureCapture: PointerEventHandler<*>
    @Deprecated("Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")
    set(value) {
        onEvent("ongotpointercapturecapture", value)
    }

var CommonAttributeGroupFacade.onLostPointerCapture: PointerEventHandler<*>
    @Deprecated("Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")
    set(value) {
        onEvent("onlostpointercapture", value)
    }

var CommonAttributeGroupFacade.onLostPointerCaptureCapture: PointerEventHandler<*>
    @Deprecated("Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")
    set(value) {
        onEvent("onlostpointercapturecapture", value)
    }

// UI Events

var CommonAttributeGroupFacade.onScroll: UIEventHandler<*>
    @Deprecated("Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")
    set(value) {
        onEvent("onscroll", value)
    }

var CommonAttributeGroupFacade.onScrollCapture: UIEventHandler<*>
    @Deprecated("Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")
    set(value) {
        onEvent("onscrollcapture", value)
    }

var CommonAttributeGroupFacade.onScrollEnd: UIEventHandler<*>
    @Deprecated("Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")
    set(value) {
        onEvent("onscrollend", value)
    }

var CommonAttributeGroupFacade.onScrollEndCapture: UIEventHandler<*>
    @Deprecated("Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")
    set(value) {
        onEvent("onscrollendcapture", value)
    }

// Wheel Events

var CommonAttributeGroupFacade.onWheel: WheelEventHandler<*>
    @Deprecated("Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")
    set(value) {
        onEvent("onwheel", value)
    }

var CommonAttributeGroupFacade.onWheelCapture: WheelEventHandler<*>
    @Deprecated("Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")
    set(value) {
        onEvent("onwheelcapture", value)
    }

// Animation Events

var CommonAttributeGroupFacade.onAnimationStart: AnimationEventHandler<*>
    @Deprecated("Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")
    set(value) {
        onEvent("onanimationstart", value)
    }

var CommonAttributeGroupFacade.onAnimationStartCapture: AnimationEventHandler<*>
    @Deprecated("Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")
    set(value) {
        onEvent("onanimationstartcapture", value)
    }

var CommonAttributeGroupFacade.onAnimationEnd: AnimationEventHandler<*>
    @Deprecated("Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")
    set(value) {
        onEvent("onanimationend", value)
    }

var CommonAttributeGroupFacade.onAnimationEndCapture: AnimationEventHandler<*>
    @Deprecated("Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")
    set(value) {
        onEvent("onanimationendcapture", value)
    }

var CommonAttributeGroupFacade.onAnimationIteration: AnimationEventHandler<*>
    @Deprecated("Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")
    set(value) {
        onEvent("onanimationiteration", value)
    }

var CommonAttributeGroupFacade.onAnimationIterationCapture: AnimationEventHandler<*>
    @Deprecated("Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")
    set(value) {
        onEvent("onanimationiterationcapture", value)
    }

// Toggle Events

var CommonAttributeGroupFacade.onToggle: ToggleEventHandler<*>
    @Deprecated("Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")
    set(value) {
        onEvent("ontoggle", value)
    }

var CommonAttributeGroupFacade.onBeforeToggle: ToggleEventHandler<*>
    @Deprecated("Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")
    set(value) {
        onEvent("onbeforetoggle", value)
    }

// Transition Events

var CommonAttributeGroupFacade.onTransitionCancel: TransitionEventHandler<*>
    @Deprecated("Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")
    set(value) {
        onEvent("ontransitioncancel", value)
    }

var CommonAttributeGroupFacade.onTransitionCancelCapture: TransitionEventHandler<*>
    @Deprecated("Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")
    set(value) {
        onEvent("ontransitioncancelcapture", value)
    }

var CommonAttributeGroupFacade.onTransitionEnd: TransitionEventHandler<*>
    @Deprecated("Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")
    set(value) {
        onEvent("ontransitionend", value)
    }

var CommonAttributeGroupFacade.onTransitionEndCapture: TransitionEventHandler<*>
    @Deprecated("Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")
    set(value) {
        onEvent("ontransitionendcapture", value)
    }

var CommonAttributeGroupFacade.onTransitionRun: TransitionEventHandler<*>
    @Deprecated("Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")
    set(value) {
        onEvent("ontransitionrun", value)
    }

var CommonAttributeGroupFacade.onTransitionRunCapture: TransitionEventHandler<*>
    @Deprecated("Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")
    set(value) {
        onEvent("ontransitionruncapture", value)
    }

var CommonAttributeGroupFacade.onTransitionStart: TransitionEventHandler<*>
    @Deprecated("Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")
    set(value) {
        onEvent("ontransitionstart", value)
    }

var CommonAttributeGroupFacade.onTransitionStartCapture: TransitionEventHandler<*>
    @Deprecated("Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")
    set(value) {
        onEvent("ontransitionstartcapture", value)
    }

private fun CommonAttributeGroupFacade.onEvent(
    type: String,
    handler: EventHandler<*>,
) {
    consumer.onTagEvent(
        tag = this,
        event = type,
        value = unsafeCast(handler),
    )
}

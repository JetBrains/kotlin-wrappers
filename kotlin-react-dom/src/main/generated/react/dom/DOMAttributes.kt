// Automatically generated - do not modify!

package react.dom

import org.w3c.dom.Element
import react.dom.events.*

external interface DOMAttributes<T : Element> :
    react.PropsWithRef<T>,
    react.PropsWithChildren,
    react.PropsWithClassName {
    var dangerouslySetInnerHTML: DangerouslySetInnerHTML?

    // Clipboard Events
    var onCopy: ClipboardEventHandler<T>?
    var onCopyCapture: ClipboardEventHandler<T>?
    var onCut: ClipboardEventHandler<T>?
    var onCutCapture: ClipboardEventHandler<T>?
    var onPaste: ClipboardEventHandler<T>?
    var onPasteCapture: ClipboardEventHandler<T>?

    // Composition Events
    var onCompositionEnd: CompositionEventHandler<T>?
    var onCompositionEndCapture: CompositionEventHandler<T>?
    var onCompositionStart: CompositionEventHandler<T>?
    var onCompositionStartCapture: CompositionEventHandler<T>?
    var onCompositionUpdate: CompositionEventHandler<T>?
    var onCompositionUpdateCapture: CompositionEventHandler<T>?

    // Focus Events
    var onFocus: FocusEventHandler<T>?
    var onFocusCapture: FocusEventHandler<T>?
    var onBlur: FocusEventHandler<T>?
    var onBlurCapture: FocusEventHandler<T>?

    // Form Events
    // var onChange: FormEventHandler<T>?
    var onChangeCapture: FormEventHandler<T>?
    var onBeforeInput: FormEventHandler<T>?
    var onBeforeInputCapture: FormEventHandler<T>?
    var onInput: FormEventHandler<T>?
    var onInputCapture: FormEventHandler<T>?
    var onReset: FormEventHandler<T>?
    var onResetCapture: FormEventHandler<T>?
    var onSubmit: FormEventHandler<T>?
    var onSubmitCapture: FormEventHandler<T>?
    var onInvalid: FormEventHandler<T>?
    var onInvalidCapture: FormEventHandler<T>?

    // Image Events
    var onLoad: ReactEventHandler<T>?
    var onLoadCapture: ReactEventHandler<T>?
    var onError: ReactEventHandler<T>? // also a Media Event
    var onErrorCapture: ReactEventHandler<T>? // also a Media Event

    // Keyboard Events
    var onKeyDown: KeyboardEventHandler<T>?
    var onKeyDownCapture: KeyboardEventHandler<T>?

    @Deprecated("Will be removed soon!")
    var onKeyPress: KeyboardEventHandler<T>?

    @Deprecated("Will be removed soon!")
    var onKeyPressCapture: KeyboardEventHandler<T>?
    var onKeyUp: KeyboardEventHandler<T>?
    var onKeyUpCapture: KeyboardEventHandler<T>?

    // Media Events
    var onAbort: ReactEventHandler<T>?
    var onAbortCapture: ReactEventHandler<T>?
    var onCanPlay: ReactEventHandler<T>?
    var onCanPlayCapture: ReactEventHandler<T>?
    var onCanPlayThrough: ReactEventHandler<T>?
    var onCanPlayThroughCapture: ReactEventHandler<T>?
    var onDurationChange: ReactEventHandler<T>?
    var onDurationChangeCapture: ReactEventHandler<T>?
    var onEmptied: ReactEventHandler<T>?
    var onEmptiedCapture: ReactEventHandler<T>?
    var onEncrypted: ReactEventHandler<T>?
    var onEncryptedCapture: ReactEventHandler<T>?
    var onEnded: ReactEventHandler<T>?
    var onEndedCapture: ReactEventHandler<T>?
    var onLoadedData: ReactEventHandler<T>?
    var onLoadedDataCapture: ReactEventHandler<T>?
    var onLoadedMetadata: ReactEventHandler<T>?
    var onLoadedMetadataCapture: ReactEventHandler<T>?
    var onLoadStart: ReactEventHandler<T>?
    var onLoadStartCapture: ReactEventHandler<T>?
    var onPause: ReactEventHandler<T>?
    var onPauseCapture: ReactEventHandler<T>?
    var onPlay: ReactEventHandler<T>?
    var onPlayCapture: ReactEventHandler<T>?
    var onPlaying: ReactEventHandler<T>?
    var onPlayingCapture: ReactEventHandler<T>?
    var onProgress: ReactEventHandler<T>?
    var onProgressCapture: ReactEventHandler<T>?
    var onRateChange: ReactEventHandler<T>?
    var onRateChangeCapture: ReactEventHandler<T>?
    var onSeeked: ReactEventHandler<T>?
    var onSeekedCapture: ReactEventHandler<T>?
    var onSeeking: ReactEventHandler<T>?
    var onSeekingCapture: ReactEventHandler<T>?
    var onStalled: ReactEventHandler<T>?
    var onStalledCapture: ReactEventHandler<T>?
    var onSuspend: ReactEventHandler<T>?
    var onSuspendCapture: ReactEventHandler<T>?
    var onTimeUpdate: ReactEventHandler<T>?
    var onTimeUpdateCapture: ReactEventHandler<T>?
    var onVolumeChange: ReactEventHandler<T>?
    var onVolumeChangeCapture: ReactEventHandler<T>?
    var onWaiting: ReactEventHandler<T>?
    var onWaitingCapture: ReactEventHandler<T>?

    // MouseEvents
    var onAuxClick: MouseEventHandler<T>?
    var onAuxClickCapture: MouseEventHandler<T>?
    var onClick: MouseEventHandler<T>?
    var onClickCapture: MouseEventHandler<T>?
    var onContextMenu: MouseEventHandler<T>?
    var onContextMenuCapture: MouseEventHandler<T>?
    var onDoubleClick: MouseEventHandler<T>?
    var onDoubleClickCapture: MouseEventHandler<T>?
    var onDrag: DragEventHandler<T>?
    var onDragCapture: DragEventHandler<T>?
    var onDragEnd: DragEventHandler<T>?
    var onDragEndCapture: DragEventHandler<T>?
    var onDragEnter: DragEventHandler<T>?
    var onDragEnterCapture: DragEventHandler<T>?
    var onDragExit: DragEventHandler<T>?
    var onDragExitCapture: DragEventHandler<T>?
    var onDragLeave: DragEventHandler<T>?
    var onDragLeaveCapture: DragEventHandler<T>?
    var onDragOver: DragEventHandler<T>?
    var onDragOverCapture: DragEventHandler<T>?
    var onDragStart: DragEventHandler<T>?
    var onDragStartCapture: DragEventHandler<T>?
    var onDrop: DragEventHandler<T>?
    var onDropCapture: DragEventHandler<T>?
    var onMouseDown: MouseEventHandler<T>?
    var onMouseDownCapture: MouseEventHandler<T>?
    var onMouseEnter: MouseEventHandler<T>?
    var onMouseLeave: MouseEventHandler<T>?
    var onMouseMove: MouseEventHandler<T>?
    var onMouseMoveCapture: MouseEventHandler<T>?
    var onMouseOut: MouseEventHandler<T>?
    var onMouseOutCapture: MouseEventHandler<T>?
    var onMouseOver: MouseEventHandler<T>?
    var onMouseOverCapture: MouseEventHandler<T>?
    var onMouseUp: MouseEventHandler<T>?
    var onMouseUpCapture: MouseEventHandler<T>?

    // Selection Events
    var onSelect: ReactEventHandler<T>?
    var onSelectCapture: ReactEventHandler<T>?

    // Touch Events
    var onTouchCancel: TouchEventHandler<T>?
    var onTouchCancelCapture: TouchEventHandler<T>?
    var onTouchEnd: TouchEventHandler<T>?
    var onTouchEndCapture: TouchEventHandler<T>?
    var onTouchMove: TouchEventHandler<T>?
    var onTouchMoveCapture: TouchEventHandler<T>?
    var onTouchStart: TouchEventHandler<T>?
    var onTouchStartCapture: TouchEventHandler<T>?

    // Pointer Events
    var onPointerDown: PointerEventHandler<T>?
    var onPointerDownCapture: PointerEventHandler<T>?
    var onPointerMove: PointerEventHandler<T>?
    var onPointerMoveCapture: PointerEventHandler<T>?
    var onPointerUp: PointerEventHandler<T>?
    var onPointerUpCapture: PointerEventHandler<T>?
    var onPointerCancel: PointerEventHandler<T>?
    var onPointerCancelCapture: PointerEventHandler<T>?
    var onPointerEnter: PointerEventHandler<T>?
    var onPointerEnterCapture: PointerEventHandler<T>?
    var onPointerLeave: PointerEventHandler<T>?
    var onPointerLeaveCapture: PointerEventHandler<T>?
    var onPointerOver: PointerEventHandler<T>?
    var onPointerOverCapture: PointerEventHandler<T>?
    var onPointerOut: PointerEventHandler<T>?
    var onPointerOutCapture: PointerEventHandler<T>?
    var onGotPointerCapture: PointerEventHandler<T>?
    var onGotPointerCaptureCapture: PointerEventHandler<T>?
    var onLostPointerCapture: PointerEventHandler<T>?
    var onLostPointerCaptureCapture: PointerEventHandler<T>?

    // UI Events
    var onScroll: UIEventHandler<T>?
    var onScrollCapture: UIEventHandler<T>?

    // Wheel Events
    var onWheel: WheelEventHandler<T>?
    var onWheelCapture: WheelEventHandler<T>?

    // Animation Events
    var onAnimationStart: AnimationEventHandler<T>?
    var onAnimationStartCapture: AnimationEventHandler<T>?
    var onAnimationEnd: AnimationEventHandler<T>?
    var onAnimationEndCapture: AnimationEventHandler<T>?
    var onAnimationIteration: AnimationEventHandler<T>?
    var onAnimationIterationCapture: AnimationEventHandler<T>?

    // Transition Events
    var onTransitionEnd: TransitionEventHandler<T>?
    var onTransitionEndCapture: TransitionEventHandler<T>?
}

inline var <T : Element> DOMAttributes<T>.onChange: FormEventHandler<T>?
    get() = asDynamic().onChange
    set(value) {
        asDynamic().onChange = value
    }

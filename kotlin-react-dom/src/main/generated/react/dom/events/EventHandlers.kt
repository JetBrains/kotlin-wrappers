// Automatically generated - do not modify!

package react.dom.events

typealias EventHandler<E> = (event: E) -> Unit

typealias ReactEventHandler<T> = EventHandler<SyntheticEvent<T, *>>

typealias ClipboardEventHandler<T> = EventHandler<ClipboardEvent<T>>

typealias CompositionEventHandler<T> = EventHandler<CompositionEvent<T>>

typealias DragEventHandler<T> = EventHandler<DragEvent<T>>

typealias FocusEventHandler<T> = EventHandler<FocusEvent<T>>

typealias FormEventHandler<T> = EventHandler<FormEvent<T>>

typealias ChangeEventHandler<T> = EventHandler<ChangeEvent<T>>

typealias KeyboardEventHandler<T> = EventHandler<KeyboardEvent<T>>

typealias MouseEventHandler<T> = EventHandler<MouseEvent<T, *>>

typealias TouchEventHandler<T> = EventHandler<TouchEvent<T>>

typealias PointerEventHandler<T> = EventHandler<PointerEvent<T>>

typealias UIEventHandler<T> = EventHandler<UIEvent<T, *>>

typealias WheelEventHandler<T> = EventHandler<WheelEvent<T>>

typealias AnimationEventHandler<T> = EventHandler<AnimationEvent<T>>

typealias TransitionEventHandler<T> = EventHandler<TransitionEvent<T>>
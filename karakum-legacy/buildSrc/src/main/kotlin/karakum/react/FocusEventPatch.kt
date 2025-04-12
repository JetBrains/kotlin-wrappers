package karakum.react

// language=typescript
private const val NEW = """
    interface FocusEvent<Target = Element, RelatedTarget = Element> extends SyntheticEvent<Target, NativeFocusEvent> {
        relatedTarget: (EventTarget & RelatedTarget) | null;
        target: EventTarget & Target;
    }
"""

// language=typescript
private const val OLD = """
    interface FocusEvent<T = Element> extends SyntheticEvent<T, NativeFocusEvent> {
        relatedTarget: EventTarget | null;
        target: EventTarget & T;
    }
"""

internal fun String.applyFocusEventPatch(): String =
    replace(NEW, OLD)

# Frequently Asked Questions

## Base

#### Why should I avoid `unsafeCast` and `asDynamic` when working with Wrappers?

First of all, `unsafeCast` and `asDynamic` are not recommended for external declarations, unless you are a
declarations' owner. \
Some types' instances cannot be created by constructor invocation or interface implementation. For such types we
provide strict factory functions. It is a responsibility of library authors.
Example:

```kotlin
sealed external interface ClassName

inline fun ClassName(
    value: String,
): ClassName =
    unsafeCast(value)

val value = ClassName("my-class")
```

If there is no strict factory function for a type of this kind
please [create an issue](https://github.com/JetBrains/kotlin-wrappers/issues).
Otherwise, when you use `unsafeCast` or `asDynamic`, the type can be incorrect when the library updates.

Typical use cases are:

- `JSO` (look at the previous item for JSO creation example)
- Opaque alias

> **Opaque alias** is the interface that mimics another external interface but encapsulates some logic inside (e.g.,
> a `String` opaque interface without any string operations).

## React

#### How to add data attribute to `HTMLElement`’s properties?

There are two cases:

> For example, Playwright uses ["data-testid" attribute](https://playwright.dev/docs/locators#locate-by-test-id) by
> default, so we can develop an exemplifying extension property upon that.

1. If the attribute is not specific to the `HTMLElement` - common for every `HTMLElement`, you need to create an
   extension
   function.

```kotlin
var HTMLAttributes<*>.dataTestId: String?
    get() = asDynamic()["data-testid"]
    set(value) {
        asDynamic()["data-testId"] = value
    }
```

2. Otherwise, use Element’s props interface as a receiver. \
   For example, if an element is `HTMLInputElement`, its props interface is `InputHTMLAttributes`, therefore it becomes
   a receiver:

```kotlin
var InputHTMLAttributes<*>.dataTestId: String?
    get() = asDynamic()["data-testid"]
    set(value) {
        asDynamic()["data-testId"] = value
    }
}
```

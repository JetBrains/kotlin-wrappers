# Frequently Asked Questions

## Common

_Q_: `sealed external interface`. What is it? \
_A_: In most cases, it’s a JavaScript Object (JSO).

```kotlin
@JsPlainObject
external interface EventInit {
    val bubbles: Boolean?
    val cancelable: Boolean?
    val composed: Boolean?
}
```

Typical JSO example: // TODO: (EventInit + inheritor example, Options + example, Props + example). \
JSO deviates from other things in the absence of methods (JSO has only mutable properties - `var`s,
after Kotlin 2.0 - only `val`s) \
We mark such interfaces with an annotation `@JsPlainObject` - work in progress. \
If the interface is marked, it’s definitely a JSO.

_Q_: How to create JSO instances?
_A_: ```jso { }``` // TODO: js equivalent, kotlin equivalent
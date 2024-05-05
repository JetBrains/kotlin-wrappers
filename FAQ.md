# Frequently Asked Questions

## Base

_Q_: `sealed external interface`. What is it? \
_A_: In most cases, it’s a JavaScript Object (JSO).

```typescript
type PointLike = {
  x: number
  y: number
}

class Point {
  constructor(
    pointLike: PointLike
  ) {
    /* do nothing */
  }
}

const point = new Point({
  x: 4.2,
  y: 2.7
})
```

```kotlin
@JsPlainObject
sealed external interface PointLike {
    var x: Float
    var y: Float
}

class Point(pointLike: PointLike) {
    val x: Float = pointLike.x
    val y: Float = pointLike.y
}

val pointLike: PointLike = jso {
    x = 4.2
    y = 2.7
}
val point = Point(pointLike)
```

Typical JSO example: \
[EventInit](https://github.com/JetBrains/kotlin-wrappers/blob/f6915bfc40e116367d7b1b5e289fa3586bbc50f0/kotlin-web/src/jsMain/generated/web/events/EventInit.kt#L7-L12) / [ProgressEventInit](https://github.com/JetBrains/kotlin-wrappers/blob/f6915bfc40e116367d7b1b5e289fa3586bbc50f0/kotlin-web/src/jsMain/generated/web/events/ProgressEventInit.kt#L8-L14),
[Options](https://github.com/JetBrains/kotlin-wrappers/blob/f6915bfc40e116367d7b1b5e289fa3586bbc50f0/kotlin-emotion/src/jsMain/kotlin/emotion/cache/Options.kt#L7-L14) / [Options usage](https://github.com/JetBrains/kotlin-wrappers/blob/f6915bfc40e116367d7b1b5e289fa3586bbc50f0/kotlin-emotion/src/jsMain/kotlin/emotion/cache/createCache.kt#L7-L10) / [ConstructorOptions](https://github.com/JetBrains/kotlin-wrappers/blob/f6915bfc40e116367d7b1b5e289fa3586bbc50f0/kotlin-cesium-engine/src/jsMain/generated/cesium/engine/ClassificationPrimitive.kt#L60-L73),
[Props](https://github.com/JetBrains/kotlin-wrappers/blob/f6915bfc40e116367d7b1b5e289fa3586bbc50f0/kotlin-react-core/src/jsMain/kotlin/react/Props.kt#L14-L21) / [SmartTabsProps](https://github.com/JetBrains/kotlin-wrappers/blob/f6915bfc40e116367d7b1b5e289fa3586bbc50f0/kotlin-ring-ui/src/jsMain/kotlin/ringui/Tabs.kt#L28-L30) \
JSO deviates from other things in the absence of methods (JSO has only mutable properties - `var`s,
after Kotlin 2.0 - only `val`s) \
We mark such interfaces with an annotation `@JsPlainObject` - work in progress. \
If the interface is marked, it’s definitely a JSO.

There also is an annotation `@JsExternalInheritorsOnly` (e.g. React Props) that requires all its children interfaces,
classes, and objects to be external as well.

_Q_: How to create JSO instances? \
_A_: Here is an example:

```kotlin
val instance = jso {
    foo = "bar"
}
```

JS equivalent:

```javascript
const instance = {
  foo: "bar",
}
```
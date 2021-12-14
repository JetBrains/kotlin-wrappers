## pre.281
* New DSL for react elements is provided. `attr` block is unnecessary anymore.
Before:
```kotlin
val App = fc<Props> {
  Button {
    attrs {
      title = "Submit form"
      disabled = true

      onClick = { event -> }
    }

    +"Submit form"
  }
}
```
After
```kotlin
val App = fc<Props> {
  Button {
    title = "Submit form"
    disabled = true

    onClick = { event -> }

    +"Submit form"
  }
}
```

## pre.200 - pre.280
* Maven Central group ID is changed to `org.jetbrains.kotlin-wrappers`
* Interfaces are renamed:
  * `RProps` -> `Props`
  * `RState` -> `State`
* [React Hooks](https://reactjs.org/docs/hooks-intro.html) are provided
* Intrinsic in `kotlin-react-dom` are implemented without `kotlinx-html`
* New DSL for CSS is introduced in `kotlin-csstype`
* React Router v6 is supported in `kotlin-react-router-dom`
* New wrappers:
  * `kotlin-react-table`
  * `kotlin-react-query`
  * `kotlin-react-virtual`
  * `kotlin-react-popper`
* Design systems:
  * `kotlin-mui`
  * `kotlin-ring-ui`

## Before pre.156
* Initial implementation is published under `org.jetbrains` group ID to [kotlin.jetbrains.space](https://kotlin.jetbrains.space) group ID to kotlin.jetbrains.space.

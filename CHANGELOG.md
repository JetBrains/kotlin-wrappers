## pre.280
* New DSL for React elements was implemented. `attrs` block is no longer required.

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
After:
```kotlin
val App = FC<Props> {
  Button {
    title = "Submit form"
    disabled = true

    onClick = { event -> }

    +"Submit form"
  }
}
```

## pre.200 — pre.279
* Maven Central group ID was changed to `org.jetbrains.kotlin-wrappers`
* Interfaces were renamed:
  * `RProps` -> `Props`
  * `RState` -> `State`
* `ElementType` and `ComponentType` interfaces were introduced to describe the type hierarchy in React
* [React Hooks](https://reactjs.org/docs/hooks-intro.html) were added
* Intrinsic types in `kotlin-react-dom` were implemented without `kotlinx-html`
* New DSL for CSS was introduced in `kotlin-csstype`
* React Router v6 was supported in `kotlin-react-router-dom`
* New wrappers:
  * `kotlin-react-table`
  * `kotlin-react-query`
  * `kotlin-react-virtual`
  * `kotlin-react-popper`
* Design systems:
  * `kotlin-mui`
  * `kotlin-ring-ui`

## Before pre.156
* Initial implementation is published under `org.jetbrains` group ID to [kotlin.jetbrains.space](https://kotlin.jetbrains.space).

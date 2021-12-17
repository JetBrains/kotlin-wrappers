## pre.282

### `kotlin-react` was split into two parts: `kotlin-react` and `kotlin-react-legacy`

`kotlin-react` only supports the new DSL for React elements (`ChildrenBuilder`, aka "no attrs"), while `kotlin-react-legacy`
provides the familiar `RBuilder` DSL.

If you are migrating from an earlier version and are not interested in migrating to the new API, you should **replace**
the `kotlin-react` dependency with `kotlin-react-legacy` in your project.

If you are migrating from an earlier version and would like to gradually migrate to the new API, you should **add**
the `kotlin-react-legacy` dependency to your project.

If you are migrating from an earlier version and would like to migrate to the new API at once, resolve all the
compilation errors you encounter. Good luck :)

If you are a new user of `kotlin-react`, just start using the new API and don't worry about the old one.

Technically, there is a third component called `kotlin-react-core` which contains most of the React API, but you don't
need to add it as a direct dependency.

### `kotlin-react-dom` was also split into two parts – you guessed it right — `kotlin-react-dom` and `kotlin-react-dom-legacy`

`kotlin-react-dom` does not depend on `kotlinx.html`, the HTML typings it provides are generated from TypeScript types
directly. They are therefore more complete and up-to-date.

`kotlin-react-dom-legacy` depends on `kolinx.html` and its HTML typings are maintained manually.

To choose the migration path, apply the same reasoning as the one described above for `kotlin-react`: you could either
ignore the new APIs and keep using the old ones, perform a gradual migration, or migrate "cold turkey" style.

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

* Initial implementation is published under `org.jetbrains` group ID
  to [kotlin.jetbrains.space](https://kotlin.jetbrains.space).

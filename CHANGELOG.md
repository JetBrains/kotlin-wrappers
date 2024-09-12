## pre.806

**BREAKING CHANGE**

`wrappers` group removed from version catalog aliases.
Details - #2497.

```kotlin
// Before
dependencies {
    jsMainImplementation(kotlinWrappers.wrappers.react)
    jsMainImplementation(kotlinWrappers.wrappers.reactDom)
}

// After
dependencies {
    jsMainImplementation(kotlinWrappers.react)
    jsMainImplementation(kotlinWrappers.reactDom)
}
```

## pre.804

**BREAKING CHANGE**

* Event type constants instead of type functions

```kotlin
// legacy
val event = MouseEvent(MouseEvent.click())

// modern
val event = MouseEvent(MouseEvent.CLICK)
```

## pre.802

**BREAKING CHANGE**

Version catalog updated
according to [best practices](https://blog.gradle.org/best-practices-naming-version-catalog-entries)

```kotlin
// Before
dependencies {
    jsMainImplementation(libs.wrappers.react)
    jsMainImplementation(libs.wrappers.react.dom)
    jsMainImplementation(libs.wrappers.react.router.dom)
    jsMainImplementation(libs.wrappers.tanstack.react.query)
    jsMainImplementation(libs.wrappers.tanstack.react.table)
}

// After
dependencies {
    jsMainImplementation(libs.wrappers.react)
    jsMainImplementation(libs.wrappers.reactDom)
    jsMainImplementation(libs.wrappers.reactRouterDom)
    jsMainImplementation(libs.wrappers.tanstack.reactQuery)
    jsMainImplementation(libs.wrappers.tanstack.reactTable)
}
```

## pre.797

**BREAKING CHANGE**

* Events. `EventType` current target type parameter removed as redundant

## pre.793

**BREAKING CHANGE**

* Popper Core
    * Fix subproject name

## pre.790

* Gradle [version catalog](https://docs.gradle.org/current/userguide/platforms.html)
    * `org.jetbrains.kotlin-wrappers:kotlin-wrappers-catalog`

### pre.786

* `kotlin-redux` and `kotlin-react-redux` removed as outdated
    * [Alternatives and fallback](https://github.com/JetBrains/kotlin-wrappers/issues/2385)

## pre.777

* React. Move raw declarations in a separate package
    * `react.rawUseMemo` -> `react.raw.useMemoRaw`
    * `react.rawUseCallback` -> `react.raw.useCallbackRaw`
    * ...

## pre.775

* React. Fix `useLayoutEffect` implementation

## pre.773

**BREAKING CHANGE**

* React. New context of effect lambdas - `CoroutineScope` (instead of `EffectBuilder`)

## pre.772

**BREAKING CHANGE**

* React. Suspend lambdas for effects
    * Instead of `EffectBuilder.cleanup` please use suspend functions with "auto-cleanup" like:
        * `web.events.subscribe` ([example](examples/old/src/jsMain/kotlin/example/react/useEffectExamples.kt#L23))
        * `web.events.once` ([example](examples/old/src/jsMain/kotlin/example/react/useEffectExamples.kt#L47))
        * `web.animations.awaitAnimationFrame` ([example](examples/old/src/jsMain/kotlin/example/react/useEffectExamples.kt#L67))
        * "your custom suspend adapter"
    * If you need old-style cleanup registration, please use the following hooks:
        * `useEffectWithCleanup`
        * `useEffectOnceWithCleanup`
        * `useLayoutEffectWithCleanup`
        * `useLayoutEffectOnceWithCleanup`
        * ...

## pre.758

**BREAKING CHANGE**

* Tanstack Query `skipToken` support fixed
    * To construct `QueryFunction` please use factory function `QueryFunction`

## pre.756

* Kotlin `2.0.0`
* Real `@JsPlainObject`
    * With factory methods
    * With `copy` method

## pre.755

* `JsContextFunction` - function with `this` access

## pre.752

* Auto cancellation support for suspend adapters (marked with `@JsAsync`)

```kotlin
import web.abort.Abortable

// ORIGINAL
external class Loader {
    @JsAsync
    suspend fun load(
        options: Abortable /* or child interface */ = definedExternally,
    ) T

    fun loadAsync(
        options: Abortable /* or child interface */ = definedExternally,
    ): Promise<T>
}

// GENERATED
external class Loader {
    @JsAsync
    suspend fun load(
        options: Abortable /* or child interface */ = definedExternally,
    ) T
    {
        /* GENERATED CODE START */
        val controller = AbortController()
        val abortOptions = jso {
            signal = anyOf(options?.signal, controller.signal)
        }
        val newOptions = Object.assign(jso(), options, abortOptions)

        invokeOnCancellation {
            controller.abort()
        }

        return loadAsync(newOptions).await()
        /* GENERATED CODE END */
    }

    fun loadAsync(
        options: Abortable /* or child interface */ = definedExternally,
    ): Promise<T>
}
```

## pre.742

**BREAKING CHANGE**

* Browser. Suspend adapters for async functions (marked with `@JsAsync`)
    * The original Promise-based functions are available with the `Async` suffix

## pre.738

**BREAKING CHANGE**

* React. Align `ForwardRef` and `FC` signatures
    * Preparing to remove `ForwardRef` (redundant in React 19)

## pre.737

* Preact Signals declarations

## pre.730

* `Temporal`. Initial implementation

## pre.718

**BREAKING CHANGE**

* Legacy `kotlin-styled` removed

## pre.715

**BREAKING CHANGE**

* Type parameter for `currentTarget` is removed from `*Event` classes
* `EventHandler` is an interface that allows to handle events with a strict `currentTarget`

## pre.707

**BREAKING CHANGE**

* `EventTarget.addEventHandler` and `EventTarget.removeEventHandler` are extension functions now rather than members

## pre.706

**BREAKING CHANGE**

* `EventTarget.addEventHandler` is an extension function now rather than a member

## pre.702

**BREAKING CHANGE**

* Type parameter for `currentTarget` in `*Event` classes

## pre.698

**BREAKING CHANGE**

* `Transferable` package changed
    * `js.core` -> `js.transferable`
* `structuredClone` package changed
    * `js.core` -> `web.serialization`

## pre.691

**BREAKING CHANGE**

* `fetch` throws the original error instead of an artificial `FetchException` wrapper exception
* `Blob` package changed
    * `web.buffer` -> `web.blob`

## pre.681

**BREAKING CHANGE**

* Split `js.core` package
    * `js.array`
        * `ReadonlyArray`, `ArrayLike`, `JsTuple`, …
    * `js.objects`
        * `Object`, `Record`, `jso`, …

## pre.680

**BREAKING CHANGE**

* Split `js.core` package
    * `js.symbol`
        * `Symbol`
    * `js.memory`
        * `FinalizationRegistry`
        * `WeakRef`
    * `web.time`
        * `DOMHighResTimeStamp`
        * `EpochTimeStamp`

## pre.672

**BREAKING CHANGE**

* Form-related types moved to `web.form` package

## pre.661

**BREAKING CHANGE**

* Root `web` package
    * `webassembly` -> `web.assembly`
    * `webgl` -> `web.gl`
    * `webrtc` -> `web.rtc`
    * `websockets` -> `web.sockets`
    * `webvtt` -> `web.vtt`

## pre.660

**BREAKING CHANGE**

* Changed packages for top-level functions:
    * `web.animations`
        * `requestAnimationFrame`
    * `web.scheduling`
        * `queueMicrotask`
        * `requestIdleCallback`

## pre.643

**BREAKING CHANGE**

* CommonJS module kind by default
    * Preparing for migration to ES module kind

## pre.639

**BREAKING CHANGE**

* MUI subproject names changed
    * `kotlin-mui` -> `kotlin-mui-material`
    * `kotlin-icons` -> `kotlin-icons-material`
* React Select
    * Union names in lower case (like in original)

## pre.635

**BREAKING CHANGE**

* React Router
    * Legacy API removed (`Router`, `Route` components)

## pre.634

**BREAKING CHANGE**

Event type constants moved into event companions.

```kotlin
// Before
import web.uievents.CLICK // OLD IMPORT
import web.uievents.MouseEvent

element.addEventHandler(MouseEvent.CLICK) { }

// After
import web.uievents.MouseEvent

element.addEventHandler(MouseEvent.CLICK) { }
```

## pre.600

* Kotlin `1.9.0` support

## pre.592

**BREAKING CHANGE**

Although it is unlikely that someone was using this signature directly (the implementation
in `kotlin-styled` / `kotlin-styled-next` is normally used instead) it is technically still a breaking
change.

```kotlin
css {
    // Before
    animation("animation", 1.s, Timing.easeIn, 0.5.s)

    // After
    animation += Animation("animation", 1.s, Timing.easeIn, 0.5.s)
}
```

## pre.591

**BREAKING CHANGE**

`kotlin-css` now has a different syntax for setting `boxShadow` and `transition` properties.

```kotlin
css {
    // Before
    boxShadow(Color.black, 1.px, 2.px, 3.px, 4.px)
    transition("all", 0.15.s, Timing.linear, 0.5.s)

    // After
    boxShadow += BoxShadow(Color.black, 1.px, 2.px, 3.px, 4.px)
    transition += Transition("background-color", 0.15.s, Timing.linear, 0.5.s)
}
```

## pre.588

**BREAKING CHANGE**

`kotlin-css` now has a different syntax for setting the `flex` property.

```kotlin
css {
    // Before
    flex(Flex.GROW)
    flex(1, 0, LinearDimension.auto)

    // After
    flex = Flex.GROW
    flex = Flex(1, 0, LinearDimension.auto)
}
```

## pre.586

**BREAKING CHANGE**

Removed a hack `Promise<Promise<T>>.then` method. Replace the usages as follows to migrate:

* `Promise.then(Promise)` -> `Promise.flatThen(Promise)`
* `Promise.catch(Promise)` -> `Promise.flatCatch(Promise)`

## pre.580

**BREAKING CHANGE**

Modern `Promise` introduced

Replace the imports as follows to migrate:

* `kotlin.js.Promise` -> `js.promise.Promise`
* `kotlinx.coroutines.await` -> `js.promise.await`
* `kotlinx.coroutines.asDeferred` -> `js.promise.asDeferred`

## pre.578

**BREAKING CHANGE**

`kotlin-css` now has a different syntax for setting `backgroundPosition`, `border`, `inset`, `margin`, `padding`,
and `textDecoration` properties.

```kotlin
css {
    // Before
    margin(0.px)

    // After
    margin = Margin(0.px)
}
```

## pre.542

**BREAKING CHANGE**

Core CSSOM types moved from the `csstype` package to `web.cssom`

## pre.527

* Kotlin `1.8.20` support

## pre.524

**BREAKING CHANGE**

Kotlin/JS Legacy compiler support removed

## pre.517

**BREAKING CHANGE**

* Union declarations changed
    * Values moved into companion object
    * Before: `import node.process.Platform.win32`
    * After: `import node.process.Platform.Companion.win32`

## pre.506

**BREAKING CHANGE**

Strict `createContext` signature (aligned with TS version)

## pre.482

**BREAKING CHANGE**

`fun StyledElement.grow(grow: Grow)` renamed to `fun StyledElement.flex(flex: Flex)`. Please update your code
accordingly if you're using `kotlin-css`.

## pre.467

**BREAKING CHANGE**

`kotlin-browser` package structure changed:

* `canvas` -> `web.canvas`
* `dom.geometry` -> `web.geometry`
* `dom.html` -> `web.html`
* `dom.svg` -> `web.svg`
* `dom` -> `web.dom`
* `media` -> `web.media`

## pre.452

**BREAKING CHANGE**

Core JS declarations from the `kotlinx.js` package were moved to the following packages:

* `js.buffer`
* `js.collections`
* `js.core`
* `js.errors`
* `js.import`
* `js.intl` (ex-`web.intl`)
* `js.promise`
* `js.reflect`
* `js.typedarrays`

## pre.298 — pre.302

Some factory functions were supported in `kotlin-csstype`. Declarations in `kotlin-csstype` were updated.

**BREAKING CHANGE** `auto` and `none` values were generalized for the whole DSL, duplicates of these declarations
were removed.

`BigInt` declaration was added to `kotlin-extensions`.

## pre.297

`kotlin-browser` declarations were introduced. These are browser APIs missing from the standard library.

## pre.296

Refactoring of `kotlin-extensions` has begun. Migration from `kotlinext` to `kotlinx` package is the main goal.

## pre.295

`kotlin-node` declarations were introduced.

## pre.294

`kotlin-webrtc` declarations were introduced.

## pre.292 — pre.293

`kotlin-typescript` declarations were updated.

## pre.291

`kotlin-typescript` declarations were introduced. They are compiler API declarations that can be used for code
transformation or infrastructural tasks.

## pre.287 — pre.290

`kotlin-mui` declarations were updated.

## pre.286

`kotlin-mui` declarations were updated, some utility hooks were supported.

Examples were updated.

## pre.285

`kotlin-mui` declarations were updated.

## pre.284

`Symbol` declaration was added to `kotlin-extensions`.

## pre.283

Low-level API was added to `emotion-css`.

## pre.282

### `kotlin-react` was split into two parts: `kotlin-react` and `kotlin-react-legacy`

`kotlin-react` only supports the new DSL for React elements (`ChildrenBuilder`, aka "no attrs"),
while `kotlin-react-legacy`
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

Please do note that `kotlin-styled` and `kotlin-styled-next` are only compatible with the legacy API. If you're
migrating
to the new API, you are going to need to switch to `kotlin-emotion`.

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

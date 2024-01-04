[![JetBrains team project](https://jb.gg/badges/team.svg)](https://confluence.jetbrains.com/display/ALL/JetBrains+on+GitHub)
[![CI](https://github.com/JetBrains/kotlin-wrappers/workflows/CI/badge.svg)](https://github.com/JetBrains/kotlin-wrappers/actions)
[![Maven Central](https://img.shields.io/maven-central/v/org.jetbrains.kotlin-wrappers/kotlin-wrappers-bom)](https://mvnrepository.com/artifact/org.jetbrains.kotlin-wrappers/kotlin-wrappers-bom)
[![Kotlin](https://img.shields.io/badge/kotlin-1.9.22-blue.svg?logo=kotlin)](http://kotlinlang.org)
[![Slack channel](https://img.shields.io/badge/chat-slack-green.svg?logo=slack)](https://kotlinlang.slack.com/messages/react/)

# Kotlin Wrappers

This repository hosts a number of [Kotlin](https://kotlinlang.org) wrappers for popular JavaScript libraries.

To learn more please refer to the `README`s of individual modules.

Versions with the `-compat` suffix are built with the `kotlin.mpp.enableCompatibilityMetadataVariant=true` option enabled. These are required for multiplatform projects that don't
use [hierarchical project structure](https://kotlinlang.org/docs/multiplatform-hierarchy.html).

| README                                                                                 |               Note               | Version                                                                                                                                                                                                                              |
|:---------------------------------------------------------------------------------------|:--------------------------------:|:-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| [kotlin-actions-toolkit](kotlin-actions-toolkit/README.md)                             |                                  | [![Maven Central](https://img.shields.io/maven-central/v/org.jetbrains.kotlin-wrappers/kotlin-actions-toolkit)](https://mvnrepository.com/artifact/org.jetbrains.kotlin-wrappers/kotlin-actions-toolkit)                             |
| [kotlin-browser](kotlin-browser/README.md)                                             |                                  | [![Maven Central](https://img.shields.io/maven-central/v/org.jetbrains.kotlin-wrappers/kotlin-browser)](https://mvnrepository.com/artifact/org.jetbrains.kotlin-wrappers/kotlin-browser)                                             |
| [kotlin-cesium](kotlin-cesium/README.md)                                               |                                  | [![Maven Central](https://img.shields.io/maven-central/v/org.jetbrains.kotlin-wrappers/kotlin-cesium)](https://mvnrepository.com/artifact/org.jetbrains.kotlin-wrappers/kotlin-cesium)                                               |
| [kotlin-css](kotlin-css/README.md)                                                     |                                  | [![Maven Central](https://img.shields.io/maven-central/v/org.jetbrains.kotlin-wrappers/kotlin-css)](https://mvnrepository.com/artifact/org.jetbrains.kotlin-wrappers/kotlin-css)                                                     |
| [kotlin-cssom-core](kotlin-cssom-core/README.md)                                       |                                  | [![Maven Central](https://img.shields.io/maven-central/v/org.jetbrains.kotlin-wrappers/kotlin-cssom-core)](https://mvnrepository.com/artifact/org.jetbrains.kotlin-wrappers/kotlin-cssom-core)                                       |
| [kotlin-csstype](kotlin-csstype/README.md)                                             | [guide](./docs/guide/csstype.md) | [![Maven Central](https://img.shields.io/maven-central/v/org.jetbrains.kotlin-wrappers/kotlin-csstype)](https://mvnrepository.com/artifact/org.jetbrains.kotlin-wrappers/kotlin-csstype)                                             |
| [kotlin-electron](kotlin-electron/README.md)                                           |                                  | [![Maven Central](https://img.shields.io/maven-central/v/org.jetbrains.kotlin-wrappers/kotlin-electron)](https://mvnrepository.com/artifact/org.jetbrains.kotlin-wrappers/kotlin-electron)                                           |
| [kotlin-emotion](kotlin-emotion/README.md)                                             | [guide](./docs/guide/emotion.md) | [![Maven Central](https://img.shields.io/maven-central/v/org.jetbrains.kotlin-wrappers/kotlin-emotion)](https://mvnrepository.com/artifact/org.jetbrains.kotlin-wrappers/kotlin-emotion)                                             |
| [kotlin-extensions](kotlin-extensions/README.md)                                       |             archived             | [![Maven Central](https://img.shields.io/maven-central/v/org.jetbrains.kotlin-wrappers/kotlin-extensions)](https://mvnrepository.com/artifact/org.jetbrains.kotlin-wrappers/kotlin-extensions)                                       |
| [kotlin-js](kotlin-js/README.md)                                                       |                                  | [![Maven Central](https://img.shields.io/maven-central/v/org.jetbrains.kotlin-wrappers/kotlin-js)](https://mvnrepository.com/artifact/org.jetbrains.kotlin-wrappers/kotlin-js)                                                       |
| [kotlin-mui-material](kotlin-mui-material/README.md)                                   |                                  | [![Maven Central](https://img.shields.io/maven-central/v/org.jetbrains.kotlin-wrappers/kotlin-mui-material)](https://mvnrepository.com/artifact/org.jetbrains.kotlin-wrappers/kotlin-mui-material)                                   |
| [kotlin-mui-base](kotlin-mui-base/README.md)                                           |                                  | [![Maven Central](https://img.shields.io/maven-central/v/org.jetbrains.kotlin-wrappers/kotlin-mui-base)](https://mvnrepository.com/artifact/org.jetbrains.kotlin-wrappers/kotlin-mui-base)                                           |
| [kotlin-mui-icons-material](kotlin-mui-icons-material/README.md)                       |                                  | [![Maven Central](https://img.shields.io/maven-central/v/org.jetbrains.kotlin-wrappers/kotlin-mui-icons-material)](https://mvnrepository.com/artifact/org.jetbrains.kotlin-wrappers/kotlin-mui-icons-material)                       |
| [kotlin-mui-lab](kotlin-mui-lab/README.md)                                             |                                  | [![Maven Central](https://img.shields.io/maven-central/v/org.jetbrains.kotlin-wrappers/kotlin-mui-lab)](https://mvnrepository.com/artifact/org.jetbrains.kotlin-wrappers/kotlin-mui-lab)                                             |
| [kotlin-mui-system](kotlin-mui-system/README.md)                                       |                                  | [![Maven Central](https://img.shields.io/maven-central/v/org.jetbrains.kotlin-wrappers/kotlin-mui-system)](https://mvnrepository.com/artifact/org.jetbrains.kotlin-wrappers/kotlin-mui-system)                                       |
| [kotlin-muix-date-pickers](kotlin-muix-date-pickers/README.md)                         |                                  | [![Maven Central](https://img.shields.io/maven-central/v/org.jetbrains.kotlin-wrappers/kotlin-muix-date-pickers)](https://mvnrepository.com/artifact/org.jetbrains.kotlin-wrappers/kotlin-muix-date-pickers)                         |
| [kotlin-muix-tree-view](kotlin-muix-tree-view/README.md)                               |                                  | [![Maven Central](https://img.shields.io/maven-central/v/org.jetbrains.kotlin-wrappers/kotlin-muix-tree-view)](https://mvnrepository.com/artifact/org.jetbrains.kotlin-wrappers/kotlin-muix-tree-view)                               |
| [kotlin-node](kotlin-node/README.md)                                                   |                                  | [![Maven Central](https://img.shields.io/maven-central/v/org.jetbrains.kotlin-wrappers/kotlin-node)](https://mvnrepository.com/artifact/org.jetbrains.kotlin-wrappers/kotlin-node)                                                   |
| [kotlin-popper](kotlin-popper/README.md)                                               |                                  | [![Maven Central](https://img.shields.io/maven-central/v/org.jetbrains.kotlin-wrappers/kotlin-popper)](https://mvnrepository.com/artifact/org.jetbrains.kotlin-wrappers/kotlin-popper)                                               |
| [kotlin-react](kotlin-react/README.md)                                                 |                                  | [![Maven Central](https://img.shields.io/maven-central/v/org.jetbrains.kotlin-wrappers/kotlin-react)](https://mvnrepository.com/artifact/org.jetbrains.kotlin-wrappers/kotlin-react)                                                 |
| [kotlin-react-beautiful-dnd](kotlin-react-beautiful-dnd/README.md)                     |                                  | [![Maven Central](https://img.shields.io/maven-central/v/org.jetbrains.kotlin-wrappers/kotlin-react-beautiful-dnd)](https://mvnrepository.com/artifact/org.jetbrains.kotlin-wrappers/kotlin-react-beautiful-dnd)                     |
| [kotlin-react-core](kotlin-react-core/README.md)                                       |                                  | [![Maven Central](https://img.shields.io/maven-central/v/org.jetbrains.kotlin-wrappers/kotlin-react-core)](https://mvnrepository.com/artifact/org.jetbrains.kotlin-wrappers/kotlin-react-core)                                       |
| [kotlin-react-dom](kotlin-react-dom/README.md)                                         |                                  | [![Maven Central](https://img.shields.io/maven-central/v/org.jetbrains.kotlin-wrappers/kotlin-react-dom)](https://mvnrepository.com/artifact/org.jetbrains.kotlin-wrappers/kotlin-react-dom)                                         |
| [kotlin-react-dom-legacy](kotlin-react-dom-legacy/README.md)                           |                                  | [![Maven Central](https://img.shields.io/maven-central/v/org.jetbrains.kotlin-wrappers/kotlin-react-dom-legacy)](https://mvnrepository.com/artifact/org.jetbrains.kotlin-wrappers/kotlin-react-dom-legacy)                           |
| [kotlin-react-dom-test-utils](kotlin-react-dom-test-utils/README.md)                   |                                  | [![Maven Central](https://img.shields.io/maven-central/v/org.jetbrains.kotlin-wrappers/kotlin-react-dom-test-utils)](https://mvnrepository.com/artifact/org.jetbrains.kotlin-wrappers/kotlin-react-dom-test-utils)                   |
| [kotlin-react-legacy](kotlin-react-legacy/README.md)                                   |                                  | [![Maven Central](https://img.shields.io/maven-central/v/org.jetbrains.kotlin-wrappers/kotlin-react-legacy)](https://mvnrepository.com/artifact/org.jetbrains.kotlin-wrappers/kotlin-react-legacy)                                   |
| [kotlin-react-redux](kotlin-react-redux/README.md)                                     |                                  | [![Maven Central](https://img.shields.io/maven-central/v/org.jetbrains.kotlin-wrappers/kotlin-react-redux)](https://mvnrepository.com/artifact/org.jetbrains.kotlin-wrappers/kotlin-react-redux)                                     |
| [kotlin-react-router](kotlin-react-router/README.md)                                   |                                  | [![Maven Central](https://img.shields.io/maven-central/v/org.jetbrains.kotlin-wrappers/kotlin-react-router)](https://mvnrepository.com/artifact/org.jetbrains.kotlin-wrappers/kotlin-react-router)                                   |
| [kotlin-react-router-dom](kotlin-react-router-dom/README.md)                           |                                  | [![Maven Central](https://img.shields.io/maven-central/v/org.jetbrains.kotlin-wrappers/kotlin-react-router-dom)](https://mvnrepository.com/artifact/org.jetbrains.kotlin-wrappers/kotlin-react-router-dom)                           |
| [kotlin-react-popper](kotlin-react-popper/README.md)                                   |                                  | [![Maven Central](https://img.shields.io/maven-central/v/org.jetbrains.kotlin-wrappers/kotlin-react-popper)](https://mvnrepository.com/artifact/org.jetbrains.kotlin-wrappers/kotlin-react-popper)                                   |
| [kotlin-react-select](kotlin-react-select/README.md)                                   |                                  | [![Maven Central](https://img.shields.io/maven-central/v/org.jetbrains.kotlin-wrappers/kotlin-react-select)](https://mvnrepository.com/artifact/org.jetbrains.kotlin-wrappers/kotlin-react-select)                                   |
| [kotlin-react-use](kotlin-react-use/README.md)                                         |                                  | [![Maven Central](https://img.shields.io/maven-central/v/org.jetbrains.kotlin-wrappers/kotlin-react-use)](https://mvnrepository.com/artifact/org.jetbrains.kotlin-wrappers/kotlin-react-use)                                         |
| [kotlin-redux](kotlin-redux/README.md)                                                 |                                  | [![Maven Central](https://img.shields.io/maven-central/v/org.jetbrains.kotlin-wrappers/kotlin-redux)](https://mvnrepository.com/artifact/org.jetbrains.kotlin-wrappers/kotlin-redux)                                                 |
| [kotlin-remix-run-router](kotlin-remix-run-router/README.md)                           |                                  | [![Maven Central](https://img.shields.io/maven-central/v/org.jetbrains.kotlin-wrappers/kotlin-remix-run-router)](https://mvnrepository.com/artifact/org.jetbrains.kotlin-wrappers/kotlin-remix-run-router)                           |
| [kotlin-ring-ui](kotlin-ring-ui/README.md)                                             |                                  | [![Maven Central](https://img.shields.io/maven-central/v/org.jetbrains.kotlin-wrappers/kotlin-ring-ui)](https://mvnrepository.com/artifact/org.jetbrains.kotlin-wrappers/kotlin-ring-ui)                                             |
| [kotlin-styled](kotlin-styled/README.md)                                               |             archived             | [![Maven Central](https://img.shields.io/maven-central/v/org.jetbrains.kotlin-wrappers/kotlin-styled)](https://mvnrepository.com/artifact/org.jetbrains.kotlin-wrappers/kotlin-styled)                                               |
| [kotlin-styled-next](kotlin-styled-next/README.md)                                     |                                  | [![Maven Central](https://img.shields.io/maven-central/v/org.jetbrains.kotlin-wrappers/kotlin-styled-next)](https://mvnrepository.com/artifact/org.jetbrains.kotlin-wrappers/kotlin-styled-next)                                     |
| [kotlin-tanstack-query-core](kotlin-tanstack-query-core/README.md)                     |                                  | [![Maven Central](https://img.shields.io/maven-central/v/org.jetbrains.kotlin-wrappers/kotlin-tanstack-query-core)](https://mvnrepository.com/artifact/org.jetbrains.kotlin-wrappers/kotlin-tanstack-query-core)                     |
| [kotlin-tanstack-react-query](kotlin-tanstack-react-query/README.md)                   |                                  | [![Maven Central](https://img.shields.io/maven-central/v/org.jetbrains.kotlin-wrappers/kotlin-tanstack-react-query)](https://mvnrepository.com/artifact/org.jetbrains.kotlin-wrappers/kotlin-tanstack-react-query)                   |
| [kotlin-tanstack-react-query-devtools](kotlin-tanstack-react-query-devtools/README.md) |                                  | [![Maven Central](https://img.shields.io/maven-central/v/org.jetbrains.kotlin-wrappers/kotlin-tanstack-react-query-devtools)](https://mvnrepository.com/artifact/org.jetbrains.kotlin-wrappers/kotlin-tanstack-react-query-devtools) |
| [kotlin-tanstack-react-table](kotlin-tanstack-react-table/README.md)                   |                                  | [![Maven Central](https://img.shields.io/maven-central/v/org.jetbrains.kotlin-wrappers/kotlin-tanstack-react-table)](https://mvnrepository.com/artifact/org.jetbrains.kotlin-wrappers/kotlin-tanstack-react-table)                   |
| [kotlin-tanstack-react-virtual](kotlin-tanstack-react-virtual/README.md)               |                                  | [![Maven Central](https://img.shields.io/maven-central/v/org.jetbrains.kotlin-wrappers/kotlin-tanstack-react-virtual)](https://mvnrepository.com/artifact/org.jetbrains.kotlin-wrappers/kotlin-tanstack-react-virtual)               |
| [kotlin-tanstack-table-core](kotlin-tanstack-table-core/README.md)                     |                                  | [![Maven Central](https://img.shields.io/maven-central/v/org.jetbrains.kotlin-wrappers/kotlin-tanstack-table-core)](https://mvnrepository.com/artifact/org.jetbrains.kotlin-wrappers/kotlin-tanstack-table-core)                     |
| [kotlin-tanstack-virtual-core](kotlin-tanstack-virtual-core/README.md)                 |                                  | [![Maven Central](https://img.shields.io/maven-central/v/org.jetbrains.kotlin-wrappers/kotlin-tanstack-virtual-core)](https://mvnrepository.com/artifact/org.jetbrains.kotlin-wrappers/kotlin-tanstack-virtual-core)                 |
| [kotlin-typescript](kotlin-typescript/README.md)                                       |                                  | [![Maven Central](https://img.shields.io/maven-central/v/org.jetbrains.kotlin-wrappers/kotlin-typescript)](https://mvnrepository.com/artifact/org.jetbrains.kotlin-wrappers/kotlin-typescript)                                       |
| [kotlin-web](kotlin-web/README.md)                                                     |                                  | [![Maven Central](https://img.shields.io/maven-central/v/org.jetbrains.kotlin-wrappers/kotlin-web)](https://mvnrepository.com/artifact/org.jetbrains.kotlin-wrappers/kotlin-web)                                                     |
| [kotlin-wrappers-bom](kotlin-wrappers-bom/README.md)                                   |                                  | [![Maven Central](https://img.shields.io/maven-central/v/org.jetbrains.kotlin-wrappers/kotlin-wrappers-bom)](https://mvnrepository.com/artifact/org.jetbrains.kotlin-wrappers/kotlin-wrappers-bom)                                   |

Artifacts are published to Maven Central, see the corresponding README files for package coordinates.

**All packages require JDK 8 to be installed.**

## Using In Your Projects

Use the "Kotlin Wrappers BOM" which helps to ensure consistency between the modules and allows you not to think
about version compatibility.

Just declare `kotlin-wrappers-bom` and specify the modules you need:

```kotlin
val kotlinWrappersVersion = "1.0.0-pre.679"

dependencies {
    implementation(platform("org.jetbrains.kotlin-wrappers:kotlin-wrappers-bom:$kotlinWrappersVersion"))
    implementation("org.jetbrains.kotlin-wrappers:kotlin-emotion")
    implementation("org.jetbrains.kotlin-wrappers:kotlin-react")
    implementation("org.jetbrains.kotlin-wrappers:kotlin-react-dom")
    implementation("org.jetbrains.kotlin-wrappers:kotlin-tanstack-react-table")
    // other wrappers
}
```

Or use a helper function:

```kotlin
fun kotlinw(target: String): String =
    "org.jetbrains.kotlin-wrappers:kotlin-$target"

val kotlinWrappersVersion = "1.0.0-pre.679"

dependencies {
    implementation(platform(kotlinw("wrappers-bom:$kotlinWrappersVersion")))
    implementation(kotlinw("emotion"))
    implementation(kotlinw("react"))
    implementation(kotlinw("react-dom"))
    implementation(kotlinw("tanstack-react-table"))
    // other wrappers
}
```

Make sure that you have `mavenCentral()` in the list of repositories.

## Examples

1. [To-do list example](examples/src/jsMain/kotlin/example/Todo.kt)

2. [Tic-Tac-Toe example](examples/src/jsMain/kotlin/example/TicTacToe.kt)

3. A port of "Thinking in React" [example](examples/src/jsMain/kotlin/example/Product.kt)

4. An [example of using axios](examples/src/jsMain/kotlin/example/AxiosSearch.kt) to fetch remote data. It also
   demonstrates how to add typings for an external library.

5. An [example of using Quill](examples/src/jsMain/kotlin/example/Quill.kt) that shows how to use an external React component.

6. An [example of using react-router-dom](examples/src/jsMain/kotlin/example/ReactRouterDom.kt) that shows how to use react-route-dom with hooks API.

7. [Building Web Applications with React and Kotlin/JS](https://play.kotlinlang.org/hands-on/Building%20Web%20Applications%20with%20React%20and%20Kotlin%20JS/01_Introduction), a tutorial by JetBrains.

8. [A full-stack demo application](https://github.com/mkraynov/kfsad) written in Kotlin for JetBrains Night Moscow 2019.

9. An [example of using react-table](https://github.com/karakum-team/kotlin-react-table-sample) that shows how to use react-table with hooks API.

10. An [example of using Material UI](https://github.com/karakum-team/kotlin-mui-showcase).

11. [ByteLegend](https://bytelegend.com/): [an open-source, real-world HTML5 MMORPG game](https://github.com/ByteLegend/ByteLegend).

Follow these examples to learn how to start developing your React apps with Kotlin. Good luck and have fun!
You also can clone [my-kotlin-react-sample](https://github.com/ScottHuangZL/my-kotlin-app) to see the result directly.

## Experimental IR Backend

Please note that React wrappers in particular heavily relied on specific characteristics of the default backend, which might make your current code incompatible with the new IR backend.

### React error: "X not a function" in production mode

- Every interface implementing `Props` or `State` should be marked as `external` interface. Otherwise, you will get `Uncaught ClassCastException`.
  If you’re implementing these interfaces via a class, you can mark it as `@JsExport` — however, we suggest evaluating if you could use an external interface instead.
- Every component extending `RComponent` must be marked with `@JsExport`. Otherwise, you might run into issues such as `TypeError: l.render is not a function (react-dom.production.min.js:182)`
- https://youtrack.jetbrains.com/issue/KT-42427, https://youtrack.jetbrains.com/issue/KT-39506

## Contributing

Contributions to this project are welcome! Please see the open
[issues](https://github.com/JetBrains/kotlin-wrappers/issues) or chat with us on the [#react](https://kotlinlang.slack.com/messages/react/) channel in our
[Slack](https://slack.kotlinlang.org/).

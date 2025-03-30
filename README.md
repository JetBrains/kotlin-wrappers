[![JetBrains team project](https://jb.gg/badges/team.svg)](https://confluence.jetbrains.com/display/ALL/JetBrains+on+GitHub)
[![CI](https://github.com/JetBrains/kotlin-wrappers/workflows/CI/badge.svg)](https://github.com/JetBrains/kotlin-wrappers/actions)
[![Maven Central](https://img.shields.io/maven-central/v/org.jetbrains.kotlin-wrappers/kotlin-wrappers-bom)](https://search.maven.org/artifact/org.jetbrains.kotlin-wrappers/kotlin-wrappers-bom)
[![Kotlin](https://img.shields.io/badge/kotlin-2.1.20-blue.svg?logo=kotlin)](http://kotlinlang.org)
[![JavaScript target](https://img.shields.io/badge/target-supported-f7df1e?logo=javascript)](https://kotlinlang.org/docs/js-project-setup.html)
[![WASM target](https://img.shields.io/badge/target-supported-654ff0?logo=webassembly)](https://kotlinlang.org/docs/wasm-get-started.html)
[![Slack channel](https://img.shields.io/badge/chat-slack-green.svg?logo=slack)](https://kotlinlang.slack.com/messages/react/)

# Kotlin Wrappers

This repository hosts a number of [Kotlin](https://kotlinlang.org) wrappers for popular JavaScript libraries.

To learn more please refer to the [API Reference](https://jetbrains.github.io/kotlin-wrappers/).

| Library name                                 |                                                   Targets                                                    | API                                                                                     | README                                                   |               Note               | Version                                                                                                                                                                                                                              |
|:---------------------------------------------|:------------------------------------------------------------------------------------------------------------:|:----------------------------------------------------------------------------------------|:---------------------------------------------------------|:--------------------------------:|:-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| `kotlin-actions-toolkit`                     |                            ![JavaScript](https://img.shields.io/badge/js-f7df1e)                             | [API](https://jetbrains.github.io/kotlin-wrappers/kotlin-actions-toolkit)               | [README](kotlin-actions-toolkit/README.md)               |                                  | [![Maven Central](https://img.shields.io/maven-central/v/org.jetbrains.kotlin-wrappers/kotlin-actions-toolkit)](https://search.maven.org/artifact/org.jetbrains.kotlin-wrappers/kotlin-actions-toolkit/)                             |
| `kotlin-ajv`                                 |                            ![JavaScript](https://img.shields.io/badge/js-f7df1e)                             | [API](https://jetbrains.github.io/kotlin-wrappers/kotlin-ajv)                           | [README](kotlin-ajv/README.md)                           |                                  | [![Maven Central](https://img.shields.io/maven-central/v/org.jetbrains.kotlin-wrappers/kotlin-ajv)](https://search.maven.org/artifact/org.jetbrains.kotlin-wrappers/kotlin-ajv/)                                                     |
| `kotlin-browser`                             | ![JavaScript](https://img.shields.io/badge/js-f7df1e)&nbsp;![WASM](https://img.shields.io/badge/wasm-654ff0) | [API](https://jetbrains.github.io/kotlin-wrappers/kotlin-browser)                       | [README](kotlin-browser/README.md)                       |                                  | [![Maven Central](https://img.shields.io/maven-central/v/org.jetbrains.kotlin-wrappers/kotlin-browser)](https://search.maven.org/artifact/org.jetbrains.kotlin-wrappers/kotlin-browser/)                                             |
| `kotlin-cesium-engine`                       |                            ![JavaScript](https://img.shields.io/badge/js-f7df1e)                             | [API](https://jetbrains.github.io/kotlin-wrappers/kotlin-cesium-engine)                 | [README](kotlin-cesium-engine/README.md)                 |                                  | [![Maven Central](https://img.shields.io/maven-central/v/org.jetbrains.kotlin-wrappers/kotlin-cesium-engine)](https://search.maven.org/artifact/org.jetbrains.kotlin-wrappers/kotlin-cesium-engine/)                                 |
| `kotlin-cesium-widgets`                      |                            ![JavaScript](https://img.shields.io/badge/js-f7df1e)                             | [API](https://jetbrains.github.io/kotlin-wrappers/kotlin-cesium-widgets)                | [README](kotlin-cesium-widgets/README.md)                |                                  | [![Maven Central](https://img.shields.io/maven-central/v/org.jetbrains.kotlin-wrappers/kotlin-cesium-widgets)](https://search.maven.org/artifact/org.jetbrains.kotlin-wrappers/kotlin-cesium-widgets/)                               |
| `kotlin-css`                                 |                            ![JavaScript](https://img.shields.io/badge/js-f7df1e)                             | [API](https://jetbrains.github.io/kotlin-wrappers/kotlin-css)                           | [README](kotlin-css/README.md)                           |                                  | [![Maven Central](https://img.shields.io/maven-central/v/org.jetbrains.kotlin-wrappers/kotlin-css)](https://search.maven.org/artifact/org.jetbrains.kotlin-wrappers/kotlin-css/)                                                     |
| `kotlin-cssom-core`                          | ![JavaScript](https://img.shields.io/badge/js-f7df1e)&nbsp;![WASM](https://img.shields.io/badge/wasm-654ff0) | [API](https://jetbrains.github.io/kotlin-wrappers/kotlin-cssom-core)                    | [README](kotlin-cssom-core/README.md)                    |                                  | [![Maven Central](https://img.shields.io/maven-central/v/org.jetbrains.kotlin-wrappers/kotlin-cssom-core)](https://search.maven.org/artifact/org.jetbrains.kotlin-wrappers/kotlin-cssom-core/)                                       |
| `kotlin-csstype`                             |                            ![JavaScript](https://img.shields.io/badge/js-f7df1e)                             | [API](https://jetbrains.github.io/kotlin-wrappers/kotlin-csstype)                       | [README](kotlin-csstype/README.md)                       | [guide](./docs/guide/csstype.md) | [![Maven Central](https://img.shields.io/maven-central/v/org.jetbrains.kotlin-wrappers/kotlin-csstype)](https://search.maven.org/artifact/org.jetbrains.kotlin-wrappers/kotlin-csstype/)                                             |
| `kotlin-electron`                            |                            ![JavaScript](https://img.shields.io/badge/js-f7df1e)                             | [API](https://jetbrains.github.io/kotlin-wrappers/kotlin-electron)                      | [README](kotlin-electron/README.md)                      |                                  | [![Maven Central](https://img.shields.io/maven-central/v/org.jetbrains.kotlin-wrappers/kotlin-electron)](https://search.maven.org/artifact/org.jetbrains.kotlin-wrappers/kotlin-electron/)                                           |
| `kotlin-emotion`                             |                            ![JavaScript](https://img.shields.io/badge/js-f7df1e)                             | [API](https://jetbrains.github.io/kotlin-wrappers/kotlin-emotion)                       | [README](kotlin-emotion/README.md)                       | [guide](./docs/guide/emotion.md) | [![Maven Central](https://img.shields.io/maven-central/v/org.jetbrains.kotlin-wrappers/kotlin-emotion)](https://search.maven.org/artifact/org.jetbrains.kotlin-wrappers/kotlin-emotion/)                                             |
| `kotlin-js`                                  | ![JavaScript](https://img.shields.io/badge/js-f7df1e)&nbsp;![WASM](https://img.shields.io/badge/wasm-654ff0) | [API](https://jetbrains.github.io/kotlin-wrappers/kotlin-js)                            | [README](kotlin-js/README.md)                            |                                  | [![Maven Central](https://img.shields.io/maven-central/v/org.jetbrains.kotlin-wrappers/kotlin-js)](https://search.maven.org/artifact/org.jetbrains.kotlin-wrappers/kotlin-js/)                                                       |
| `kotlin-js-core`                             | ![JavaScript](https://img.shields.io/badge/js-f7df1e)&nbsp;![WASM](https://img.shields.io/badge/wasm-654ff0) | [API](https://jetbrains.github.io/kotlin-wrappers/kotlin-js-core)                       | [README](kotlin-js-core/README.md)                       |                                  | [![Maven Central](https://img.shields.io/maven-central/v/org.jetbrains.kotlin-wrappers/kotlin-js-core)](https://search.maven.org/artifact/org.jetbrains.kotlin-wrappers/kotlin-js-core/)                                             |
| `kotlin-jszip`                               | ![JavaScript](https://img.shields.io/badge/js-f7df1e)&nbsp;![WASM](https://img.shields.io/badge/wasm-654ff0) | [API](https://jetbrains.github.io/kotlin-wrappers/kotlin-jszip)                         | [README](kotlin-jszip/README.md)                         |                                  | [![Maven Central](https://img.shields.io/maven-central/v/org.jetbrains.kotlin-wrappers/kotlin-jszip)](https://search.maven.org/artifact/org.jetbrains.kotlin-wrappers/kotlin-jszip/)                                                 |
| `kotlin-mui-material`                        |                            ![JavaScript](https://img.shields.io/badge/js-f7df1e)                             | [API](https://jetbrains.github.io/kotlin-wrappers/kotlin-mui-material)                  | [README](kotlin-mui-material/README.md)                  |                                  | [![Maven Central](https://img.shields.io/maven-central/v/org.jetbrains.kotlin-wrappers/kotlin-mui-material)](https://search.maven.org/artifact/org.jetbrains.kotlin-wrappers/kotlin-mui-material/)                                   |
| `kotlin-mui-base`                            |                            ![JavaScript](https://img.shields.io/badge/js-f7df1e)                             | [API](https://jetbrains.github.io/kotlin-wrappers/kotlin-mui-base)                      | [README](kotlin-mui-base/README.md)                      |                                  | [![Maven Central](https://img.shields.io/maven-central/v/org.jetbrains.kotlin-wrappers/kotlin-mui-base)](https://search.maven.org/artifact/org.jetbrains.kotlin-wrappers/kotlin-mui-base/)                                           |
| `kotlin-mui-icons-material`                  |                            ![JavaScript](https://img.shields.io/badge/js-f7df1e)                             | [API](https://jetbrains.github.io/kotlin-wrappers/kotlin-mui-icons-material)            | [README](kotlin-mui-icons-material/README.md)            |                                  | [![Maven Central](https://img.shields.io/maven-central/v/org.jetbrains.kotlin-wrappers/kotlin-mui-icons-material)](https://search.maven.org/artifact/org.jetbrains.kotlin-wrappers/kotlin-mui-icons-material/)                       |
| `kotlin-mui-lab`                             |                            ![JavaScript](https://img.shields.io/badge/js-f7df1e)                             | [API](https://jetbrains.github.io/kotlin-wrappers/kotlin-mui-lab)                       | [README](kotlin-mui-lab/README.md)                       |                                  | [![Maven Central](https://img.shields.io/maven-central/v/org.jetbrains.kotlin-wrappers/kotlin-mui-lab)](https://search.maven.org/artifact/org.jetbrains.kotlin-wrappers/kotlin-mui-lab/)                                             |
| `kotlin-mui-system`                          |                            ![JavaScript](https://img.shields.io/badge/js-f7df1e)                             | [API](https://jetbrains.github.io/kotlin-wrappers/kotlin-mui-system)                    | [README](kotlin-mui-system/README.md)                    |                                  | [![Maven Central](https://img.shields.io/maven-central/v/org.jetbrains.kotlin-wrappers/kotlin-mui-system)](https://search.maven.org/artifact/org.jetbrains.kotlin-wrappers/kotlin-mui-system/)                                       |
| `kotlin-muix-date-pickers`                   |                            ![JavaScript](https://img.shields.io/badge/js-f7df1e)                             | [API](https://jetbrains.github.io/kotlin-wrappers/kotlin-muix-date-pickers)             | [README](kotlin-muix-date-pickers/README.md)             |                                  | [![Maven Central](https://img.shields.io/maven-central/v/org.jetbrains.kotlin-wrappers/kotlin-muix-date-pickers)](https://search.maven.org/artifact/org.jetbrains.kotlin-wrappers/kotlin-muix-date-pickers/)                         |
| `kotlin-muix-tree-view`                      |                            ![JavaScript](https://img.shields.io/badge/js-f7df1e)                             | [API](https://jetbrains.github.io/kotlin-wrappers/kotlin-muix-tree-view)                | [README](kotlin-muix-tree-view/README.md)                |                                  | [![Maven Central](https://img.shields.io/maven-central/v/org.jetbrains.kotlin-wrappers/kotlin-muix-tree-view)](https://search.maven.org/artifact/org.jetbrains.kotlin-wrappers/kotlin-muix-tree-view/)                               |
| `kotlin-node`                                |                            ![JavaScript](https://img.shields.io/badge/js-f7df1e)                             | [API](https://jetbrains.github.io/kotlin-wrappers/kotlin-node)                          | [README](kotlin-node/README.md)                          |                                  | [![Maven Central](https://img.shields.io/maven-central/v/org.jetbrains.kotlin-wrappers/kotlin-node)](https://search.maven.org/artifact/org.jetbrains.kotlin-wrappers/kotlin-node/)                                                   |
| `kotlin-null-writable`                       |                            ![JavaScript](https://img.shields.io/badge/js-f7df1e)                             | [API](https://jetbrains.github.io/kotlin-wrappers/kotlin-null-writable)                 | [README](kotlin-null-writable/README.md)                 |                                  | [![Maven Central](https://img.shields.io/maven-central/v/org.jetbrains.kotlin-wrappers/kotlin-null-writable)](https://search.maven.org/artifact/org.jetbrains.kotlin-wrappers/kotlin-null-writable/)                                 |
| `kotlin-popperjs-core`                       |                            ![JavaScript](https://img.shields.io/badge/js-f7df1e)                             | [API](https://jetbrains.github.io/kotlin-wrappers/kotlin-popperjs-core)                 | [README](kotlin-popperjs-core/README.md)                 |                                  | [![Maven Central](https://img.shields.io/maven-central/v/org.jetbrains.kotlin-wrappers/kotlin-popperjs-core)](https://search.maven.org/artifact/org.jetbrains.kotlin-wrappers/kotlin-popperjs-core/)                                 |
| `kotlin-prantlf-jsonlint`                    |                            ![JavaScript](https://img.shields.io/badge/js-f7df1e)                             | [API](https://jetbrains.github.io/kotlin-wrappers/kotlin-prantlf-jsonlint)              | [README](kotlin-prantlf-jsonlint/README.md)              |                                  | [![Maven Central](https://img.shields.io/maven-central/v/org.jetbrains.kotlin-wrappers/kotlin-prantlf-jsonlint)](https://search.maven.org/artifact/org.jetbrains.kotlin-wrappers/kotlin-prantlf-jsonlint/)                           |
| `kotlin-preact-signals-core`                 |                            ![JavaScript](https://img.shields.io/badge/js-f7df1e)                             | [API](https://jetbrains.github.io/kotlin-wrappers/kotlin-preact-signals-core)           | [README](kotlin-preact-signals-core/README.md)           |                                  | [![Maven Central](https://img.shields.io/maven-central/v/org.jetbrains.kotlin-wrappers/kotlin-preact-signals-core)](https://search.maven.org/artifact/org.jetbrains.kotlin-wrappers/kotlin-preact-signals-core/)                     |
| `kotlin-preact-signals-react`                |                            ![JavaScript](https://img.shields.io/badge/js-f7df1e)                             | [API](https://jetbrains.github.io/kotlin-wrappers/kotlin-preact-signals-react)          | [README](kotlin-preact-signals-react/README.md)          |                                  | [![Maven Central](https://img.shields.io/maven-central/v/org.jetbrains.kotlin-wrappers/kotlin-preact-signals-react)](https://search.maven.org/artifact/org.jetbrains.kotlin-wrappers/kotlin-preact-signals-react/)                   |
| `kotlin-react`                               |                            ![JavaScript](https://img.shields.io/badge/js-f7df1e)                             | [API](https://jetbrains.github.io/kotlin-wrappers/kotlin-react)                         | [README](kotlin-react/README.md)                         |                                  | [![Maven Central](https://img.shields.io/maven-central/v/org.jetbrains.kotlin-wrappers/kotlin-react)](https://search.maven.org/artifact/org.jetbrains.kotlin-wrappers/kotlin-react/)                                                 |
| `kotlin-react-beautiful-dnd`                 |                            ![JavaScript](https://img.shields.io/badge/js-f7df1e)                             | [API](https://jetbrains.github.io/kotlin-wrappers/kotlin-react-beautiful-dnd)           | [README](kotlin-react-beautiful-dnd/README.md)           |                                  | [![Maven Central](https://img.shields.io/maven-central/v/org.jetbrains.kotlin-wrappers/kotlin-react-beautiful-dnd)](https://search.maven.org/artifact/org.jetbrains.kotlin-wrappers/kotlin-react-beautiful-dnd/)                     |
| `kotlin-react-core`                          |                            ![JavaScript](https://img.shields.io/badge/js-f7df1e)                             | [API](https://jetbrains.github.io/kotlin-wrappers/kotlin-react-core)                    | [README](kotlin-react-core/README.md)                    |                                  | [![Maven Central](https://img.shields.io/maven-central/v/org.jetbrains.kotlin-wrappers/kotlin-react-core)](https://search.maven.org/artifact/org.jetbrains.kotlin-wrappers/kotlin-react-core/)                                       |
| `kotlin-react-dom`                           |                            ![JavaScript](https://img.shields.io/badge/js-f7df1e)                             | [API](https://jetbrains.github.io/kotlin-wrappers/kotlin-react-dom)                     | [README](kotlin-react-dom/README.md)                     |                                  | [![Maven Central](https://img.shields.io/maven-central/v/org.jetbrains.kotlin-wrappers/kotlin-react-dom)](https://search.maven.org/artifact/org.jetbrains.kotlin-wrappers/kotlin-react-dom/)                                         |
| `kotlin-react-dom-legacy`<sup>archived</sup> |                            ![JavaScript](https://img.shields.io/badge/js-f7df1e)                             | [API](https://jetbrains.github.io/kotlin-wrappers/kotlin-react-dom-legacy)              | [README](kotlin-react-dom-legacy/README.md)              |                                  | [![Maven Central](https://img.shields.io/maven-central/v/org.jetbrains.kotlin-wrappers/kotlin-react-dom-legacy)](https://search.maven.org/artifact/org.jetbrains.kotlin-wrappers/kotlin-react-dom-legacy/)                           |
| `kotlin-react-dom-test-utils`                |                            ![JavaScript](https://img.shields.io/badge/js-f7df1e)                             | [API](https://jetbrains.github.io/kotlin-wrappers/kotlin-react-dom-test-utils)          | [README](kotlin-react-dom-test-utils/README.md)          |                                  | [![Maven Central](https://img.shields.io/maven-central/v/org.jetbrains.kotlin-wrappers/kotlin-react-dom-test-utils)](https://search.maven.org/artifact/org.jetbrains.kotlin-wrappers/kotlin-react-dom-test-utils/)                   |
| `kotlin-react-legacy`<sup>archived</sup>     |                            ![JavaScript](https://img.shields.io/badge/js-f7df1e)                             | [API](https://jetbrains.github.io/kotlin-wrappers/kotlin-react-legacy)                  | [README](kotlin-react-legacy/README.md)                  |                                  | [![Maven Central](https://img.shields.io/maven-central/v/org.jetbrains.kotlin-wrappers/kotlin-react-legacy)](https://search.maven.org/artifact/org.jetbrains.kotlin-wrappers/kotlin-react-legacy/)                                   |
| `kotlin-react-router`                        |                            ![JavaScript](https://img.shields.io/badge/js-f7df1e)                             | [API](https://jetbrains.github.io/kotlin-wrappers/kotlin-react-router)                  | [README](kotlin-react-router/README.md)                  |                                  | [![Maven Central](https://img.shields.io/maven-central/v/org.jetbrains.kotlin-wrappers/kotlin-react-router)](https://search.maven.org/artifact/org.jetbrains.kotlin-wrappers/kotlin-react-router/)                                   |
| `kotlin-react-popper`                        |                            ![JavaScript](https://img.shields.io/badge/js-f7df1e)                             | [API](https://jetbrains.github.io/kotlin-wrappers/kotlin-react-popper)                  | [README](kotlin-react-popper/README.md)                  |                                  | [![Maven Central](https://img.shields.io/maven-central/v/org.jetbrains.kotlin-wrappers/kotlin-react-popper)](https://search.maven.org/artifact/org.jetbrains.kotlin-wrappers/kotlin-react-popper/)                                   |
| `kotlin-react-select`                        |                            ![JavaScript](https://img.shields.io/badge/js-f7df1e)                             | [API](https://jetbrains.github.io/kotlin-wrappers/kotlin-react-select)                  | [README](kotlin-react-select/README.md)                  |                                  | [![Maven Central](https://img.shields.io/maven-central/v/org.jetbrains.kotlin-wrappers/kotlin-react-select)](https://search.maven.org/artifact/org.jetbrains.kotlin-wrappers/kotlin-react-select/)                                   |
| `kotlin-react-use`                           |                            ![JavaScript](https://img.shields.io/badge/js-f7df1e)                             | [API](https://jetbrains.github.io/kotlin-wrappers/kotlin-react-use)                     | [README](kotlin-react-use/README.md)                     |                                  | [![Maven Central](https://img.shields.io/maven-central/v/org.jetbrains.kotlin-wrappers/kotlin-react-use)](https://search.maven.org/artifact/org.jetbrains.kotlin-wrappers/kotlin-react-use/)                                         |
| `kotlin-semver`                              |                            ![JavaScript](https://img.shields.io/badge/js-f7df1e)                             | [API](https://jetbrains.github.io/kotlin-wrappers/kotlin-semver)                        | [README](kotlin-semver/README.md)                        |                                  | [![Maven Central](https://img.shields.io/maven-central/v/org.jetbrains.kotlin-wrappers/kotlin-semver)](https://search.maven.org/artifact/org.jetbrains.kotlin-wrappers/kotlin-semver/)                                               |
| `kotlin-styled-next`                         |                            ![JavaScript](https://img.shields.io/badge/js-f7df1e)                             | [API](https://jetbrains.github.io/kotlin-wrappers/kotlin-styled-next)                   | [README](kotlin-styled-next/README.md)                   |                                  | [![Maven Central](https://img.shields.io/maven-central/v/org.jetbrains.kotlin-wrappers/kotlin-styled-next)](https://search.maven.org/artifact/org.jetbrains.kotlin-wrappers/kotlin-styled-next/)                                     |
| `kotlin-tanstack-query-core`                 |                            ![JavaScript](https://img.shields.io/badge/js-f7df1e)                             | [API](https://jetbrains.github.io/kotlin-wrappers/kotlin-tanstack-query-core)           | [README](kotlin-tanstack-query-core/README.md)           |                                  | [![Maven Central](https://img.shields.io/maven-central/v/org.jetbrains.kotlin-wrappers/kotlin-tanstack-query-core)](https://search.maven.org/artifact/org.jetbrains.kotlin-wrappers/kotlin-tanstack-query-core/)                     |
| `kotlin-tanstack-react-query`                |                            ![JavaScript](https://img.shields.io/badge/js-f7df1e)                             | [API](https://jetbrains.github.io/kotlin-wrappers/kotlin-tanstack-react-query)          | [README](kotlin-tanstack-react-query/README.md)          |                                  | [![Maven Central](https://img.shields.io/maven-central/v/org.jetbrains.kotlin-wrappers/kotlin-tanstack-react-query)](https://search.maven.org/artifact/org.jetbrains.kotlin-wrappers/kotlin-tanstack-react-query/)                   |
| `kotlin-tanstack-react-query-devtools`       |                            ![JavaScript](https://img.shields.io/badge/js-f7df1e)                             | [API](https://jetbrains.github.io/kotlin-wrappers/kotlin-tanstack-react-query-devtools) | [README](kotlin-tanstack-react-query-devtools/README.md) |                                  | [![Maven Central](https://img.shields.io/maven-central/v/org.jetbrains.kotlin-wrappers/kotlin-tanstack-react-query-devtools)](https://search.maven.org/artifact/org.jetbrains.kotlin-wrappers/kotlin-tanstack-react-query-devtools/) |
| `kotlin-tanstack-react-table`                |                            ![JavaScript](https://img.shields.io/badge/js-f7df1e)                             | [API](https://jetbrains.github.io/kotlin-wrappers/kotlin-tanstack-react-table)          | [README](kotlin-tanstack-react-table/README.md)          |                                  | [![Maven Central](https://img.shields.io/maven-central/v/org.jetbrains.kotlin-wrappers/kotlin-tanstack-react-table)](https://search.maven.org/artifact/org.jetbrains.kotlin-wrappers/kotlin-tanstack-react-table/)                   |
| `kotlin-tanstack-react-virtual`              |                            ![JavaScript](https://img.shields.io/badge/js-f7df1e)                             | [API](https://jetbrains.github.io/kotlin-wrappers/kotlin-tanstack-react-virtual)        | [README](kotlin-tanstack-react-virtual/README.md)        |                                  | [![Maven Central](https://img.shields.io/maven-central/v/org.jetbrains.kotlin-wrappers/kotlin-tanstack-react-virtual)](https://search.maven.org/artifact/org.jetbrains.kotlin-wrappers/kotlin-tanstack-react-virtual/)               |
| `kotlin-tanstack-table-core`                 |                            ![JavaScript](https://img.shields.io/badge/js-f7df1e)                             | [API](https://jetbrains.github.io/kotlin-wrappers/kotlin-tanstack-table-core)           | [README](kotlin-tanstack-table-core/README.md)           |                                  | [![Maven Central](https://img.shields.io/maven-central/v/org.jetbrains.kotlin-wrappers/kotlin-tanstack-table-core)](https://search.maven.org/artifact/org.jetbrains.kotlin-wrappers/kotlin-tanstack-table-core/)                     |
| `kotlin-tanstack-virtual-core`               |                            ![JavaScript](https://img.shields.io/badge/js-f7df1e)                             | [API](https://jetbrains.github.io/kotlin-wrappers/kotlin-tanstack-virtual-core)         | [README](kotlin-tanstack-virtual-core/README.md)         |                                  | [![Maven Central](https://img.shields.io/maven-central/v/org.jetbrains.kotlin-wrappers/kotlin-tanstack-virtual-core)](https://search.maven.org/artifact/org.jetbrains.kotlin-wrappers/kotlin-tanstack-virtual-core/)                 |
| `kotlin-typescript`                          |                            ![JavaScript](https://img.shields.io/badge/js-f7df1e)                             | [API](https://jetbrains.github.io/kotlin-wrappers/kotlin-typescript)                    | [README](kotlin-typescript/README.md)                    |                                  | [![Maven Central](https://img.shields.io/maven-central/v/org.jetbrains.kotlin-wrappers/kotlin-typescript)](https://search.maven.org/artifact/org.jetbrains.kotlin-wrappers/kotlin-typescript/)                                       |
| `kotlin-vercel-ncc`                          | ![JavaScript](https://img.shields.io/badge/js-f7df1e)&nbsp;![WASM](https://img.shields.io/badge/wasm-654ff0) | [API](https://jetbrains.github.io/kotlin-wrappers/kotlin-vercel-ncc)                    | [README](kotlin-vercel-ncc/README.md)                    |                                  | [![Maven Central](https://img.shields.io/maven-central/v/org.jetbrains.kotlin-wrappers/kotlin-vercel-ncc)](https://search.maven.org/artifact/org.jetbrains.kotlin-wrappers/kotlin-vercel-ncc/)                                       |
| `kotlin-web`                                 |                            ![JavaScript](https://img.shields.io/badge/js-f7df1e)                             | [API](https://jetbrains.github.io/kotlin-wrappers/kotlin-web)                           | [README](kotlin-web/README.md)                           |                                  | [![Maven Central](https://img.shields.io/maven-central/v/org.jetbrains.kotlin-wrappers/kotlin-web)](https://search.maven.org/artifact/org.jetbrains.kotlin-wrappers/kotlin-web/)                                                     |
| `kotlin-wrappers-bom`                        |                            ![JavaScript](https://img.shields.io/badge/js-f7df1e)                             | [API](https://jetbrains.github.io/kotlin-wrappers/kotlin-wrappers-bom)                  | [README](kotlin-wrappers-bom/README.md)                  |                                  | [![Maven Central](https://img.shields.io/maven-central/v/org.jetbrains.kotlin-wrappers/kotlin-wrappers-bom)](https://search.maven.org/artifact/org.jetbrains.kotlin-wrappers/kotlin-wrappers-bom/)                                   |
| `kotlin-yaml`                                | ![JavaScript](https://img.shields.io/badge/js-f7df1e)&nbsp;![WASM](https://img.shields.io/badge/wasm-654ff0) | [API](https://jetbrains.github.io/kotlin-wrappers/kotlin-yaml)                          | [README](kotlin-yaml/README.md)                          |                                  | [![Maven Central](https://img.shields.io/maven-central/v/org.jetbrains.kotlin-wrappers/kotlin-yaml)](https://search.maven.org/artifact/org.jetbrains.kotlin-wrappers/kotlin-yaml/)                                                   |

Artifacts are published to Maven Central, see the corresponding README files for package coordinates.

**All packages require JDK 11 to be installed.**

## Using In Your Projects

Use Kotlin Wrappers' version catalog.

Just declare `kotlin-wrappers-catalog` in root `settings.gradle.kts` and specify the modules you need:

```kotlin
// root `settings.gradle.kts`
dependencyResolutionManagement {
    repositories {
        mavenCentral()
    }

    versionCatalogs {
        create("kotlinWrappers") {
            val wrappersVersion = "2025.3.23"
            from("org.jetbrains.kotlin-wrappers:kotlin-wrappers-catalog:$wrappersVersion")
        }
    }
}

// build.gradle.kts
dependencies {
    jsMainImplementation(kotlinWrappers.emotion)
    jsMainImplementation(kotlinWrappers.react)
    jsMainImplementation(kotlinWrappers.reactDom)
    jsMainImplementation(kotlinWrappers.tanstack.reactTable)
    // other wrappers
}
```

## Examples

1. [Internal examples](examples/README.md)

2. [Building Web Applications with React and Kotlin/JS](https://play.kotlinlang.org/hands-on/Building%20Web%20Applications%20with%20React%20and%20Kotlin%20JS/01_Introduction),
   a tutorial by JetBrains.

3. An [example of using Material UI](https://github.com/karakum-team/kotlin-mui-showcase).

Follow these examples to learn how to start developing your Kotlin/JS apps. Good luck and have fun!

## Contributing

Contributions to this project are welcome! Please see the open
[issues](https://github.com/JetBrains/kotlin-wrappers/issues) or chat with us on
the [#javascript](https://kotlinlang.slack.com/messages/javascript/) channel in our
[Slack](https://slack.kotlinlang.org/).

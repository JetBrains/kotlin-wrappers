# Setting up a new kotlin-wrappers project

This guide describes how to set up the framework for a new wrapper project in the `kotlin-wrappers` repository using Karakum.

## 1. Project Directory Structure

A new wrapper project (e.g., `kotlin-foo`) should follow this directory structure:

```
kotlin-foo/
├── karakum/
│   ├── src/
│   │   └── jsMain/
│   │       └── kotlin/
│   │           └── foo/
│   │               └── karakum/
│   │                   └── main.kt
│   ├── build.gradle.kts
│   └── settings.gradle.kts
└── (other standard kotlin-wrappers files like README.md, package.json if needed)
```

The `karakum` directory is treated as a separate Gradle build (composite build) to keep generator logic separate from the generated code.

## 2. Root Project Integration

To include the new project, add it to the root `settings.gradle.kts` of the `kotlin-wrappers` project:

```kotlin
includeKarakum("kotlin-foo")
```

The `includeKarakum` helper (defined in `build-logic-settings`) automatically handles the composite build setup for the `karakum` subdirectory.

## 3. Karakum Subproject Configuration

### `settings.gradle.kts`

In `kotlin-foo/karakum/settings.gradle.kts`, use the `generatorbuild.settings` plugin:

```kotlin
rootProject.name = "kotlin-foo-karakum"

pluginManagement {
    includeBuild("../../build-logic-settings")
}

plugins {
    id("generatorbuild.settings")
}

includeBuild("../../build-logic")
```

### `build.gradle.kts`

In `kotlin-foo/karakum/build.gradle.kts`, use the `generatorbuild.karakum-conventions` plugin:

```kotlin
plugins {
    id("generatorbuild.karakum-conventions")
}

karakum {
    // Specify the npm library to convert. 
    // jspkg is a custom version catalog for NPM packages.
    library(jspkg.foo) 
}
```

If the library is not yet in `jspkg`, you may need to add it to `build-logic-settings/common/src/main/kotlin/wrappers/NpmVersionCatalogPlugin.kt` or use a standard `npm()` dependency in the `dependencies` block.

## 4. Generator Entry Point (`main.kt`)

The actual configuration of Karakum happens in a Kotlin/JS `main` function. Create it at `kotlin-foo/karakum/src/jsMain/kotlin/foo/karakum/main.kt`:

```kotlin
package foo.karakum

import io.github.sgrishchenko.karakum.generate
import js.array.ReadonlyArray

suspend fun main(args: ReadonlyArray<String>) {
    generate(args) {
        // Karakum configuration goes here
        input = manyOf("dist/index.d.ts")
        // ...
    }
}
```

This `main` function will be executed when you run the conversion task.

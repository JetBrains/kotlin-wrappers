# Converting individual npm libraries with Karakum

This guide describes how to run the conversion process and best practices for cleaning up the automated output.

## Running the conversion

To run the conversion for a specific library, use the following Gradle command from the root of the `kotlin-wrappers` project:

```bash
./gradlew :<project>-karakum:generateKarakumExternals
```

For example, for `kotlin-electron`:

```bash
./gradlew :kotlin-electron-karakum:generateKarakumExternals
```

This task will:
1. Compile the Kotlin/JS generator code in the `<project>/karakum` subdirectory.
2. Execute the `main` function to generate Kotlin declarations.
3. Place the generated code in the project's `src/jsMain/generated` directory.

## Cleaning up the automated conversion

While Karakum is powerful, automated conversion often requires manual cleanup and fine-tuning to achieve a high-quality Kotlin API.

### 1. Prefer Karakum Plugins over String Replacements

Instead of doing manual string replacements or using `doLast { ... }` regexes in `build.gradle.kts`, prefer using Karakum's plugin system within `main.kt`. This approach is more robust and leverages the TypeScript AST.

Karakum provides many built-in plugins, such as:
- `NumberPlugin`: Configures numeric type conversion (e.g., mapping specific TypeScript `number` to `Int` or `Double`).
- `PromiseResultPlugin`: Ensures `Promise` results are correctly typed.

**Example `main.kt` plugin setup:**

```kotlin
generate(args) {
    plugins = manyOf(
        NumberPlugin(
            defaultNumberType = "Int",
        ),
        PromiseResultPlugin(),
        // Add custom plugins here
    )
    // ...
}
```

### 2. File Organization and Package Mapping

Use `packageNameMapper` to control the directory structure and package names of the generated files. This is crucial for maintaining a clean project layout.

```kotlin
packageNameMapper = recordOf(
    "dist/esm/index" to "/"
)
```

By default, Karakum mirrors the TypeScript file structure. Use `isolatedOutputPackage = true` to ensure that generated files are placed within their own package and don't conflict with manually written code.

### 3. Advanced Configuration Options

The `generate` block in `main.kt` provides several powerful configuration options:

- **`namespaceStrategy`**: Controls how TypeScript namespaces are converted (e.g., `NamespaceStrategy.package` to convert to Kotlin packages, or `NamespaceStrategy.object` to convert to Kotlin objects).
- **`conflictResolutionStrategy`**: Defines how to handle naming conflicts, for example, `ConflictResolutionStrategy.replace` to override existing declarations.
- **`inheritanceModifiers`**: Allows modifying the inheritance of classes and interfaces during conversion.
- **`injections`**: Allows injecting additional code or members into generated classes/interfaces.

### 4. Improving Naming with Name Resolvers

Sometimes TypeScript generates anonymous types (e.g., in unions or as object literals). Karakum extracts these, but may give them generic names. Use `nameResolvers` to provide meaningful names.

```kotlin
nameResolvers = manyOf(
    ::resolveMyCustomOptionsName
)
```

### 5. Handling TypeScript Unions

Kotlin doesn't have direct equivalents for all TypeScript union types. For simple unions, you might want to use overloads or sealed classes. For complex cases, `Any` is the fallback, but you can improve this with custom plugins.

### 6. Best Practices from existing wrappers

- **Check newer examples:** Libraries like `kotlin-electron`, `kotlin-node`, and `kotlin-tanstack-history` are excellent examples of modern Karakum usage.
- **Author attribution:** When looking for high-quality examples, prioritize those authored by `sergeigrishchenko` as they often reflect the current best practices.
- **Kotlin/JS Plugins:** While older documentation might show JavaScript-based plugins, the modern standard in `kotlin-wrappers` is to write plugins in Kotlin/JS, as seen in the `kotlin-node` or `kotlin-electron` projects.
- **Use Annotations:** Karakum allows adding annotations like `@JsPlainObject` or `@Suppress` to generated declarations via the `annotations` configuration block.

```kotlin
annotations = manyOf(
    ::annotateJsPlainObject
)
```

### 7. Small fixes and post-processing

If a small, one-off fix is needed and it's too complex to write a full Karakum plugin, you can still use a `doLast` block in the `generateKarakumExternals` task in `build.gradle.kts`:

```kotlin
tasks.generateKarakumExternals {
    doLast {
        val file = jsGeneratedDir.resolve("path/to/File.kt")
        file.writeText(file.readText().replace("oldText", "newText"))
    }
}
```

*Note: Use this sparingly. Plugins are the preferred way.*

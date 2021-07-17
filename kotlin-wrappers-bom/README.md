## kotlin-wrappers-bom

Kotlin Wrappers Bill Of Material is a special artifact that groups dependency versions that are known to be valid and
tested to work together.

This will reduce the developers’ pain of having to test the compatibility of different versions and reduce the chances
to have version mismatches.

Usage:

```kotlin
fun kotlinw(target: String): String =
    "org.jetbrains.kotlin-wrappers:kotlin-$target"

val kotlinWrappersBomVersion = "0.0.1-pre.217-kotlin-1.5.21"

dependencies {
    implementation(enforcedPlatform(kotlinw("wrappers-bom:${kotlinWrappersBomVersion}")))
    implementation(kotlinw("react"))
    implementation(kotlinw("react-dom"))
    implementation(kotlinw("react-query"))
    implementation(kotlinw("react-redux"))
    implementation(kotlinw("react-router-dom"))
    implementation(kotlinw("react-table"))
    implementation(kotlinw("ring-ui"))
    implementation(kotlinw("styled"))
}
```

See also
an [example of using kotlin-wrappers-bom](https://github.com/aerialist7/kotlin-react-table-sample/blob/main/build.gradle.kts)
in real project.

P.S. Using the Kotlin Wrappers BOM is a good way the ensure consistency between the dependencies versions and a safer
way in multi-module projects management.
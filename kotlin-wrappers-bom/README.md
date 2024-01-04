## kotlin-wrappers-bom

Kotlin Wrappers Bill of Materials is a special artifact that groups dependency versions that are known to be valid and
tested to work together.

This will reduce the developers' pain of having to test the compatibility of different versions and reduce the chances
to have version mismatches.

Usage:

```kotlin
val kotlinWrappersVersion = "1.0.0-pre.679"

dependencies {
    implementation(platform("org.jetbrains.kotlin-wrappers:kotlin-wrappers-bom:$kotlinWrappersVersion"))
    implementation("org.jetbrains.kotlin-wrappers:kotlin-emotion")
    implementation("org.jetbrains.kotlin-wrappers:kotlin-react")
    implementation("org.jetbrains.kotlin-wrappers:kotlin-react-dom")
    implementation("org.jetbrains.kotlin-wrappers:kotlin-react-query")
    implementation("org.jetbrains.kotlin-wrappers:kotlin-react-redux")
    implementation("org.jetbrains.kotlin-wrappers:kotlin-react-router-dom")
    implementation("org.jetbrains.kotlin-wrappers:kotlin-ring-ui")
    implementation("org.jetbrains.kotlin-wrappers:kotlin-styled")
    implementation("org.jetbrains.kotlin-wrappers:kotlin-tanstack-react-table")
}
```

See also
an [example of using kotlin-wrappers-bom](https://github.com/aerialist7/kotlin-react-table-sample/blob/main/build.gradle.kts)
in a real project.

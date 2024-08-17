rootProject.name = "kotlin-wrappers-examples"

dependencyResolutionManagement {
    repositories {
        mavenCentral()
    }

    versionCatalogs {
        create("libs") {
            val kotlinVersion = extra["kotlin.version"] as String
            plugin("kotlin-multiplatform", "org.jetbrains.kotlin.multiplatform").version(kotlinVersion)
            plugin("kotlin-js-plain-objects", "org.jetbrains.kotlin.plugin.js-plain-objects").version(kotlinVersion)

            val wrappersVersion = extra["kotlin-wrappers.version"] as String
            from("org.jetbrains.kotlin-wrappers:kotlin-wrappers-catalog:$wrappersVersion")
        }
    }
}

// Old
include("old")

// Kotlin Wrappers
includeBuild("../")

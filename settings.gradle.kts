rootProject.name = "kotlin-wrappers"

pluginManagement {
    resolutionStrategy {
        plugins {
            val kotlinVersion = extra["kotlin.version"] as String
            kotlin("multiplatform") version kotlinVersion
            kotlin("jvm") version kotlinVersion
            kotlin("js") version kotlinVersion
            kotlin("plugin.serialization") version kotlinVersion
        }
    }

    repositories {
        gradlePluginPortal()
        maven("https://kotlin.bintray.com/kotlin-eap")
        maven("https://kotlin.bintray.com/kotlin-dev")
    }
}

// Platform-agnostic CSS support
include("kotlin-css")
include("kotlin-css:npm-adapter")

// Kotlin/JS: various helpers
include("kotlin-extensions")

// Kotlin/JS: Mocha wrappers
include("kotlin-mocha")

// Kotlin/JS: React wrappers
include("kotlin-react")
include("kotlin-react-dom")

// Kotlin/JS: Redux wrappers
include("kotlin-react-redux")
include("kotlin-redux")

// Kotlin/JS: React Router wrappers
include("kotlin-react-router-dom")

// Kotlin/JS: styled-components wrappers
include("kotlin-styled")

// Examples
include("examples")



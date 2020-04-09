pluginManagement {
    resolutionStrategy {
        plugins {
            val kotlinVersion = extra["kotlin_version"] as String
            kotlin("multiplatform") version kotlinVersion
            kotlin("jvm") version kotlinVersion
            kotlin("js") version kotlinVersion
            kotlin("plugin.serialization") version kotlinVersion
        }
    }

    repositories {
        gradlePluginPortal()
        maven("https://dl.bintray.com/kotlin/kotlin-eap")
    }
}

rootProject.name = "kotlin-wrappers"

// Platform-agnostic CSS support
include("kotlin-css")
include("kotlin-css:kotlin-css-js")
include("kotlin-css:kotlin-css-jvm")

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



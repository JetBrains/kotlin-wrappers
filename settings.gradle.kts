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
}

// Platform-agnostic CSS support
include("kotlin-css")

// Kotlin/JS: various helpers
include("kotlin-extensions")

// Kotlin/JS: Mocha wrappers
// TODO update to latest version and re-enable
// include("kotlin-mocha")

// Kotlin/JS: React wrappers
include("kotlin-react")
include("kotlin-react-dom")

// Kotlin/JS: Redux wrappers
include("kotlin-react-redux")
include("kotlin-redux")

// Kotlin/JS: React Router wrappers
include("kotlin-react-router-dom")

// Kotlin/JS: React Table wrappers
include("kotlin-react-table")

// Kotlin/JS: Ring UI wrappers
include("kotlin-ring-ui")

// Kotlin/JS: styled-components wrappers
include("kotlin-styled")

include("kotlin-wrappers-bom")

// Examples
include("examples")



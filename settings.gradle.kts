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

// Examples
include("examples")

// Platform-agnostic CSS support
include("kotlin-css")

// Kotlin/JS: various helpers
include("kotlin-extensions")

// Kotlin/JS: React wrappers
include("kotlin-react")

// Kotlin/JS: React DOM wrappers
include("kotlin-react-dom")

// Kotlin/JS: React Query wrappers
include("kotlin-react-query")

// Kotlin/JS: React Redux wrappers
include("kotlin-react-redux")

// Kotlin/JS: React Router wrappers
include("kotlin-react-router-dom")

// Kotlin/JS: React Table wrappers
include("kotlin-react-table")

// Kotlin/JS: Redux wrappers
include("kotlin-redux")

// Kotlin/JS: Ring UI wrappers
include("kotlin-ring-ui")

// Kotlin/JS: styled-components wrappers
include("kotlin-styled")

// Kotlin/JS: styled-components kotlin implementation
include("kotlin-styled-next")

include("kotlin-wrappers-bom")

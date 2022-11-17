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

dependencyResolutionManagement {
    repositories {
        mavenCentral()
    }
}

// Examples
include("examples")

// Kotlin/JS: Browser APIs missing from the standard library
include("kotlin-browser")

// Kotlin/JS: CesiumJS wrappers
include("kotlin-cesium")

// Platform-agnostic CSS support
include("kotlin-css")

// Kotlin/JS: Zero-runtime CSS typings
include("kotlin-csstype")

// Kotlin/JS: Emotion wrappers
include("kotlin-emotion")

// Kotlin/JS: various helpers
include("kotlin-extensions")

// Kotlin/JS: History wrappers
include("kotlin-history")

// Kotlin/JS: APIs missing from the standard library
include("kotlin-js")

// Kotlin/JS: Material UI wrappers
include("kotlin-mui")

// Kotlin/JS: Material UI Icons wrappers
include("kotlin-mui-icons")

// Kotlin/JS: Node.js wrappers
include("kotlin-node")

// Kotlin/JS: Popper wrappers
include("kotlin-popper")

// Kotlin/JS: React wrappers
include("kotlin-react")

// Kotlin/JS: react-beautiful-dnd wrappers
include("kotlin-react-beautiful-dnd")

// Kotlin/JS: React wrappers
include("kotlin-react-core")

// Kotlin/JS: React DOM wrappers
include("kotlin-react-dom")

// Kotlin/JS: React DOM legacy wrappers
include("kotlin-react-dom-legacy")

// Kotlin/JS: React legacy wrappers
include("kotlin-react-legacy")

// Kotlin/JS: React Popper wrappers
include("kotlin-react-popper")

// Kotlin/JS: React Redux wrappers
include("kotlin-react-redux")

// Kotlin/JS: React Router wrappers
include("kotlin-react-router-dom")

// Kotlin/JS: React Select wrappers
include("kotlin-react-select")

// Kotlin/JS: Redux wrappers
include("kotlin-redux")

// Kotlin/JS: React Router wrappers
include("kotlin-remix-run-router")

// Kotlin/JS: Ring UI wrappers
include("kotlin-ring-ui")

// Kotlin/JS: styled-components wrappers
include("kotlin-styled")

// Kotlin/JS: a reimplementation of kotlin-styled in pure Kotlin, without styled-components
include("kotlin-styled-next")

// Kotlin/JS: Tanstack Query Core wrappers
include("kotlin-tanstack-query-core")

// Kotlin/JS: Tanstack React Query wrappers
include("kotlin-tanstack-react-query")

// Kotlin/JS: Tanstack React Query Devtools wrappers
include("kotlin-tanstack-react-query-devtools")

// Kotlin/JS: Tanstack React Table wrappers
include("kotlin-tanstack-react-table")

// Kotlin/JS: Tanstack React Virtual wrappers
include("kotlin-tanstack-react-virtual")

// Kotlin/JS: Tanstack Table Core wrappers
include("kotlin-tanstack-table-core")

// Kotlin/JS: Tanstack Virtual Core wrappers
include("kotlin-tanstack-virtual-core")

// Kotlin/JS: TypeScript wrappers
include("kotlin-typescript")

// Kotlin/JS: Common web wrappers
include("kotlin-web")

include("kotlin-wrappers-bom")

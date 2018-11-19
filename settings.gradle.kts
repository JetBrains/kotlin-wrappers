enableFeaturePreview("STABLE_PUBLISHING")

rootProject.name = "kotlin-wrappers"

pluginManagement {
    resolutionStrategy {
        eachPlugin {
            if (requested.id.id == "kotlin2js") {
                useModule("org.jetbrains.kotlin:kotlin-gradle-plugin:${requested.version}")
            }
        }
    }
}

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
//
// Kotlin/JS: Redux wrappers
include("kotlin-react-redux")
include("kotlin-redux")

// Kotlin/JS: React Router wrappers
include("kotlin-react-router-dom")

// Kotlin/JS: styled-components wrappers
include("kotlin-styled")

// Examples
include("examples")

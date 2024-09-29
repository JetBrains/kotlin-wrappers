rootProject.name = "examples"

dependencyResolutionManagement {
    repositories {
        mavenLocal()
        mavenCentral()
    }

    versionCatalogs {
        create("kotlinWrappers") {
            val wrappersVersion = extra["kotlin-wrappers.version"] as String
            from("org.jetbrains.kotlin-wrappers:kotlin-wrappers-catalog:$wrappersVersion")
        }
    }
}

include("react-lazy-modules-webpack")
include("react-router")
include("tanstack-react-table")
include("tic-tac-toe")

// Old examples
include("please-split-me")

// Kotlin Wrappers
includeBuild("../")

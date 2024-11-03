rootProject.name = "examples"

dependencyResolutionManagement {
    repositories {
        mavenLocal()
        mavenCentral()
    }

    versionCatalogs {
        create("libs") {
            val kotlinVersion = extra["kotlin.version"] as String
            library("kotlin-test", "org.jetbrains.kotlin", "kotlin-test").version(kotlinVersion)
        }

        create("kotlinWrappers") {
            val wrappersVersion = extra["kotlin-wrappers.version"] as String
            from("org.jetbrains.kotlin-wrappers:kotlin-wrappers-catalog:$wrappersVersion")
        }
    }
}

include("browser")
include("js-common-playground")
include("react")
include("react-lazy-modules-webpack")
include("react-router")
include("tanstack-react-table")
include("tic-tac-toe")

// Kotlin Wrappers
includeBuild("../")

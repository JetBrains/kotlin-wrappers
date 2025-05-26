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

includeBuild("build-logic")

include("browser")
include("react")
include("react-lazy-modules-webpack")
include("react-router")
include("serialization-to-jso")
include("simple-wasm-application")
include("tanstack-react-table")
include("tanstack-virtual-table")
include("tanstack-table-common")
include("tic-tac-toe")

rootProject.name = "examples"

dependencyResolutionManagement {
    repositories {
        mavenCentral()
    }

    versionCatalogs {
        create("libs") {
            val kotlinVersion = extra["kotlin.version"] as String
            plugin("serialization", "org.jetbrains.kotlin.plugin.serialization").version(kotlinVersion)
            library("kotlin-test", "org.jetbrains.kotlin", "kotlin-test").version(kotlinVersion)

            val serializationVersion = extra["kotlinx-serialization.version"] as String
            library("serialization-json", "org.jetbrains.kotlinx", "kotlinx-serialization-json").version(
                serializationVersion
            )

            val coroutinesVersion = extra["kotlinx-coroutines.version"] as String
            library("coroutines-core", "org.jetbrains.kotlinx", "kotlinx-coroutines-core").version(coroutinesVersion)
        }

        create("kotlinWrappers") {
            val wrappersVersion = extra["kotlin-wrappers.version"] as String
            from("org.jetbrains.kotlin-wrappers:kotlin-wrappers-catalog:$wrappersVersion")
        }
    }
}

includeBuild("build-logic")
includeBuild("../")

include("browser")
include("event-flow")
include("export-suspend-with-cancellation")
include("mdn-audioworklet-example")
include("react")
include("react-svg")
include("react-lazy-modules-webpack")
include("serialization-to-jso")
include("simple-wasm-application")
include("tanstack-react-router")
include("tanstack-react-table")
include("tanstack-virtual-table")
include("tanstack-table-common")
include("tic-tac-toe")
include("web-components")

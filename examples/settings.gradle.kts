rootProject.name = "examples"

dependencyResolutionManagement {
    repositories {
        mavenCentral()
    }

    versionCatalogs {
        create("libs") {
            val kotlinVersion = extra.properties["kotlin.version"] as String?
            if (kotlinVersion != null) {
                version("kotlin", kotlinVersion)
            }
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
include("mui-materials")
include("react-svg")
include("react-lazy-modules-webpack")
include("serialization-to-jso")
include("simple-wasm-application")
include("tanstack-react-router")
include("tanstack-react-router-nodejs-test")
include("tanstack-react-table")
include("tanstack-virtual-table")
include("tanstack-table-common")
include("tic-tac-toe")
include("web-components")

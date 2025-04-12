rootProject.name = "karakum-legacy"

dependencyResolutionManagement {
    repositories {
        mavenCentral()
    }

    versionCatalogs {
        create("libs") {
            val kotlinVersion = extra["kotlin.version"] as String
            plugin("kotlin-multiplatform", "org.jetbrains.kotlin.multiplatform").version(kotlinVersion)
            plugin("kotlin-jsPlainObjects", "org.jetbrains.kotlin.plugin.js-plain-objects").version(kotlinVersion)
        }

        create("kfc") {
            val kfcVersion = extra["kfc.version"] as String
            plugin("library", "io.github.turansky.kfc.library").version(kfcVersion)
        }
    }
}

include("actions-kotlin")
include("browser-kotlin")
include("cesium-kotlin")
include("csstype-kotlin")
include("popper-kotlin")
include("react-kotlin")
include("react-query-kotlin")
include("react-table-kotlin")
include("react-virtual-kotlin")

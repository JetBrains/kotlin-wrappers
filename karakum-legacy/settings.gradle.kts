rootProject.name = "karakum-legacy"

dependencyResolutionManagement {
    repositories {
        mavenCentral()
    }
}

includeBuild("../generate-logic-legacy")

include("react-table-kotlin")
include("react-virtual-kotlin")

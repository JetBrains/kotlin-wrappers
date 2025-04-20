rootProject.name = "karakum-legacy"

dependencyResolutionManagement {
    repositories {
        mavenCentral()
    }
}

includeBuild("../generate-logic-legacy")

include("csstype-kotlin")
include("popper-kotlin")
include("react-query-kotlin")
include("react-table-kotlin")
include("react-virtual-kotlin")

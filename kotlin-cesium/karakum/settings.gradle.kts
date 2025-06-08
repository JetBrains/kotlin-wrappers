rootProject.name = "kotlin-cesium-karakum"

pluginManagement {
    includeBuild("../../build-logic-settings")
}

plugins {
    id("generatorbuild.settings")
}

includeBuild("../../generate-logic-legacy")

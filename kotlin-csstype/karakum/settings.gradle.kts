rootProject.name = "kotlin-csstype-karakum"

pluginManagement {
    includeBuild("../../build-logic-settings")
}

plugins {
    id("generatorbuild.settings")
}

includeBuild("../../generate-logic-legacy")

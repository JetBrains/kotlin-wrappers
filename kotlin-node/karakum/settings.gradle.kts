rootProject.name = "kotlin-node-karakum"

pluginManagement {
    includeBuild("../../build-logic-settings")
}

plugins {
    id("generatorbuild.settings")
}

includeBuild("../../build-logic")

rootProject.name = "kotlin-electron-karakum"

pluginManagement {
    includeBuild("../../build-logic-settings")
}

plugins {
    id("generatorbuild.settings")
}

includeBuild("../../build-logic")

rootProject.name = "karakum"

dependencyResolutionManagement {
    repositories {
        mavenCentral()
    }

    versionCatalogs {
        create("libs") {
            val karakumVersion = extra["karakum.version"] as String
            library("karakum", "io.github.sgrishchenko", "karakum").version(karakumVersion)

            val arrowVersion = extra["arrow-kt.version"] as String
            library("arrow-core", "io.arrow-kt", "arrow-core").version(arrowVersion)

            val kotlinVersion = extra["kotlin.version"] as String
            library("kotlin-test", "org.jetbrains.kotlin", "kotlin-test").version(kotlinVersion)

            val electronVersion = extra["electron.version"] as String
            library("electron", "npm", "electron").version(electronVersion)

            val nodeVersion = extra["node.version"] as String
            library("node", "npm", "@types/node").version(nodeVersion)
        }
    }
}

include(":kotlin-electron-karakum")
project(":kotlin-electron-karakum").projectDir = file("../kotlin-electron/karakum")

include(":kotlin-node-karakum")
project(":kotlin-node-karakum").projectDir = file("../kotlin-node/karakum")

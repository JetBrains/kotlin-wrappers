rootProject.name = "karakum"

dependencyResolutionManagement {
    repositories {
        mavenCentral()
    }

    versionCatalogs {
        create("libs") {
            val karakumVersion = extra["karakum.version"] as String
            plugin("karakum", "io.github.sgrishchenko.karakum").version(karakumVersion)
            library("karakum", "io.github.sgrishchenko", "karakum").version(karakumVersion)

            val electronVersion = extra["electron.version"] as String
            library("electron", "npm", "electron").version(electronVersion)

            val nodeVersion = extra["node.version"] as String
            library("node", "npm", "@types/node").version(nodeVersion)

            val typescriptVersion = extra["typescript.version"] as String
            library("typescript", "npm", "typescript").version(typescriptVersion)
        }
    }
}

include(":kotlin-node-karakum")
project(":kotlin-node-karakum").projectDir = file("../kotlin-node/karakum")

include(":kotlin-typescript-karakum")
project(":kotlin-typescript-karakum").projectDir = file("../kotlin-typescript/karakum")

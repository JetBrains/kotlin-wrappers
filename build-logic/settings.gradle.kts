rootProject.name = "build-logic"

dependencyResolutionManagement {
    repositories {
        mavenCentral()
        gradlePluginPortal()
    }
}

include("generatorbuild")
include("generatorlegacybuild")
include("wrappersbuild")

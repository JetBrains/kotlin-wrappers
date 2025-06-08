rootProject.name = "build-logic"

dependencyResolutionManagement {
    repositories {
        gradlePluginPortal()
    }
}

include("generatorbuild")
include("wrappersbuild")

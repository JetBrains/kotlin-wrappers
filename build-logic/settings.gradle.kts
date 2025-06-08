rootProject.name = "build-logic"

enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

dependencyResolutionManagement {
    repositories {
        mavenCentral()
        gradlePluginPortal()
    }
}

include("commonbuild")
include("generatorbuild")
include("generatorlegacybuild")
include("wrappersbuild")

plugins {
    id("wrappersbuild.kotlin-library-conventions")
}

dependencies {
    commonMainApi(projects.kotlinNode)

    commonMainApi(npm(jspkg.actions.artifact))
}

plugins {
    id("wrappersbuild.kotlin-library-conventions")
}

dependencies {
    webMainApi(projects.kotlinNode)

    webMainApi(npm(jspkg.actions.core))
}

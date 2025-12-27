plugins {
    id("wrappersbuild.kotlin-library-conventions")
}

dependencies {
    webMainApi(projects.kotlinReactCore)

    webMainApi(npm(jspkg.tanstack.reactRouter))
}

plugins {
    id("wrappersbuild.kotlin-library-conventions")
}

dependencies {
    jsMainApi(projects.kotlinReactCore)

    commonMainApi(npm(jspkg.tanstack.reactQueryDevtools))
}

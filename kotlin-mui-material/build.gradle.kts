plugins {
    id("wrappersbuild.kotlin-library-conventions")
}

dependencies {
    jsMainApi(projects.kotlinMuiBase)

    webMainApi(npm(jspkg.mui.material))
}
